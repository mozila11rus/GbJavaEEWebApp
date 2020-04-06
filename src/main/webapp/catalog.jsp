<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
    <title>Catalog</title>
</head>
<body>
    <h1>Каталог товаров</h1>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
        </tr>
        <c:forEach items="${products}" var ="prod">
        <tr>
            <td>${prod.id}</td>
            <td>${prod.name}</td>
        </tr>
        </c:forEach>
</body>
</html>
