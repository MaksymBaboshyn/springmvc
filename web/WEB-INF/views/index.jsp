<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<a href="<%=request.getContextPath()%>?language=en">EN</a>
<a href="<%=request.getContextPath()%>?language=ru">RU</a>

<html>

<head>
    <title>Index Page</title>
</head>

<body>
<form:form method="post" modelAttribute="userJSP" action="check-user">

    <spring:message code="name"/> : <form:input path="name"/> <br/>
    Password: <form:input path="password"/> <br/>
    <form:button>Next Page</form:button>

</form:form>

</body>

</html>