package com.izambrana.ejercicio1.service;

import com.izambrana.ejercicio1.model.Vehicle;
import com.izambrana.ejercicio1.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public void addVehiculo(Vehicle vehiculo) {
        vehicleRepository.save(vehiculo);
    }

    public List<Vehicle> getVehiculos() {
        return vehicleRepository.findAll();
    }

    public List<Vehicle> getVehiculosDesc() {
        return vehicleRepository.findAllSortedByPrice();
    }

    public Vehicle getVehiculoPorId(Long id) {
        return vehicleRepository.findById(id);
    }
}
