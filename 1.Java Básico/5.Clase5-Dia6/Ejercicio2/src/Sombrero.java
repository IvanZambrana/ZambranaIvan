public class Sombrero extends Vestimenta {
    //Atributos
    private String tipo;
    private String tamaño;

    //Constructor
    public Sombrero(int codigo, String nombre, double precio, String marca, String talla, String color, String tipo, String tamaño) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    //Método mostrarMensaje
    @Override
    public void mostrarMensaje() {
        System.out.println("Este sombrero es de marca: " + getTipo());
    }

    //Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
