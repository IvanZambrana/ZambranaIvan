public class Main {
    public static void main(String[] args) {
        int numTrabajadores = 5;

        for (int i = 1; i <= numTrabajadores; i++) {
            Thread trabajador = new Thread(new Trabajador(i));
            trabajador.start();
        }
    }
}