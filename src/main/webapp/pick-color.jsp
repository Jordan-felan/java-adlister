<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <title>Pick Color</title>
</head>
<body>

<h1>Pick Color</h1>

<form action="/pickcolor" method="POST">
    <input type="text" name="color" placeholder="Enter desired background color">
    <button>Submit</button>
</form>

</body>
</html>