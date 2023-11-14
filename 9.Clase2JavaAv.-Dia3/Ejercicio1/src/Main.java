public class Main {
    public static void main(String[] args) {
        //Iniciamos centro de atención al cliente con 3 agentes
        CentroAtencionCliente centro = new CentroAtencionCliente(3);

        //Creamos un for con 20 clentes que recorreremos para que sean atendidos
        for (int i = 1; i <= 20; i++) {
            Llamada llamada = new Llamada("Cliente " + i);
            centro.recibirLlamada(llamada);
        }
    }
}