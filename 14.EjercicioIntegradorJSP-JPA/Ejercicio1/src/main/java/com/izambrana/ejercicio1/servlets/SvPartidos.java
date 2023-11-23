/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.izambrana.ejercicio1.servlets;

import com.izambrana.ejercicio1.logica.Controladora;
import com.izambrana.ejercicio1.logica.Partido;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ivan
 */
@WebServlet(name = "SvPartidos", urlPatterns = {"/SvPartidos"})
public class SvPartidos extends HttpServlet {
    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Obtener partidos de la Bd
        List<Partido> partidos = control.traerPartidos();
        
        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("partidos", partidos);
        
        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);     
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Obtener datos desde JSP
        String fechaIngresada = request.getParameter("fecha_partido");
        String resultadoEquipo1 = request.getParameter("resultado_equipo1");
        String resultadoEquipo2 = request.getParameter("resultado_equipo2");
        String idEquipo1 = request.getParameter("id_equipo1");
        String idEquipo2 = request.getParameter("id_equipo2");
        
        try {
            //Convertir la fecha
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyy-mm-dd");
            Date fecha = sdf.parse(fechaIngresada);
            //Crear nuevo PARTIDO
            Partido partido = new Partido();
            partido.setFecha(fecha);
            partido.setResultadoEquipo1(Integer.parseInt(resultadoEquipo1));
            partido.setResultadoEquipo2(Integer.parseInt(resultadoEquipo2));
            
            //Mandar a persistir el partido, enviado los IDs 
            control.crearPartido(partido, Long.parseLong(idEquipo1), Long.parseLong(idEquipo2));

            // Redirigir de vuelta al formulario
            request.getRequestDispatcher("index.jsp").forward(request, response);               
            
        } catch (ParseException ex) {
            Logger.getLogger(SvPartidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
