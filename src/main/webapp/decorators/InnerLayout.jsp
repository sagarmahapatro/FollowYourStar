<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title><decorator:title default="Follow Your Star" /></title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<c:set var="contextPath" value="${pageContext.request.contextPath}"
	scope="session"></c:set>
<decorator:head />
<link rel="stylesheet" href="${contextPath}/css/bootstrap.min.css"></link>
<link rel="stylesheet" href="${contextPath}/css/bootstrap-theme.min.css"></link>
</style>
<link rel="stylesheet" href="${contextPath}/css/skin.css"></link>
</head>
<body>
	<!--  -->
	<s:set name="currentUser" value="#session['user']" />
	<nav id="myNavbar"
		class="navbar navbar-default navbar-inverse navbar-fixed-top"
		role="navigation">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#navbarCollapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Follow Your Star</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="navbarCollapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="http://www.tutorialrepublic.com"
						target="_blank">Home</a></li>
					<li><a href="http://www.tutorialrepublic.com/about-us.php"
						target="_blank">About</a></li>
					<li><a href="http://www.tutorialrepublic.com/contact-us.php"
						target="_blank">Contact</a></li>
					<s:if test="%{#session.user != null}">
						<s:if test="%{#session.user.isAuthonticated = true}">
							<s:url id="logoutUrl" action="logout" />
							<li><s:a href="%{logoutUrl}">Log Out</s:a> </a></li>
						</s:if>
					</s:if>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li class="active"><a href="#">Overview <span
							class="sr-only">(current)</span></a></li>
					<li><a href="#">Reports</a></li>
					<li><a href="#">Analytics</a></li>
					<li><a href="#">Export</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="">Nav item</a></li>
					<li><a href="">Nav item again</a></li>
					<li><a href="">One more nav</a></li>
					<li><a href="">Another nav item</a></li>
					<li><a href="">More navigation</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="">Nav item again</a></li>
					<li><a href="">One more nav</a></li>
					<li><a href="">Another nav item</a></li>
				</ul>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<div id="debugLayer">
					<decorator:body />
				</div>

			</div>
		</div>
		<hr>
		<div class="row">
			<div class="col-xs-12">
				<footer>
					<div id="footerStyle">
						<%@ include file="footer.jsp"%>
					</div>
				</footer>
			</div>
		</div>
	</div>

	<script src="${contextPath}/javascript/jquery-1.11.3.js"></script>
	<script src="${contextPath}/javascript/bootstrap.min.js"></script>
</body>
</html>
