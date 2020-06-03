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
<button><a href="/item/new">Add new item!!!</a></button>
<table border="1">
    <tr>
        <th>CODE</th>
        <th>NAME</th>
        <th>PRICE</th>
        <th>NUMBER</th>
    </tr>
<c:forEach var="item" items="${allitems}">
    <c:url var="updateLink" value="/item/update">
        <c:param name="itemId" value="${item.idItem}"/>
    </c:url>
    <tr>
        <td>${item.codeItem}</td>
        <td>${item.nameItem}</td>
        <td>${item.priceItem}</td>
        <td>${item.numberItem}</td>
        <td><button><a href="${updateLink}">Update item!!!</a></button></td>
    </tr>
</c:forEach>
</table>
</body>
</html>
