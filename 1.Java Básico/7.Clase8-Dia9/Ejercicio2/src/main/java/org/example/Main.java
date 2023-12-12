package org.example;

import org.example.logica.Platillo;
import org.example.persistencia.ControladoraPersistencia;

public class Main {
    public static void main(String[] args) {
        ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia ();

        //Crear 3 objetos platillos
        Platillo platillo1 = new Platillo (1, "Croquetas", "Harina, agua, cebolla, huevo, pan rayado, aceite", 8.0);
        Platillo platillo2 = new Platillo (2, "Paella valenciana", "Arroz, tomate, judía, conejo, pollo, pimiento", 18.0);
        Platillo platillo3 = new Platillo (3, "Lasaña", "Harina, agua, tomate, carne, queso", 6.0);

        //Añadir a la base de datos
        controladoraPersistencia.crearPlatillo(platillo1);
        controladoraPersistencia.crearPlatillo(platillo2);
        controladoraPersistencia.crearPlatillo(platillo3);

        //Eliminar luego uno y editar los datos de otro mediante JPA.
        controladoraPersistencia.eliminarPlatillo(1);

        //Editar datos de un platillo
        platillo3.setNombre("Lasagne");

        controladoraPersistencia.editarPlatillo(platillo3);
    }
}