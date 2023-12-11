<%--
  Created by IntelliJ IDEA.
  User: Angelina
  Date: 11.12.2023
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body {
        background-color: #495057;
    }

    form {
        background-color: #8bb9fe;
    }

    p {
        background-color: darkred;
        color: white;
    }
</style>
<head>
    <title>Save Request</title>
</head>
<body>
<form action="/save_request" method="post">
    Name: <input type="text" name="name"> <br>
    E-mail: <input type="text" name="email"> <br>
    City: <input type="text" name="city"> <br>
    Number: <input type="text" name="number"> <br>
    <br/>
    <input type="submit" value="Submit"/>
</form>
<% String error = request.getParameter("error");
    if (error != null && !error.isEmpty()){
%>
    <p><%=error%></p>
<%

    }
%>
</body>
</html>
