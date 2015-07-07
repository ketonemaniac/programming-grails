<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Render Domain</title>
</head>
<body>
Last Name: <g:fieldValue bean="${person}" field="lastName"/><br/>
First Name: ${person.firstName} shorthand<br/>
Age: <g:fieldValue bean="${person}" field="age"/><br/>
</body>
</html>