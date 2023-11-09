public class Main {
    public static void main(String[] args) {
        GestionDatos gestion = new GestionDatos(5);

        //Añadimos datos
        gestion.almacenarDato(0, "Dato 1");
        gestion.almacenarDato(1, "Dato 2");
        gestion.almacenarDato(2, "Dato 3");

        //Accedemos a datos
        gestion.accederDato(1); // Acceso exitoso
        gestion.accederDato(5); // Intento de acceso a una posición inválida

    }
}