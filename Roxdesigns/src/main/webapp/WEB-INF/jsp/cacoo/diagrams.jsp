<%@page import="com.roxdesigns.api.CacooUtils"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/styles.css">
		<link href='http://fonts.googleapis.com/css?family=Varela+Round' rel='stylesheet' type='text/css'>
    <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
    <link href="http://netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/css/flexslider.css" rel="stylesheet" >
    <link href="<%=request.getContextPath()%>/css/styles.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/css/queries.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/css/animate.css" rel="stylesheet">
		<title>Cacoo API</title>
	</head>
	<body id="top">
	 <section class="intro text-center section-padding" id="intro">
            <div>
            <div>
				<a href="<%=request.getContextPath()%>">&lt;&lt; Back</a>
			</div>
              <div class="row">
               <div class="col-md-6 col-md-offset-3 text-center">
		<div>
			<h1>Cacoo Wireframes</h1>
			<h2>
				Welcome
				<%=request.getAttribute("userName") %>
			</h2>
			<div>
				<button onclick="location.href='create'" class="learn-more-btn"  style="font-size:150%;">Create Diagram</button>
			</div>
			 <section class="intro text-center section-padding" id="intro">
          
			
			<h2>Diagrams You have worked on:</h2>
			
              <div class="col-md-12">
		
		
				<%
  				List<Map> diagrams = (List<Map>)request.getAttribute("diagrams");  
 								if(diagrams.isEmpty()){ 
				%> 
					There is no diagrams.
				<% }else{ %>
					<table align="center">
						<tr>
							
						</tr>
					<% for(Map d : diagrams){ %>
						<tr>
							<td><a href="detail?diagramId=<%=d.get("diagramId")%>"><%=d.get("title")%></a></td>
							<!--td>
								<span class="action"><a href="editor?diagramId=<%=d.get("diagramId")%>">EDIT</a></span>
								<span class="action"><a href="copyInit?diagramId=<%=d.get("diagramId")%>">COPY</a></span>
								<span class="action"><a href="delete?diagramId=<%=d.get("diagramId")%>">DELETE</a></span>
							</td-->
						</tr>		
					<% } %>
				</table>
				<% } %>
			</div>
			</div>
			</div>
			</div>
				
			</section>
				
		
		</section>
	</body>
</html>