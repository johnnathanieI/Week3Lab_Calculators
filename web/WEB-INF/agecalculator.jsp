<%-- 
    Document   : agecalculator
    Created on : 29-Jan-2023, 1:47:10 AM
    Author     : johnn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age"><br>
            <input type="submit" value="Age next birthday"><br>
            <span>${ageoutput}</span>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
