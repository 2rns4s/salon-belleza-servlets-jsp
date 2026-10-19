# Salón de Belleza - Java Servlets & JSP

Aplicación web Java con arquitectura MVC tradicional:
- **Vista inicial (HTML):** `index.html` con formulario POST para agendar citas.
- **Controlador (Servlet):** `CitaServlet.java` (`@WebServlet("/agendar-cita")`) extiende `HttpServlet`, procesa la solicitud POST y almacena datos en el alcance de petición.
- **Vista de respuesta (JSP):** `resultado.jsp` recibe la petición despachada por el Servlet e imprime los datos dinámicamente mediante Expression Language (EL).

## Estructura del Proyecto

```
salon-belleza-servlets-jsp/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── salonbelleza/
        │           ├── Main.java
        │           └── web/
        │               └── CitaServlet.java
        └── webapp/
            ├── WEB-INF/
            │   └── web.xml
            ├── index.html
            └── resultado.jsp
```

## Cómo abrirlo y ejecutarlo en IntelliJ IDEA

1. Abre IntelliJ IDEA y selecciona **Open** -> apunta a la carpeta `salon-belleza-servlets-jsp` (el archivo `pom.xml`).
2. Espera a que IntelliJ IDEA importe el proyecto Maven y descargue las dependencias de Tomcat embebido.
3. Abre `src/main/java/com/salonbelleza/Main.java` y ejecútalo como una aplicación Java (`Run 'Main.main()'`) o play en IntelliJ IDEA directamente.
4. Cuando aparezca el mensaje `Tomcat iniciado en el puerto 8080`, ingresa a `http://localhost:8080/`.
5. Para agendar una cita, completa el formulario y envíalo. El servlet procesará la solicitud y mostrará el resultado en el jsp al que se redirecciona después de que el POST sale bien.
