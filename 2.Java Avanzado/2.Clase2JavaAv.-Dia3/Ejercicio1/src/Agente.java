public class Agente implements Runnable {
    //Atributos
    private CentroAtencionCliente centro;
    private String nombre;

    //Constructor
    public Agente(CentroAtencionCliente centro, String nombre) {
        this.centro = centro;
        this.nombre = nombre;
    }

    //Sobreescribir el método run de la interfaz Runnable
    @Override
    public void run() {
        while (true) {
            Llamada llamada = centro.atenderLlamada();
            if (llamada == null) {
                break;
            }
            System.out.println(nombre + " atiende la llamada de " + llamada.getNombreCliente());
            // Simular atención de la llamada
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
            System.out.println(nombre + " ha terminado de atender la llamada de " + llamada.getNombreCliente());
        }
    }
}
