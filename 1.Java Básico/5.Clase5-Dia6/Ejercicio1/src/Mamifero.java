public class Mamifero extends Animal {
    //Atributos
    private int numeroPatas;
    private String tipoReproduccion;
    private String colorPelaje;
    private String habitat;

    //Constructor
    public Mamifero(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int numeroPatas, String tipoReproduccion, String colorPelaje, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un mamífero.");
    }

    //Getters y Setters
    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
