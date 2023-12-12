package com.izambrana.ejercicio1.servlets;

import java.io.IOException;
import java.io.PrintWriter;
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

    //Contador de votos
    int votosA, votosB, votosC;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvPartidos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvPartidos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        //Crear tabla que muestra los resultados
        try ( PrintWriter out = response.getWriter()) {
            out.println("<div>");
            out.println("<h1>Resultados de Votación</h1>");
            out.println("<table>");
            out.println("<tr><th>Nombre Partido</th><th>Cantidad Votos</th></tr>");
            out.println("<tr><td>Partido A</td><td>" + votosA + "</td></tr>");
            out.println("<tr><td>Partido B</td><td>" + votosB + "</td></tr>");
            out.println("<tr><td>Partido C</td><td>" + votosC + "</td></tr>");
            out.println("</table>");
            out.println("</div>");
        }
        //No cambiar de página
        response.sendRedirect(request.getContextPath() + "/index.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Obtener datos del html
        String nombre = request.getParameter("voto");

        //Controlar opciones y posibilidad de null
        if (nombre != null) {
            if (nombre.equals("partidoA")) {
                votosA++;
            } else if (nombre.equals("partidoB")) {
                votosB++;
            } else if (nombre.equals("partidoC")) {
                votosC++;
            } else {
                System.out.println("Ningun partido elegido");
            }
        } else {
            System.out.println("Partido nulo");
        }

        System.out.println("Añadido voto: " + nombre);
        System.out.println("CONTADOR VOTOS: A: " + votosA + " B: " + votosB + " C: " + votosC);

        //No cambiar de página
        response.sendRedirect(request.getContextPath() + "/index.html");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
