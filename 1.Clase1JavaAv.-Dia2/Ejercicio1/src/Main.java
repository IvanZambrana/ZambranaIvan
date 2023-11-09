public class Main {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();
        try {
            reservas.reservarVuelo();
        } catch (ReservaInvalidaException e) {
            System.out.println("Error en la reserva: " + e.getMessage());
        }
    }
}