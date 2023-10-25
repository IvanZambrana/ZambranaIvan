import java.util.Objects;
import java.util.Scanner;

//TRABAJO REALIZADO JUNTO A ROBERTO BRAVO

/*
    ENUNCIADO
* Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:
Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").
Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2").
El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.
Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.
A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.
Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro. ¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?
El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.
* */
public class Main {
    public static void main(String[] args) {
        //Crear matriz
        char[][] mapaAsientos = new char[5][5];
        //Inicamos scanner
        Scanner scanner = new Scanner(System.in);
        //Comprobación
        String salir = "s";

        //Iniciar mapa con todos los asientos libres (O)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mapaAsientos[i][j] = 'O';
            }
        }

        //Mensaje de bienvenida
        System.out.println("Bienvenido al sistema de reservas de asientos del teatro," +
                " a continuación se mostrarán los asientos libres representados con una 'O':");

        while (true) {
            //Muestra asientos libres
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("\t" + mapaAsientos[i][j]);
                }
                System.out.println("\n");
            }

            //Pedir fila
            System.out.println("Por favor introduzca número de fila (1-5)");
            int fila = scanner.nextInt();

            //Manejo de error del usuario
            while (fila < 1 || fila > 5) {
                System.out.println("Número erroneo, por favor introduzca un número del 1 al 5");
                fila = scanner.nextInt();
            }

            //Pedir asiento
            System.out.println("Por favor introduzca número de asiento (1-5)");
            int asiento = scanner.nextInt();

            //Manejo de error del usuario
            while (asiento < 1 || asiento > 5) {
                System.out.println("Número erroneo, por favor introduzca un número del 1 al 5");
                asiento = scanner.nextInt();
            }

            //Comprobar asiento vacío
            if (mapaAsientos[fila - 1][asiento - 1] == 'X') {
                System.out.println("El asiento ya está ocupado");
            } else {
                //Ocupar asiento
                mapaAsientos[fila - 1][asiento - 1] = 'X';
                System.out.println("Asiento reservado con exito en fila: " + fila + " asiento: " + asiento);

                //Preguntar al usuario si quiere continuar reservando
                System.out.println("¿Deseas seguir reservando asientos?(s/n)");
                salir = scanner.next();
                while (!salir.equals("s") && !salir.equals("n")) {
                    System.out.println("-ERROR- Por favor, solo escriba 's' (si desea continuar) o 'n' (si desea salir)");
                    salir = scanner.next();
                }
                if (salir.equals("n")) {
                    System.out.println("Saliendo del programa");
                    break;
                }
            }

        }
    }
}