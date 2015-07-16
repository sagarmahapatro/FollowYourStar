<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<div id="mainContent">

	<h1>Welcome To Follow Your Star WebSite</h1>

	<p>Using This WebApp You Can Vote Your Favorite Contestant In A
		Particular Event, You Can Follow Your Favorite Contestant and Create A Campaign To Promote Them.
		To Know More About Other Features Please Visit This Link <a href="#"></a> </p>

	<span id="loginPanel">
		<s:url id="login" action="login" />
		<s:a href="%{login}" class="btn btn-success">Sign In</s:a>
		Or
		<s:url id="registration" action="registration" />
		<s:a href="%{registration}" class="btn btn-success">Register</s:a>
	</span>

</div>
