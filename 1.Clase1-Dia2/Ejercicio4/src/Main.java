import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        int num1, num2;
        double suma, resta, multiplicacion, division;

        //Solicitar info al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        //Cálculos
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;


        //Mostrar información
        System.out.println("--RESULTADOS--");
        System.out.println("Suma-> " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta-> " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicación-> " + num1 + " * " + num2 + " = " + multiplicacion);

        //*Extra* Si num2 = 0, el resultado de la división es infinito
        //Para evitar esto, podemos crear un if (si num2 = 0, no se creará la división)
        if (num2 != 0) {
            division = (double) num1 / num2;
            System.out.println("División-> " + num1 + " / " + num2 + " = " + division);
        }

    }
}