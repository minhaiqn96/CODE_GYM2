<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/5/2019
  Time: 9:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%
    Map<String, String> dic = new HashMap<>();
    dic.put("apple", "qua tao");
    dic.put("love", "tinh yeu");
    dic.put("romantic", "lang man");

    String seach = request.getParameter("enterword");
    String result = dic.get(seach);

    if (result != null) {
        out.print("Word: " + seach + "<br>");
        out.print("Result: " + result);
    } else {
        out.print("Not Found");
    }
%>
</body>
</html>
