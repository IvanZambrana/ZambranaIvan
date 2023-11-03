//Clase creada por Iván Zambrana
public class Camioneta extends Vehiculo implements Combustion {
    //Atributo
    private int capacidadTanque; //El litros
    private double consumoCombustible; //En litros por kilometro

    //Constructor
    public Camioneta(int id, String placa, String marca, String modelo, int año, double costo, int capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }


    //Getters y Setters
    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    //Método abstracto de Vehiculo
    @Override
    public int antiguedadVehiculo() {
        return 2023 - getAno();
    }

    //Metodode interfaz Combustion
    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible para la camioneta de combustión.");
    }

    @Override
    public String toString() {
        return "ID = " + getId() +
                ", Placa = " + getPlaca() +
                ", Marca = " + getMarca() +
                ", Modelo = " + getModelo() +
                ", Año = " + getAno() +
                ", Costo = " + getCosto() +
                ", Capacidad tanque = " + capacidadTanque +
                ", Consumo combustible = " + consumoCombustible;
    }
}
