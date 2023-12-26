package com.izambrana.ejercicio1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlatoDTO {
    /*private Long id;
    private String nombre;
    private List<IngredienteDTO> ingredientes;
    private double totalCalorias;
    private IngredienteDTO ingredienteMaxCalorias;*/
    private int id;
    private String nombre;
    private List<Integer> ingredientes;
}
