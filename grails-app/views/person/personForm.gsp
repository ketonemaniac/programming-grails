<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Welcome to Grails</title>
	</head>
	<body>
		<g:form action="save" >
		    <label for="lastName">Last Name</label>
		    <g:textField name="lastName"/>
		    <br/>
		    <label for="firstName">First Name</label>
		    <g:textField name="firstName"/>
		    <br/>
		    <label for="age">Age</label>
		    <g:textField name="age"/>
		    <br/>
		    <g:submitButton name="create" value="Save" />
		</g:form>
	</body>
</html>