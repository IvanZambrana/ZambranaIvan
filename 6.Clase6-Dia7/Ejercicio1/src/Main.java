// Clase realizada por Roi Baldomir
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creación del ArrayList de Vehículos
        List<Vehiculo> vehiculos = new ArrayList<>();

        // Creación de los objetos de los diferentes tipos de vehículos
        Vehiculo moto = new Moto(1, "1111-JHG", "Honda", "Honda RC500", 2005, 8000.0, 500, "Combustión");
        Vehiculo auto = new Auto(2, "2839-FHG","Tesla", "Tesla Model 3", 2020, 50000, 170, 629);
        Vehiculo camioneta = new Camioneta(3, "8392-GHF", "Nissan", "Nissan C5000", 1998, 12000, 70, 8);

        // Añadido de los objetos al ArrayList
        vehiculos.add(moto);
        vehiculos.add(auto);
        vehiculos.add(camioneta);

        // Se recorre el ArrayList de Vehículos y se muestra toda la información de ellos
        for (Vehiculo vehiculo: vehiculos) {
            System.out.println(vehiculo.toString() +", Antiguedad vehículo = "+vehiculo.antiguedadVehiculo());
            if (vehiculo.getClass().getName().equals("Moto") || vehiculo.getClass().getName().equals("Camioneta")) {
                ((Combustion) vehiculo).recargarCombustible(); // Casteo de la interfaz Combustion para permitir el uso del método
            }else {
                ((Electrico) vehiculo).cargarEnergia(); // Casteo de la interfaz Electrico para permitir el uso del método
            }
        }
    }
}