<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
  <%--    <link rel="stylesheet" type="text/css" href="css/style.css">--%>
</head>
<body>
<h1>Currency Converter</h1>
<form method="post" action="converter.jsp">
  <label>Rate: </label><br>
  <input type="text" name="rate" placeholder="rate" value="22000"><br>
  <label>USD: </label><br>
  <input type="text" name="usd" placeholder="USD" value="0"><br>
  <input type="submit" id="submit" value="Convert">
</form>
</body>
</html>