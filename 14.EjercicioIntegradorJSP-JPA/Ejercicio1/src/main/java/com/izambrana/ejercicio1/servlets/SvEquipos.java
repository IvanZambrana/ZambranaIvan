package com.izambrana.ejercicio1.servlets;

import com.izambrana.ejercicio1.logica.Controladora;
import com.izambrana.ejercicio1.logica.Equipo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ivan
 */
@WebServlet(name = "SvEquipos", urlPatterns = {"/SvEquipos"})
public class SvEquipos extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Obtener equipos de BD
        List<Equipo> equipos = control.traerEquipos();
        
        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("equipos", equipos);
        
        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);  
                
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         //Tomamos datos del JSP
        String nombre = request.getParameter("nombre_equipo");
        String ciudad = request.getParameter("ciudad_equipo");
        
        //Crea un nuevo objeto Equipo
        Equipo equipo = new Equipo();
        
        //Añadir atributos
        equipo.setNombre(nombre);
        equipo.setCiudad(ciudad);
        
        //Se persiste el equipo en la BD
        control.crearEquipo(equipo);
        
        // Redirigir de vuelta al index
        response.sendRedirect("index.jsp");  
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
