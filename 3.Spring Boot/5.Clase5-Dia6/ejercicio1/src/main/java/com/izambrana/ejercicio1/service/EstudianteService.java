package com.izambrana.ejercicio1.service;

import com.izambrana.ejercicio1.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteService {
    private List<Estudiante> estudiantes = new ArrayList<>();

    public EstudianteService() {
        estudiantes.add(new Estudiante(1L, "Iván", "Zambrana", "09-02-1997"));
        estudiantes.add(new Estudiante(2L, "Maria", "Moreno", "24-01-2001"));
    }
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

}
