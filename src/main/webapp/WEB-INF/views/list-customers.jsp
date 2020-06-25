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
    <h1>List Customers</h1>
    <button><a href="/customer/new">Add new customer!!!</a></button>
    <table border="1">
        <tr>
            <th>CODE</th>
            <th>NAME</th>
            <th>ADDRESS</th>
            <th>DISCOUNT</th>
            <th>ACTIONS</th>
        </tr>

        <c:forEach var="customer" items="${allcustomers}">

            <c:url var="updateLink" value="/customer/update">
                <c:param name="customerId" value="${customer.idCustomer}"/>
            </c:url>

            <tr>
                <td>${customer.codeCustomer}</td>
                <td>${customer.nameCustomer}</td>
                <td>${customer.addressCustomer}</td>
                <td>${customer.discountCustomer}</td>
                <td><button><a href="${updateLink}">Update</a></button></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
