package com.izambrana.ejercicio1.model;

import lombok.*;

@Data
@NoArgsConstructor
public class Calificacion {
    private Long id;
    private Double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    private Estudiante estudiante;

    public Calificacion(Long id, Double calificacion1, double calificacion2, double calificacion3, Estudiante estudiante) {
        this.id = id;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
        this.promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0;
        this.estudiante = estudiante;
    }
}
