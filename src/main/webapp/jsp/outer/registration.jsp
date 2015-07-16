<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<div id="mainContent">
	<s:actionerror theme="bootstrap"/>
    <s:actionmessage theme="bootstrap"/>
    <s:fielderror theme="bootstrap"/>
	<h1>Registration Form</h1>
	<div id="registrationPanel">
	<s:form action="updateUser" method="post"  theme="bootstrap" ssClass="form-horizontal"
                    label="Please Fill The Form And Click Submit Button To Register">
        <s:textfield label="First Name" name="firstName" cssClass="input-xlarge" tooltip="Enter your first Name here" />
		<s:textfield label="Last Name" name="lastName"  cssClass="input-xlarge" tooltip="Enter your first Name here"/>
		<s:textfield label="Email Address" name="email" cssClass="input-xlarge" tooltip="Enter your first Name here"/>
		<s:password label="Password" name="password"  cssClass="input-xlarge" tooltip="Enter your first Name here"/>
		<s:submit value="Register" />
	</s:form>
	</div>

</div>
