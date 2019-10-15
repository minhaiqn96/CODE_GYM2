<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/10/2019
  Time: 11:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/caculator" method="post">
    <h1>CACULATOR</h1>
    <fieldset style="width: 600px">
        <legend><h3>Caculator Interface</h3></legend>
        <table>
            <tr>
                <td><h4>First Operand</h4></td>
                <td><input type="text" name="firstOperand" placeholder="Enter the first operand"></td>
                <td><h4>Second Operand</h4></td>
                <td><input type="text" name="secondOperand" placeholder="Enter the second operand"></td>
            </tr>
        </table>
        <input type="submit" name="calculator" value="+">
        <input type="submit" name="calculator" value="-">
        <input type="submit" name="calculator" value="*">
        <input type="submit" name="calculator" value="/">
    </fieldset>
</form>
<h3>${firstOperand} ${calculator} ${secondOperand} = ${result}</h3>
</body>
</html>
