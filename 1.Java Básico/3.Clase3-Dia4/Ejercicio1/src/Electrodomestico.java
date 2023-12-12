public class Electrodomestico {
    //Atributos de la clase
    private int cod;
    private String marca;
    private String modelo;
    private char consumoEnergetico;
    private String color;

    //Constructor
    public Electrodomestico(int cod, String marca, String modelo, char consumoEnergetico, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumoEnergetico = consumoEnergetico;
        this.color = color;
    }

    //Constructor vacío
    public Electrodomestico() {

    }

    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
}
