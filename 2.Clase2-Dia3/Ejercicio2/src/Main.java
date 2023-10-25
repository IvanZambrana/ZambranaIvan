import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        int i = 1;
        double total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("--CAJERO DE SUPERMERCADO--");

        while (true){
            System.out.println("Ingrese precio del producto número "
                    + i + " (pulse 0 para finalizar): ");
            double precio = scanner.nextDouble();

            if (precio == 0) {
                break;
            }
            i++;
            total += precio;
        }

        System.out.println("El total de la compra es: " + total +" €");
    }
}