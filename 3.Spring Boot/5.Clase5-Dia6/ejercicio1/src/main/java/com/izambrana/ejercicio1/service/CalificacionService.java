package com.izambrana.ejercicio1.service;

import com.izambrana.ejercicio1.model.Calificacion;
import com.izambrana.ejercicio1.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class CalificacionService {

    private List<Calificacion> calificaciones = new ArrayList<>();

    private final EstudianteService estudianteService;

    public CalificacionService(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;

        Estudiante estudiante1 = estudianteService.getEstudiantes().get(0);
        Estudiante estudiante2 = estudianteService.getEstudiantes().get(1);


        calificaciones.add(new Calificacion(1L, 8.5, 9.0, 7.8, estudiante1));
        calificaciones.add(new Calificacion(2L, 9.2, 8.8, 9.5, estudiante2));
    }

    public Calificacion getCalificacion(Long numMatricula) {
        return calificaciones.stream()
                .filter(calificacion -> calificacion.getId().equals(numMatricula))
                .findFirst()
                .orElse(null);
    }
    public List<Calificacion> getCalificacionesDesc() {
        calificaciones.sort(Comparator.comparingDouble(Calificacion::getPromedio).reversed());
        return calificaciones;
    }

}
