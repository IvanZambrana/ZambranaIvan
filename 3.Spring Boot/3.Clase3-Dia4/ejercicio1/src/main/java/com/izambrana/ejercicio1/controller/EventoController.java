package com.izambrana.ejercicio1.controller;

import com.izambrana.ejercicio1.model.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class EventoController {
    ArrayList<Evento> eventos = new ArrayList<>();
    int idEvento = 1;
    @GetMapping("/eventos")
    public String mostrarEventos(){
        StringBuilder resultado = new StringBuilder();
        eventos.forEach(evento -> {
            resultado.append(evento.toString()).append("<hr>");
        });
        return "<h1>EVENTOS</h1>" + resultado;
    }

    @GetMapping("/evento/{id}")
    public String mostrarEventoPorId(@PathVariable int id){
        Optional<Evento> eventoOptional = eventos.stream()
                .filter(evento -> evento.getId() == id)
                .findFirst();

        if (eventoOptional.isPresent()) {
            Evento evento = eventoOptional.get();
            return "<h1>EVENTO CON ID " + id + "</h1>" + evento.toString();
        } else {
            return "<h1>No se encontró ningún evento con ID " + id + "</h1>";
        }
    }

    @PostMapping("/evento")
    public String crearEvento(@RequestBody Evento evento){
        evento.setId(idEvento++);
        eventos.add(evento);
        return "Evento creado: " + evento.getTitulo();
    }
}
