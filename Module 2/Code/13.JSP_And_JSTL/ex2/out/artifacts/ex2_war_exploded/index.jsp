<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/5/2019
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<h1 style="text-align: center">Simple Caculator</h1>
<form method="post" action="/calculator">
    <fieldset style="width: 500px">
        <legend>Calculator</legend>
        <table>
            <tr>
                <th>First operand:</th>
                <td><input type="text" name="first_operand"></td>
            </tr>
            <tr>
                <th>Operator:</th>
                <td>
                    <select name="operator">
                        <option value="+">Addition</option>
                        <option value="-">Subtraction</option>
                        <option value="*">Multiplication</option>
                        <option value="/">Division</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Second operand:</th>
                <td><input type="text" name="second_operand"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Caculator"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
