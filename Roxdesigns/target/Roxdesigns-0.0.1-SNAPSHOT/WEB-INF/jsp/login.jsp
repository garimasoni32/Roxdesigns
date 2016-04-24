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
		<title>Roxdesigns</title>
	</head>
	<body id="top">
	<header id="home">
          <nav>
            <div class="container-fluid">
              <div class="row">
                <div class="col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-2 col-xs-8 col-xs-offset-2">
                  <nav class="pull">
                    <ul class="top-nav">
                      <li><a href="#intro">Introduction <span class="indicator"><i class="fa fa-angle-right"></i></span></a></li>
                      <li><a href="#features">Features <span class="indicator"><i class="fa fa-angle-right"></i></span></a></li>
                      <li><a href="#responsive">Responsive Design <span class="indicator"><i class="fa fa-angle-right"></i></span></a></li>
                      <li><a href="#portfolio">Portfolio <span class="indicator"><i class="fa fa-angle-right"></i></span></a></li>
                      <li><a href="#team">Team <span class="indicator"><i class="fa fa-angle-right"></i></span></a></li>
                      <li><a href="#contact">Get in Touch <span class="indicator"><i class="fa fa-angle-right"></i></span></a></li>
                    </ul>
                  </nav>
                </div>
              </div>
            </div>
          </nav>
          
           <section class="hero" id="hero">
            <div class="container">
              <div class="row">
                <div class="col-md-12 text-right navicon">
                  <a id="nav-toggle" class="nav_slide_button" href="#"><span></span></a>
                </div>
              </div>
              <div class="row">
                <div class="col-md-8 col-md-offset-2 text-center inner">
                  <h1 class="animated fadeInDown">Rox<span>Designs</span></h1>
                  <p class="animated fadeInUp delay-05s">A way to create beautiful <em>things</em></p>
                </div>
              </div>
          
                          
              <div class="row">
                <div class="col-md-6 col-md-offset-3 text-center">
                <form action="j_security_check" method="post">
				<table style="width:300px; margin:100px auto;">
					<tr>
						<td>UserName:</td><td><input type="text" name="j_username"></td>
					</tr>
					<tr>
						<td>Password:</td><td><input type="password" name="j_password"></td>
					</tr>
					<tr>
						<td colspan="2" style="text-align:center;"><input type="submit" class="learn-more-btn" value="Get Started"></td>
					</tr>
				</table>
			</form>
                 
                </div>
              </div>
            </div>
          </section>
	
	
	</body>
</html>
