package com.izambrana.ejercicio1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Vehicle {
    private Long id;
    private String brand;
    private String model;
    private int kilometers;
    private int doors;
    private double price;
}
