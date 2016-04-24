<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
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
		<title>Details</title>
	</head>
	<body id="top">
	 <section class="intro text-center section-padding" id="intro">
		<div>
			<h1>Detail</h1>
			<div>
				<table align="center">
					<tr>
						<th>Image:</th>
						<td><img src="image?diagramId=<%=request.getAttribute("diagramId") %>"></td>
					</tr>
					<tr>
						<th>Title:</th>
						<td><%=request.getAttribute("title") %></td>
					</tr>
					<tr>
						<th>Description:</th>
						<td><%=request.getAttribute("description") %></td>
					</tr>
				</table>
			</div>
			<hr>
			<h2>Comments</h2>
			<% for(Map<String,String> c: (List<Map<String,String>>)request.getAttribute("comments")) { %>
				<div style="margine:5px 50px;">
					<div><img src="<%=c.get("imageUrl") %>"> <%=c.get("userName") %></div>
					<div style="margin-left:50px; padding:5px;"><%=c.get("comment") %></div>
				</div>
			<% } %>
			<div>
				<form action="comment" method="post">
					<input type="hidden" name="diagramId" value="<%=request.getAttribute("diagramId") %>">
					<textarea name="comment" rows="5" cols="40"></textarea>
					<input type="submit" value="SUBMIT">
				</form>
			</div>
			<div>
				<a href="<%=request.getContextPath()%>/cacoo/">&lt;&lt; Back to Diagrams.</a>
			</div>
		</div>
		</section>
	</body>
</html>