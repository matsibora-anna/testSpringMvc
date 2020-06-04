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
    <c:if test="${disable == false}"> You can't delete this item! Count don't equal 0.</c:if>
    <table border="1">
        <tr>
            <th>CODE</th>
            <th>NAME</th>
            <th>PRICE</th>
            <th>NUMBER</th>
            <th>ACTIONS</th>
        </tr>

        <c:forEach var="item" items="${allitems}">

            <c:url var="updateLink" value="/item/update">
                <c:param name="itemId" value="${item.idItem}"/>
            </c:url>

            <c:url var="deleteLink" value="/item/delete">
                <c:param name="itemId" value="${item.idItem}"/>
            </c:url>

            <tr>
                <td>${item.codeItem}</td>
                <td>${item.nameItem}</td>
                <td>${item.priceItem}</td>
                <td>${item.numberItem}</td>
                <td><button><a href="${updateLink}">Update</a></button></td>
                <td><button><a href="${deleteLink}" onclick="if(!(confirm('Are you sure want to delete the item?'))) return false;">Delete</a></button></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
