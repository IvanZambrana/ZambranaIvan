import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Crear un objeto directorio
        Directorio raiz = new Directorio("C:/");

        //Crear subdirectorios (1er nivel)
        Directorio sub1 = new Directorio("Archivos de programa");
        Directorio sub2 = new Directorio("Usuarios");
        Directorio sub3 = new Directorio("Windows");

        //Crear subdirectorios (2do nivel)
        Directorio sub11 = new Directorio("Adobe");
        Directorio sub12 = new Directorio("Google");
        Directorio sub13 = new Directorio("Intel");
        Directorio sub14 = new Directorio("Java");
        Directorio sub15 = new Directorio("Oracle");

        Directorio sub21 = new Directorio("Ivan");
        Directorio sub22 = new Directorio("Maria");
        Directorio sub23 = new Directorio("Invitado");

        Directorio sub31 = new Directorio("Boot");
        Directorio sub32 = new Directorio("debug");
        Directorio sub33 = new Directorio("Resources");

        //Agregar subdirectorios
        sub1.agregarSubdirectorio(sub11);
        sub1.agregarSubdirectorio(sub12);
        sub1.agregarSubdirectorio(sub13);
        sub1.agregarSubdirectorio(sub14);
        sub1.agregarSubdirectorio(sub15);

        sub2.agregarSubdirectorio(sub21);
        sub2.agregarSubdirectorio(sub22);
        sub2.agregarSubdirectorio(sub23);

        sub3.agregarSubdirectorio(sub31);
        sub3.agregarSubdirectorio(sub32);
        sub3.agregarSubdirectorio(sub33);

        raiz.agregarSubdirectorio(sub1);
        raiz.agregarSubdirectorio(sub2);
        raiz.agregarSubdirectorio(sub3);

        //Agregar archivos
        sub21.agregarArchivos(List.of("documento.txt", "imagen.jpg"));
        sub33.agregarArchivos(List.of("Programa.exe", "Virus.exe"));
        sub1.agregarArchivos(List.of("bd.sql", "perro.png"));

        //Mostrar
        ExploradorDirectorios.explorarDirectorio(raiz, 0);
    }
}