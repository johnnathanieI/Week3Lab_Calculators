<%-- 
    Document   : airthmeticcalculator
    Created on : 29-Jan-2023, 3:03:49 AM
    Author     : johnn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" name="submit" value="+">
            <input type="submit" name="submit" value="-">
            <input type="submit" name="submit" value="*">
            <input type="submit" name="submit" value="%"><br>
            <span>Result: ${numoutput}</span>
            <a href="age">Age Calculator</a>
        </form>
    </body>
</html>
