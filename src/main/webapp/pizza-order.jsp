<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*"%>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>

<form action="/pizza-order" id="pizzaform" method="POST">

    <label for="fname">Firstname:</label>
    <input type="text" id="fname" name="fname">

    <label for="crust">Choose crust:</label>
    <select name="crust" id="crust" form="pizzaform">
        <option value="thinandcrispy">Thin and Crispy</option>
        <option value="handtossed">Hand Tossed</option>
        <option value="pan">Pan</option>
        <option value="stuffedcrust">Stuffed Crust</option>
    </select>

    <label for="sauce">Choose sauce:</label>
    <select name="sauce" id="sauce" form="pizzaform">
        <option value="nosauce">No Sauce</option>
        <option value="light">Light</option>
        <option value="regular">Regular</option>
        <option value="heavy">Heavy</option>
    </select>

    <label for="size">Choose size:</label>
    <select name="size" id="size" form="pizzaform">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>

    <input type="submit">

</form>

</body>
</html>