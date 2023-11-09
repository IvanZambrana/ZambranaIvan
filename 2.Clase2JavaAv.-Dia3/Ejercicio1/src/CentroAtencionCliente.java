import java.util.ArrayList;

public class CentroAtencionCliente {
    //Atributos
    private int numAgentes;
    private ArrayList<Llamada> llamadasEnEspera;

    //Constructor
    public CentroAtencionCliente(int numAgentes) {
        this.numAgentes = numAgentes;
        this.llamadasEnEspera = new ArrayList<>();

        // Iniciar agentes
        for (int i = 1; i <= numAgentes; i++) {
            Thread agente = new Thread(new Agente(this, "Agente " + i));
            agente.start();
        }
    }

    //Método recibirLlamada
    public synchronized void recibirLlamada(Llamada llamada) {
        llamadasEnEspera.add(llamada);
        System.out.println("Llamada de " + llamada.getNombreCliente() + " en espera.");
    }

    //Método atenderLlamada
    public synchronized Llamada atenderLlamada() {
        if (llamadasEnEspera.isEmpty()) {
            return null;
        }
        return llamadasEnEspera.remove(0);
    }
}
