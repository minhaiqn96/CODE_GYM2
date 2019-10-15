<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/10/2019
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Condiment</title>
</head>
<body>
<h1>List Condiment</h1>
<c:forEach items="${condiments}" var="condiment">
    ${condiment}
</c:forEach>
</body>
</html>