package com.izambrana.ejercicio3.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraductorController {

    //Como prueba, puedes usar el siguiente enlace: localhost:8080/morse?frase=Hola Mundo
    @GetMapping("/morse")
    public String traducirAMorse(@RequestParam String frase){
        String traduccion = traducir(frase);
        return String.format("<pre>'%s' => %s</pre>", frase, traduccion); //Uso de <pre> (preformateado) para conservar espacios y/o saltos de línea
    }

    private String traducir(String frase){
        //Pasamos palabra a mayúscula para manejarla
        frase = frase.toUpperCase();

        //Creamos un StringBuilder en el que guardaremos los char en morse
        StringBuilder morse = new StringBuilder();
        for(char c: frase.toCharArray()){
            String caracterMorse = getMorse(c);
            morse.append(caracterMorse);
        }
        return morse.toString();
    }

    //Método con un switch para traducir los caracteres a morse
    private String getMorse(char c) {
        switch (c) {
            case 'A':
                return ".-";
            case 'B':
                return "-...";
            case 'C':
                return "-.-.";
            case 'D':
                return "-..";
            case 'E':
                return ".";
            case 'F':
                return "..-.";
            case 'G':
                return "--.";
            case 'H':
                return "....";
            case 'I':
                return "..";
            case 'J':
                return ".---";
            case 'K':
                return "-.-";
            case 'L':
                return ".-..";
            case 'M':
                return "--";
            case 'N':
                return "-.";
            case 'O':
                return "---";
            case 'P':
                return ".--.";
            case 'Q':
                return "--.-";
            case 'R':
                return ".-.";
            case 'S':
                return "...";
            case 'T':
                return "-";
            case 'U':
                return "..-";
            case 'V':
                return "...-";
            case 'W':
                return ".--";
            case 'X':
                return "-..-";
            case 'Y':
                return "-.--";
            case 'Z':
                return "--..";
            case '0':
                return "-----";
            case '1':
                return ".----";
            case '2':
                return "..---";
            case '3':
                return "...--";
            case '4':
                return "....-";
            case '5':
                return ".....";
            case '6':
                return "-....";
            case '7':
                return "--...";
            case '8':
                return "---..";
            case '9':
                return "----.";
            case ' ': //Controlamos si existe un espacio
                return "   "; //Lo sustituimos por tres espacios (la mayoría de navegadores sustituyen varios espacios juntos por uno, por eso he usado <pre>)
            default:
                return "ERROR";
        }
    }
}
