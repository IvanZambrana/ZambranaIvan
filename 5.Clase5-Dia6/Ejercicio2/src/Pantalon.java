public class Pantalon extends Vestimenta{
    //Atributos
    private String estilo;
    private String tipoTejido;

    //Constructor
    public Pantalon(int codigo, String nombre, double precio, String marca, String talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    //Método mostrarMensaje
    @Override
    public void mostrarMensaje() {
        System.out.println("Estos pantalones son de marca: " + getEstilo());
    }

    //Getters y Setters
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoTejido() {
        return tipoTejido;
    }

    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }
}
