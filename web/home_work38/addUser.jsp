<%--
  Created by IntelliJ IDEA.
  User: Angelina
  Date: 25.01.2024
  Time: 5:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<form action="/addUser" method="post">
    Id: <input type="text" name="id"> <br>
    Login: <input type="text" name="login"> <br>
    Age: <input type="text" name="age"> <br>
    <br/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
