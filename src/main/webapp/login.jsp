<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        } else {
            response.sendRedirect("/login.jsp");
        }
    }
%>

<html>
<head>
    <title>Login</title>
    <%@include file="partials/head.jsp"%>
</head>
<body>
<%@include file="partials/nav-bar.jsp"%>
<h1>Hello! Please log in!</h1>
<form method="post" action="/login.jsp">
    <div class="form-group">
        <label for="username">Username</label>
        <input type="text" class="form-control" name="username" id="username" aria-describedby="username" placeholder="Enter username">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<%@include file="partials/scripts.jsp"%>
</body>
</html>