import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int numeroDias = 7;
        double[] temperaturasMaximas = new double[numeroDias];

        // Ingresar las temperaturas máximas de la última semana
        for (int i = 0; i < numeroDias; i++) {
            System.out.print("Ingrese la temperatura máxima del día " + (i + 1) + ": ");
            temperaturasMaximas[i] = scanner.nextDouble();
        }

        // Calcular el promedio de las temperaturas
        double sumaTemperaturas = 0;
        for (int i = 0; i < numeroDias; i++) {
            sumaTemperaturas += temperaturasMaximas[i];
        }

        double promedio = sumaTemperaturas / numeroDias;

        // Mostrar el resultado por pantalla
        System.out.println("La temperatura máxima promedio de la última semana es: " + promedio + " ºC");

    }
}