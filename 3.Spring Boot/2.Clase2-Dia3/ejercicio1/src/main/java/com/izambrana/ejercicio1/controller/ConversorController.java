package com.izambrana.ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    //Función conversora, usa localhost:8080/conversor?cm=257 (o cualquier número) para probar
    @GetMapping("/conversor")
    public String convertirAMetros(@RequestParam int cm){
        double m = cm / 100.0;
        return String.format("%d cm equivalente a  %.2f metros", cm, m);
    }
}
