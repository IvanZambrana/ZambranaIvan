import java.util.Date;
import java.util.Scanner;

public class Reservas {
    //Número de asientos disponibles (Supongamos que son 100)
    private int asientosDisponibles = 100;

    //Método para reservar vuelo
    public void reservarVuelo() throws ReservaInvalidaException {
        Scanner scanner = new Scanner(System.in);
        //Pedimos al usuario los datos para la reserva
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Destino: ");
        String destino = scanner.nextLine();

        System.out.print("Fecha: ");
        String fecha = scanner.nextLine();

        System.out.print("Número de asientos deseados: ");
        int numAsientos = scanner.nextInt();
        //En caso de que falte algún dato
        if (nombre == null || destino == null || fecha == null || numAsientos <= 0) {
            throw new ReservaInvalidaException("Falta información esencial o número de asientos no válido");
        }

        //En caso de que no haya asientos disponibles
        if (numAsientos > asientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles para la reserva.");
        }

        asientosDisponibles -= numAsientos;
        System.out.println("Reserva exitosa para "
                + nombre + " con destino a "
                + destino + " en la fecha "
                + fecha + " para "
                + numAsientos + " asiento(s).");
    }
}
