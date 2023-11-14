<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Simple JSP Page</title>
</head>
<body>
    <%
        String name = "John";
    %>
    <h1>Hello, <%= name %>!</h1>
    <p>This is a dynamic JSP page.</p>
</body>
</html>
