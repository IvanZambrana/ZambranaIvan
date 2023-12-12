public class Camiseta extends Vestimenta {
    //Atributos
    private String manga;
    private String cuello;

    //Constructor
    public Camiseta(int codigo, String nombre, double precio, String marca, String talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    //Método mostrarMensaje
    @Override
    public void mostrarMensaje() {
        System.out.println("Esta camiseta es de marca: " + getManga());
    }

    //Getters y Setters
    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }
}
