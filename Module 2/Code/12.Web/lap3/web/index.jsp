<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/4/2019
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
<%--    <link rel="stylesheet" type="text/css" href="css/style.css">--%>
</head>
<body>
<h1>Currency Converter</h1>
<form method="post" action="/convert">
    <label>Rate: </label><br>
    <input type="text" name="rate" placeholder="rate" value="22000"><br>
    <label>USD: </label><br>
    <input type="text" name="usd" placeholder="USD" value="1"><br>
    <input type="submit" id="submit" value="Convert">
</form>
</body>
</html>
