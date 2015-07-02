<%@taglib prefix="s" uri="/struts-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Index</title>
<s:head />
</head>
<body>
	<h1>Welcome Follow Your Star Application</h1>
	<s:url id="login" action="login"  />
	<s:a href="%{login}">Please Click Here To LogIn:</s:a>
	<s:url id="registration" action="registration"  />
	<br></br>
	<s:a href="%{registration}">Please Click Here To Create Account:</s:a>
</body>
</html>