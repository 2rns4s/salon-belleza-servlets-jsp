package com.salonbelleza.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/agendar-cita")
public class CitaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Configuración para admitir caracteres especiales como tildes y eñes
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String nombreCliente = request.getParameter("nombreCliente");
        String servicio = request.getParameter("servicio");
        String fecha = request.getParameter("fecha");
        String hora = request.getParameter("hora");

        // Almacenamos los datos en el alcance (scope) de la petición para que la vista JSP pueda leerlos
        request.setAttribute("cliente", nombreCliente);
        request.setAttribute("servicio", servicio);
        request.setAttribute("fecha", fecha);
        request.setAttribute("hora", hora);

        // Despachamos internamente la petición hacia resultado.jsp conservando el ciclo de vida del request
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
