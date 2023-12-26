package com.izambrana.ejercicio1.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.izambrana.ejercicio1.dto.IngredienteDTO;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Service
public class IngredienteService {
    private List<IngredienteDTO> ingredientesDTO;

    public IngredienteService() {
        // Inicializa la lista de ingredientes al cargar la clase
        ingredientesDTO = loadIngredientsDataBase();
    }

    public List<IngredienteDTO> loadIngredientsDataBase() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:data/ingredients.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<IngredienteDTO>> typeRef = new TypeReference<>() {};
        List<IngredienteDTO> ingreDTO= null;
        try {
            ingreDTO= objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingreDTO;
    }
    public IngredienteDTO findIngredienteById(int idIngrediente) {
        return ingredientesDTO.stream()
                .filter(ingrediente -> ingrediente.getId() == idIngrediente)
                .findFirst()
                .orElse(null);
    }

}
