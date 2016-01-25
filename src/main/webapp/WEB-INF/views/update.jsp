<%--
  Created by IntelliJ IDEA.
  User: Kirill
  Date: 16.01.2016
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
  <form action="update" method="post" name="uodateContact">

    <input type="text" name="name" value="${contact.name}"><br>
    <input type="phone" name="phone" value="${contact.phone}"><br>
    <div>${contact.email}</div>
    <input type="submit" name="email" value="${contact.email}">
  </form>

</body>
</html>
