<%--
  Created by IntelliJ IDEA.
  User: Shirley
  Date: 02/12/2023
  Time: 0:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="resources/css/main.css" type="text/css">
</head>
<body>

<%@ page import="com.shir.conversiontemperatura.model.Conversion" %>
<%
    Conversion conversion = (Conversion) request.getAttribute("c");
%>
<h1>Conversión de celsius a fahrenheit</h1>
<br>
<label>Celsius:</label>
<span><%= conversion.getC()%></span><br>
<label>Fahrenheit:</label>
<span><%= conversion.getGf()%></span><br>

<form action="" method="get">
    <input type="hidden" name="action"  value="registrar"><br>
    <input type="submit" value="Regresar">
</form>

</body>
</html>
