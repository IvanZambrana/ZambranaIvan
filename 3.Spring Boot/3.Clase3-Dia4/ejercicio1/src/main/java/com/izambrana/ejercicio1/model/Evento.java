package com.izambrana.ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Evento {
    private int id;
    private String titulo;
    private String descripcion;
    private String fecha;
    private String hora;
    private String lugar;
    private String ponente;
}
