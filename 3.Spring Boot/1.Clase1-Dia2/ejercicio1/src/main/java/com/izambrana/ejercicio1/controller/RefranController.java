package com.izambrana.ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class RefranController {

    //Creamos lista de refranes
    private static final List<String> refranes = Arrays.asList(
            "No hay mal que por bien no venga",
            "Al que madruga Dios lo ayuda",
            "Más vale tarde que nunca",
            "La paciencia es amarga, pero sus frutos son dulces",
            "A caballo regalado no se le mira el dentado",
            "Más vale prevenir que lamentar",
            "Quien mucho abarca, poco aprieta",
            "Cuando el río suena, agua lleva",
            "Más vale pájaro en mano que cien volando",
            "Camarón que se duerme, se lo lleva la corriente",
            "Dime con quién andas y te diré quién eres",
            "La suerte está echada",
            "En boca cerrada no entran moscas",
            "A mal tiempo, buena cara",
            "El que mucho abarca, poco aprieta",
            "A quien madruga, Dios lo ayuda",
            "Camarón que se duerme, se lo lleva la corriente",
            "Más vale ser cabeza de ratón que cola de león",
            "La avaricia rompe el saco",
            "No dejes para mañana lo que puedes hacer hoy"
    );

    //Método para obtener refreanes aleatorios
    @GetMapping("/refran")
    public String obtenerRefran(){
        Random random = new Random();
        int i = random.nextInt(refranes.size());
        return refranes.get(i);
    }
}
