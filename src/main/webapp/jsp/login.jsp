<%@taglib prefix="s" uri="/struts-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Index</title>
<s:head />
</head>
<body>
	<h6>Log In user</h6>
	<s:form  action="outhaction" method="post" >
		<s:textfield label="Email Address" name="email" />
		<s:password label="Password" name="password" />
		<br></br>
		<s:submit value="Register" />
	</s:form>
</body>
</html>