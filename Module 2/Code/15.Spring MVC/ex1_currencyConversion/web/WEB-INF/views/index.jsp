<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/9/2019
  Time: 12:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert USD</title>
</head>
<body>
<form method="post" action="/viewVND">
    <h1>Convert USD</h1>
    <fieldset>
        <legend>Convert information</legend>
        <table>
            <tr>
                <td>USD</td>
                <td><input type="text" name="usd"></td>
            </tr>
            <tr>
                <td>Rate:</td>
                <td><input type="text" name="rate"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Convert"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>