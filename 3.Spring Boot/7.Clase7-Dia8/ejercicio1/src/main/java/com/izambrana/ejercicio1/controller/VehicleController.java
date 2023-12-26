package com.izambrana.ejercicio1.controller;

import com.izambrana.ejercicio1.model.Vehicle;
import com.izambrana.ejercicio1.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    //Agregar un nuevo automóvil
    @PostMapping("/vehicle")
    private String agregarVehiculo(@RequestBody Vehicle vehiculo){
        vehicleService.addVehiculo(vehiculo);
        return "Vehículo agregado con éxito";
    }

    //Retorna un listado de todos los autos seleccionados
    @GetMapping("/vehicles")
    public List<Vehicle> obtenerVehiculos(){
        return vehicleService.getVehiculos();
    }

    //Muestra el listado de los vehículos según los precios (de menor a mayor)
    @GetMapping("vehicles/prices")
    public List<Vehicle> obtenerVehiculosDesc(){
        return vehicleService.getVehiculosDesc();
    }

    //Muestra toda la información de un auto en particular
    @GetMapping("/vehicles/{id}")
    public Vehicle obtenerVehiculoPorId(@PathVariable Long id){
        return vehicleService.getVehiculoPorId(id);
    }

}
