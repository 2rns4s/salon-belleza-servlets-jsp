# Salón de Belleza - Java Servlets & JSP

Aplicación web clásica construida en Java con arquitectura MVC tradicional:
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
2. Configura tu servidor de aplicaciones local (ejemplo: **Apache Tomcat 10+** para compatibilidad con la especificación Jakarta EE).
3. Añade el artefacto `salon-belleza-servlets-jsp:war exploded` al despliegue de Tomcat.
4. Ejecuta el servidor e ingresa a `http://localhost:8080/salon-belleza-servlets-jsp/`.
