<%--
  Created by IntelliJ IDEA.
  User: Kirill
  Date: 08.01.2016
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Index</title>
  </head>
  <body>
    <table width="300" border="1">
      <thead>
        <tr>
          <th width="100">Name</th>
          <th width="100">Phone</th>
          <th width="100">Email</th>
          <th width="100">Dellete</th>
          <th width="100">Update</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${contacts}" var="contact">
          <tr>
            <td>${contact.name}</td>
            <td>${contact.phone}</td>
            <td>${contact.email}</td>
            <td>
              <form action="dellete" name="dellete" method="post">
                <input type="submit" name="submit" value="${contact.email}" />
              </form>
            </td>
            <td>
              <form action="update" name="update" method="get">
                <input type="submit" name="submit" value="${contact.email}" />
              </form>
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>


  <a href='new'>New contact</a>
  </body>
</html>