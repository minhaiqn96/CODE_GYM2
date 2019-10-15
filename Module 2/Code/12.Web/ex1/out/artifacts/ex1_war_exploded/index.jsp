<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/4/2019
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body>
<div id="content">
    <h1>Product Discount Calculator</h1>
    <form method="post" action="/productcaculator">
        <div id="data">
            <label>Product Description:</label><br>
            <input type="text" name="description"><br>
            <label>List Price: </label><br>
            <input type="text" name="price"><br>
            <label>Discount Percent: </label><br>
            <input type="text" name="discount_percent">(%)<br>
        </div>
        <div id="buttons">
<%--            <label>&nbsp</label>--%>
            <input type="submit" value="Caculator Discount">
        </div>
    </form>
</div>
</body>
</html>
