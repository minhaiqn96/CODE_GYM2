<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Product</title>
</head>
<body>
<h1>Product</h1>
<p>
    <a href="/products">Back to list Products</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Describe</td>
        <td>producer</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <tr>
        <td>
            <a href="/products?action=view&id=${requestScope["product"].getId()}">${requestScope["product"].getName()}</a>
        </td>
        <td>${requestScope["product"].getPrice()}</td>
        <td>${requestScope["product"].getDescribe()}</td>
        <td>${requestScope["product"].getProducer()}</td>
        <td><a href="/products?action=edit&id=${requestScope["product"].getId()}">Edit</a></td>
        <td><a href="/products?action=delete&id=${requestScope["product"].getId()}">Delete</a></td>
    </tr>
</table>
</body>
</html>
