<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Seach Product</title>
</head>
<body>
<h1>Seach Product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <table border="1">
        <tr>
            <td>Name: </td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Search product"></td>
        </tr>
    </table>
</form>
</body>
</html>