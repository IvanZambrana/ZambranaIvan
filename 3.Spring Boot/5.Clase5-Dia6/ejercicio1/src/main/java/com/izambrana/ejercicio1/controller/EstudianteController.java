package com.izambrana.ejercicio1.controller;

import com.izambrana.ejercicio1.model.Estudiante;
import com.izambrana.ejercicio1.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;
    @GetMapping("/estudiantes")
    public List<Estudiante> obtenerEstudiantes(){
        return estudianteService.getEstudiantes();
    }

}
