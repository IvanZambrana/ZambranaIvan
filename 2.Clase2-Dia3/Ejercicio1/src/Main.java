import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        int edad = 0, edadMinima = 18;

        //Inciar scanner y solicitar info al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();

        //Condición
        if (edad < 18){
            System.out.println("Acceso restringido para menores de edad");
        } else {
            System.out.println("Acceso concedido para mayores de edad");
        }
    }
}