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
    <title>Add new item</title>
</head>
<body>
    <h1>Create new item</h1>
    <div>
        <form:form action="saveItem" method="post" modelAttribute="item">
            <form:hidden path="idItem"/>
            <div>
                <label>Code</label>
                <div>
                    <form:input path="codeItem"/>
                </div>
            </div>
            <div>
                <label>Name</label>
                <div>
                    <form:input path="nameItem"/>
                </div>
            </div>
            <div>
                <label>Price</label>
                <div>
                    <form:input path="priceItem"/>
                </div>
            </div>
            <div>
                <label>Category</label>
                <div>
                    <form:input path="categoryItem"/>
                </div>
            </div>
            <div>
                <label>Number</label>
                <div>
                    <form:input path="numberItem"/>
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
