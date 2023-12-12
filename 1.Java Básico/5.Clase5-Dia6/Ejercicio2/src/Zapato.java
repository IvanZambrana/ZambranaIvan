public class Zapato extends Vestimenta {
    //Atributos
    private String material;
    private String tipoCierre;

    //Constructor
    public Zapato(int codigo, String nombre, double precio, String marca, String talla, String color, String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    //Método mostrarMensaje
    @Override
    public void mostrarMensaje() {
        System.out.println("Estos zapatos son de marca: " + getMarca());
    }

    //Getters y Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }
}
