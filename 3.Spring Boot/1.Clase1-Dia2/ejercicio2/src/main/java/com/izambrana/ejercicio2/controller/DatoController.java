package com.izambrana.ejercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class DatoController {
    //Creamos lista de refranes
    private static final List<String> datos = Arrays.asList(
            "Los pulpos tienen tres corazones y azul.",
            "Las abejas pueden reconocer rostros humanos.",
            "En promedio, una persona pasa seis meses de su vida esperando semáforos en rojo.",
            "El corazón de una ballena azul es tan grande que una persona podría nadar dentro de sus arterias.",
            "El ajedrez se inventó en la India.",
            "El 10% de la población mundial es zurda.",
            "Un grupo de flamencos se llama 'parada'.",
            "En promedio, una persona parpadea alrededor de 15-20 veces por minuto.",
            "El plátano es una bayas, pero las fresas no lo son.",
            "Las vacas tienen mejores amigas y pueden sentirse estresadas cuando se separan.",
            "Los pingüinos tienen una sola pareja de por vida.",
            "Las jirafas no tienen cuerdas vocales.",
            "Hay más combinaciones posibles en un juego de ajedrez que átomos en el universo observable.",
            "Los koalas tienen huellas dactilares similares a las humanas.",
            "El sonido no puede viajar a través del espacio porque necesita un medio, como el aire o el agua.",
            "El ojo humano puede distinguir más de 10 millones de colores.",
            "Las cucarachas pueden vivir varias semanas sin cabeza antes de morir de hambre.",
            "El miércoles es el día más productivo de la semana.",
            "Los elefantes son los únicos mamíferos que no pueden saltar.",
            "El hielo es el único material natural que es menos denso en estado sólido que en estado líquido."

    );

    //Método para obtener datos aleatorios
    @GetMapping("/dato")
    public String obtenerDato(){
        Random random = new Random();
        int i = random.nextInt(datos.size());
        return datos.get(i);
    }
}
