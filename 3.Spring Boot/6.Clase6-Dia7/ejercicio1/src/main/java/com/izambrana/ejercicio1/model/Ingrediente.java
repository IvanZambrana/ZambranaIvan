package com.izambrana.ejercicio1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ingrediente {
    private Long codigoIngrediente;
    private String nombre;
    private int cantidadCalorias;
}
