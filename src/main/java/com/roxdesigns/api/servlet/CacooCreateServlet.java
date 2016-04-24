package com.roxdesigns.api.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;

import com.roxdesigns.api.CacooUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/*
 * Create a new diagram and redirect to the edit page.
 * https://cacoo.com/api_create_diagram
 * https://cacoo.com/api_editor_token
 */
public class CacooCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try{
			HttpResponse res;
			JsonElement json;
			JsonObject root;
			
			// step-1 : create diagram
			res = CacooUtils.cacooApi(req, resp, "api/v1/diagrams/create.json", null);
			if(res==null){
				// OAuth authentication is required.
				return;
			}
			json = CacooUtils.httpResponse2json(res);
			root = json.getAsJsonObject();
			String diagramId = root.get("diagramId").getAsString();
			
			// step-2 : get authentication token to open editing page
			res = CacooUtils.cacooApi(req, resp, "api/v1/diagrams/"+diagramId+"/editor/token.json", null);
			if(res==null){
				// OAuth authentication is required.
				return;
			}
			json = CacooUtils.httpResponse2json(res);
			root = json.getAsJsonObject();
			String editorToken = root.get("token").getAsString();
			
			// step-3 : redirect to editing page.
			resp.sendRedirect(CacooUtils.editorLink(diagramId, editorToken, "", req));
		}catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("message", e.getMessage());
			req
			.getRequestDispatcher("/WEB-INF/jsp/cacoo/error.jsp")
			.forward(req, resp);
		}
	}
}
