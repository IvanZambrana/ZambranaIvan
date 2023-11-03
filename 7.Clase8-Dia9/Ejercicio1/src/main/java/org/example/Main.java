package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EstudianteDAO estudianteDAO = new EstudianteDAO();

        // Agregar un estudiante
        Estudiante nuevoEstudiante = new Estudiante(1,"Juan Perez", 20, 8.5);
        estudianteDAO.agregarEstudiante(nuevoEstudiante);

        // Recuperar la lista de estudiantes
        List<Estudiante> estudiantes = estudianteDAO.obtenerEstudiantes();

        // Mostrar la información de los estudiantes
        for (Estudiante estudiante : estudiantes) {
            System.out.println("ID: " + estudiante.getId());
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
            System.out.println("Calificación: " + estudiante.getCalificacion());
            System.out.println();
        }
    }
}