package com.izambrana.ejercicio1.controller;

import com.izambrana.ejercicio1.model.Calificacion;
import com.izambrana.ejercicio1.service.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {

    @Autowired
    private CalificacionService calificacionService;
    @GetMapping("/{numMatricula}")
    public Calificacion obtenerCalificacion(@PathVariable Long numMatricula){
        return calificacionService.getCalificacion(numMatricula);
    }

    @GetMapping("/ordendesc")
    public List<Calificacion> obtenerCalificacionesDesc(){
        return calificacionService.getCalificacionesDesc();
    }
}
