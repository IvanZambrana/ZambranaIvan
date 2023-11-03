// Clase realizada por Roi Baldomir
import java.time.Year;

public class Moto extends Vehiculo implements Combustion{
    // Atributos de la clase
    public int cilindrada;
    public String tipoMotor;

    // Constructores de la clase
    public Moto() {
    }

    public Moto(int id, String placa, String marca, String modelo, int ano, Double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, ano, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    // Getters y Setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    // Método implementado de la interfaz Combustion
    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible para la moto de combustión.");
    }

    // Método implementado de la clase abstracta Vehiculo
    @Override
    public int antiguedadVehiculo() {
        int year = Year.now().getValue();
        return year - getAno();
    }

    // Método toString sobrescrito para mostrar la información de la moto
    @Override
    public String toString() {
        return "ID = " + getId() +
                ", Placa = " + getPlaca() +
                ", Marca = " + getMarca() +
                ", Modelo = " + getModelo() +
                ", Año = " + getAno() +
                ", Costo = " + getCosto() +
                ", Cilindrada = " + cilindrada +
                ", Tipo de motor = " + tipoMotor;
    }
}
