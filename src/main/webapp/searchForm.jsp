<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Search</title>
</head>
<body>
<%--<form method="post" action="tutorials/getTutorial.action">
    <input id="language" name="language">
    <input type="submit">
</form>--%>

<s:form action="tutorials/getTutorial">
    <s:textfield label="Enter the language you want to search for"  key="language"/>
    <s:submit />
</s:form>

</body>
</html>
