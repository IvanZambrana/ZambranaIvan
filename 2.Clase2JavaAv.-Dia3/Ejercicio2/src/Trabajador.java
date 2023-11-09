public class Trabajador implements Runnable {
    //Atributos
    private int id;

    //Constructor
    public Trabajador(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println("Trabajador " + id + " está listo para trabajar.");

            // Simulación de ensamblaje
            System.out.println("Trabajador " + id + " está ensamblando un producto.");
            Thread.sleep(2000); // Simulación de tiempo de ensamblaje
            System.out.println("Trabajador " + id + " ha ensamblado un producto.");

            // Simulación de control de calidad
            System.out.println("Trabajador " + id + " está realizando un control de calidad.");
            Thread.sleep(1000); // Simulación de tiempo de control de calidad
            System.out.println("Trabajador " + id + " ha completado el control de calidad.");

            // Simulación de embalaje
            System.out.println("Trabajador " + id + " está embalando un producto.");
            Thread.sleep(1500); // Simulación de tiempo de embalaje
            System.out.println("Trabajador " + id + " ha embalado un producto.");

            System.out.println("Trabajador " + id + " ha terminado su turno.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
