<%@ page import="java.io.File" %><%--
  Created by IntelliJ IDEA.
  User: Angelina
  Date: 03.12.2023
  Time: 3:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Download file</title>
</head>
<body>
<h1>List of books</h1>
<ul>
  <%
    final String dirPath = "C:/Users/Angelina/archive_book/";
    File dir = new File(dirPath);
    File[] files = dir.listFiles();
    for (File file : files) {
      if (file.isFile()) {
  %>
  <li><a href="book?fileName=<%= file.getName() %>"><%= file.getName() %></a></li>
  <%
      }
    }
  %>
</ul>
</body>
</html>
