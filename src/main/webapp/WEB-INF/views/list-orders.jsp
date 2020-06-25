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
    <h1>List Orers</h1>
    <button><a href="/order/new">Add new oder!!!</a></button>
    <table border="1">
        <tr>
            <th>CODE</th>
            <th>NAME</th>
            <th>CATEGORY</th>
            <th>PRICE</th>
            <th>NUMBER</th>
            <th>ACTIONS</th>
        </tr>

        <c:forEach var="order" items="${alloders}">

            <c:url var="updateLink" value="/order/list">
                <c:param name="orderId" value="${order.idOrer}"/>
            </c:url>

            <tr>
                <td>${order.codeOrer}</td>
                <td>${order.nameOrer}</td>
                <td>${order.categoryOrer}</td>
                <td>${order.priceOrer}</td>
                <td>${order.numberOrer}</td>
                <td><button><a href="${updateLink}">Update</a></button></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
