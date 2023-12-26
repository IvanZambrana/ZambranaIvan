package com.izambrana.ejercicio1.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class IngredienteDTO {
    private int id;
    private String name;
    private int calories;

    @JsonCreator
    public IngredienteDTO(
            @JsonProperty("id") int id,
            @JsonProperty("name") String name,
            @JsonProperty("calories") int calories) {
        this.id = id;
        this.name = name;
        this.calories = calories;
    }
}
