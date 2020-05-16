<%--
  Created by IntelliJ IDEA.
  User: anna
  Date: 16.05.20
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Items</h1>

<table border="1">
    <tr>
        <th>CODE</th>
        <th>NAME</th>
        <th>PRICE</th>
    </tr>
<c:forEach var="item" items="${allitems}">
    <tr>
        <td>${item.codeItem}</td>
        <td>${item.nameItem}</td>
        <td>${item.priceItem}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
