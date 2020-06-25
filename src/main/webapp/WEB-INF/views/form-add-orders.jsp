<%--
  Created by IntelliJ IDEA.
  User: anna
  Date: 17.05.20
  Time: 01:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new order</title>
</head>
<body>
    <h1>Create new order</h1>
    <div>
        <form:form action="saveOrder" method="post" modelAttribute="order">
            <form:hidden path="idOrder"/>
            <div>
                <label>Number order</label>
                <div>
                    <form:input path="numberOrder"/>
                </div>
            </div>
            <div>
                <label>Customer</label>
                <div>
                    <%--here must be list customer--%>
                    <form:select path="customerId"/>
                </div>
            </div>
            <div>
                <div>
                    <form:button>Save</form:button>
                </div>
            </div>
        </form:form>
    </div>
</body>
</html>
