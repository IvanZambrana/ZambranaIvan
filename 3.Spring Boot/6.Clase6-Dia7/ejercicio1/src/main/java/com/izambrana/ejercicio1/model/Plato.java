package com.izambrana.ejercicio1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Plato {
    private Long codigoPlato;
    private String nombre;
    private double precio;
    private List<Ingrediente> listaIngredientes;
}
