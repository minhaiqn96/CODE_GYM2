<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/10/2019
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sanwich Condiments</title>
  </head>
  <body>
  <h1>Sanwich Condiments</h1>
  <form action="/save" method="post">
    <fieldset style="width: 300px">
      <legend>Sanwich Infomation</legend>
      <table>
        <tr>
          <td><input type="checkbox" name="condiment" value="Lettuce">Lettuce</td>
          <td><input type="checkbox" name="condiment" value="Tomato">Tomato</td>
          <td><input type="checkbox" name="condiment" value="Mustard">Mustard</td>
          <td><input type="checkbox" name="condiment" value="Sprouts">Sprouts</td>
        </tr>
        <tr>
          <td><input type="submit" value="Save"></td>
        </tr>
      </table>
    </fieldset>
  </form>
  </body>
</html>
