<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/9/2019
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>DICTIONARY APPLICATION</h1>
<form method="post" action="/result">
    <fieldset style="width: 300px">
        <legend>Dictionary</legend>
        <table>
            <tr>
                <td><input type="text" name="eng" placeholder="Enter the English word..."></td>
                <td><input type="submit" value="Find"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
