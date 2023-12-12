public class Main {
    public static void main(String[] args) {
        //Variables
        int entero = 1;
        double doble = 0.5;
        boolean booleano = true;
        String cadena = "Hola";

        //Resultado mostrado por pantalla
        System.out.print("Valor de int = " + entero
                + "\nValor de double = " + doble
                + "\nValor de boolean = " + booleano
                + "\nValor de String = " + cadena
        );

        //Asignar valores de otro tipo de dato

        /*
        EN LOS SIGUIENTES CASOS DA ERROR (Descomentar líneas para verificar)
        entero = "hola";
        cadena = 1.3;
        booleano = 1;
        doble = false;
         */

        /*
        EN EL SIGUIENTE CASO NO DA ERROR PORQUE AUNQUE SEA UN DOUBLE,
        SE PUEDE INGRESAR UN INT
        */
        doble = 1;
        System.out.println("\nNuevo valor de double = " + doble);
    }
}