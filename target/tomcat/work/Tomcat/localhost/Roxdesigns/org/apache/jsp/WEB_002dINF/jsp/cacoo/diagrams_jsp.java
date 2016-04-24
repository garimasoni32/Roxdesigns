/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.30
 * Generated at: 2016-04-24 05:21:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.cacoo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.roxdesigns.api.CacooUtils;
import java.util.Map;
import java.util.List;

public final class diagrams_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/styles.css\">\r\n");
      out.write("\t\t<link href='http://fonts.googleapis.com/css?family=Varela+Round' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"http://netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/flexslider.css\" rel=\"stylesheet\" >\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/styles.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/queries.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<title>Cacoo API</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body id=\"top\">\r\n");
      out.write("\t <section class=\"intro text-center section-padding\" id=\"intro\">\r\n");
      out.write("            <div>\r\n");
      out.write("            <div>\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("\">&lt;&lt; Back</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("               <div class=\"col-md-6 col-md-offset-3 text-center\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<h1>Cacoo Wireframes</h1>\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\tWelcome\r\n");
      out.write("\t\t\t\t");
      out.print(request.getAttribute("userName") );
      out.write("\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<button onclick=\"location.href='create'\" class=\"learn-more-btn\"  style=\"font-size:150%;\">Create Diagram</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t <section class=\"intro text-center section-padding\" id=\"intro\">\r\n");
      out.write("          \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h2>Diagrams You have worked on:</h2>\r\n");
      out.write("\t\t\t\r\n");
      out.write("              <div class=\"col-md-12\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t");

  				List<Map> diagrams = (List<Map>)request.getAttribute("diagrams");  
 								if(diagrams.isEmpty()){ 
				
      out.write(" \r\n");
      out.write("\t\t\t\t\tThere is no diagrams.\r\n");
      out.write("\t\t\t\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
 for(Map d : diagrams){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"detail?diagramId=");
      out.print(d.get("diagramId"));
      out.write('"');
      out.write('>');
      out.print(d.get("title"));
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t<!--td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"action\"><a href=\"editor?diagramId=");
      out.print(d.get("diagramId"));
      out.write("\">EDIT</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"action\"><a href=\"copyInit?diagramId=");
      out.print(d.get("diagramId"));
      out.write("\">COPY</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"action\"><a href=\"delete?diagramId=");
      out.print(d.get("diagramId"));
      out.write("\">DELETE</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t</td-->\r\n");
      out.write("\t\t\t\t\t\t</tr>\t\t\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}