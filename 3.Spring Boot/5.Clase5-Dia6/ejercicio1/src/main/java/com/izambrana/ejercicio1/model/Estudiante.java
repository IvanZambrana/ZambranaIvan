package com.izambrana.ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    private Long numMatricula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
}
