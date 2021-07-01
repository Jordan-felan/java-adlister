<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%! int instanceCount = 0; %>
<%
    int localCount = 1;
    localCount += 1;
    instanceCount += 1;
%>
<html>
<head>
    <title><JSP Tags> </title>
    <%@include file="../partials/head.jsp"%>
</head>
<body>
<%@include file="../partials/nav-bar.jsp"%>

<h1 class="bg-primary">Hello There!</h1>

<h2> The local count is: <%= localCount %></h2>
<h2> The instance count is: <%= instanceCount %></h2>

<%@include file="../partials/national-parks.jsp"%>
</body>
</html>