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
    <title>Add new customer</title>
</head>
<body>
    <h1>Create new customer</h1>
    <div>
        <form:form action="saveCustomer" method="post" modelAttribute="customer">
            <form:hidden path="idCustomer"/>
            <div>
                <label>Code</label>
                <div>
                    <form:input path="codeCustomer"/>
                </div>
            </div>
            <div>
                <label>Name</label>
                <div>
                    <form:input path="nameCustomer"/>
                </div>
            </div>
            <div>
                <label>Address</label>
                <div>
                    <form:input path="addressCustomer"/>
                </div>
            </div>
            <div>
                <label>Discount</label>
                <div>
                    <form:input path="discountCustomer"/>
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
