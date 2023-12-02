<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Conversión Temperaturas</title>
    <link rel="stylesheet" href="resources/css/main.css" type="text/css">
</head>
<body>
<header>
<h1>Farenheit a Celsius </h1>
<br/>
</header>

<br>
<section>
    <form action="temperatura" method="post">
        <input type="hidden" name="action" value="convertir">
        <label for="celsius">Celsius:</label>
        <input type="text" id="celsius" name="celsius"><br>

        <label for="enviar">&nbsp;</label>
        <input type="submit" id="enviar" value="Convertir ahora">
    </form>
</section>

</body>
</html>