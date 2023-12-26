package com.izambrana.ejercicio1.repository;

import com.izambrana.ejercicio1.model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Repository
public class VehicleRepository {
    
    //Lista donde se van a guardar los vehiculos
    private static final List<Vehicle> vehiculos = new ArrayList<>();
    private static Long nextId = 1L;
    
    //Método para guardar vehículo
    public Vehicle save(Vehicle vehiculo) {
        vehiculo.setId(nextId++);
        vehiculos.add(vehiculo);
        return vehiculo;
    }
    
    //Método que deveulve la lista de vehiculos al completo
    public List<Vehicle> findAll(){
        return vehiculos;
    }
    
    //Método que encuentra un vehiculo por id
    public Vehicle findById(Long id) {
        return vehiculos.stream()
                .filter(vehicle -> vehicle.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Ordenar la lista por precio de menor a mayor
    public List<Vehicle> findAllSortedByPrice() {
        List<Vehicle> sortedVehicles = new ArrayList<>(vehiculos);
        Collections.sort(sortedVehicles, Comparator.comparingDouble(Vehicle::getPrice));

        return sortedVehicles;
    }
}
