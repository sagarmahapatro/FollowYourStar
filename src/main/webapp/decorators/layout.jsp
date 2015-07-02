<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> 
 
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
 
 
<c:set var="ctx" value="${pageContext.request.contextPath}"/> 
<%@page contentType="text/html; charset=ISO-8859-1"%> 
 
<html > 
<head> 
    <title><decorator:title default="Follow Your Star"/></title> 
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/> 
    <link rel="stylesheet" type="text/css" href="http://localhost:8080/FollowYourStar/skin.css"/> 
    <decorator:head/> 
</head> 
 
<body> 
    <table id="page-container" cellpadding="0" cellspacing="0"> 
    <tr> 
        <td colspan="2" id="page-header"> 
            <%@ include file="header.jsp"%> 
        </td> 
	</tr><tr> 
        <td id="nav-container"> 
            <%@ include file="navigation.jsp" %> 
        </td> 
        <td id="content-container"> 
            <decorator:body/> 
        </td> 
    </tr><tr> 
    <td colspan="2" id="page-footer"> 
        <%@ include file="footer.jsp" %> 
    </td> 
    </tr></table> 
</body> 
</html> 