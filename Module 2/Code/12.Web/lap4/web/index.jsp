<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/4/2019
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<head>
    <title>Simple Dictionary</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form method="post" action="/translate">
    <input text="text" name="txtSeach" placeholder="Enter the word: ">
    <input type="submit" id="submit" value="Seach">
</form>
</body>
</html>
