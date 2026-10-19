<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Confirmación de Cita - Salón de Belleza</title>
</head>
<body>
    <h1>¡Cita Registrada con Éxito!</h1>
    <p>A continuación se detallan los datos de tu reserva:</p>

    <ul>
        <!-- Obtenemos los atributos enviados por el Servlet mediante Expression Language (EL) -->
        <li><strong>Cliente:</strong> ${cliente}</li>
        <li><strong>Servicio:</strong> ${servicio}</li>
        <li><strong>Fecha:</strong> ${fecha}</li>
        <li><strong>Hora:</strong> ${hora}</li>
    </ul>

    <hr>
    <a href="index.html">← Agendar otra cita</a>
</body>
</html>
