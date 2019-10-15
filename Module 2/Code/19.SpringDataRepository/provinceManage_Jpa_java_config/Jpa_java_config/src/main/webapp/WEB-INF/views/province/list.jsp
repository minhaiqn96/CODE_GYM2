<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Provinces</title>
</head>
<body>
<a href="/create-province">Create new province</a>
<h1>Provinces</h1>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <th:block th:each="province : ${provinces}">
        <tr>
            <td th:text="${province.name}"></td>
            <td><a th:href="@{/edit-province/__${province.id}__ }">Edit</a></td>
            <td><a th:href="@{/delete-province/__${province.id}__ }">Delete</a></td>
        </tr>
    </th:block>
</table>
</body>
</html>