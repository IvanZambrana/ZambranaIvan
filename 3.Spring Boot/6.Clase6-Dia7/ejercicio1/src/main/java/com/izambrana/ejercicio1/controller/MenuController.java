package com.izambrana.ejercicio1.controller;

import com.izambrana.ejercicio1.dto.PlatoDTO;
import com.izambrana.ejercicio1.service.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
    @Autowired
private PlatoService platoService;

    @GetMapping("/plato/{nombrePlato}")
    public ResponseEntity<PlatoDTO> obtenerInfoPlato(@PathVariable String nombrePlato) {
        PlatoDTO platoDTO = platoService.obtenerInfoPlato(nombrePlato);

        if (platoDTO != null) {
            return new ResponseEntity<>(platoDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
