public class Auto {
    //Atributos
    private String marca;
    private String modelo;
    private int year;
    private double precio;

    //Constructor
    public Auto(String marca, String modelo, int year, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
    }

    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Método toString
    @Override
    public String toString() {
        return "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year='" + year + '\'' +
                ", precio=" + precio;
    }
}
