//Clase creada por Iván Zambrana
public class Auto extends Vehiculo implements Electrico {
    //Atributos
    private int capacidadBateria; //en mAh
    private int autonomia; //en horas

    //Constructor
    public Auto(int id, String placa, String marca, String modelo, int ano, double costo, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, ano, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    //Método abstracto de Vehiculo
    @Override
    public int antiguedadVehiculo() {
        return 2023 - getAno();
    }

    //Metodo de la interfaz Electrico
    @Override
    public void cargarEnergia() {
        System.out.println("Cargando energía para el auto eléctrico.");
    }

    @Override
    public String toString() {
        return "ID = " + getId() +
                ", Placa = " + getPlaca() +
                ", Marca = " + getMarca() +
                ", Modelo = " + getModelo() +
                ", Año = " + getAno() +
                ", Costo = " + getCosto() +
                ", Capacidad batería = " + capacidadBateria +
                ", Autonomía = " + autonomia;
    }
}
