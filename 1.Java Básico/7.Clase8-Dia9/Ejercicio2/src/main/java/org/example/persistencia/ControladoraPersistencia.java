package org.example.persistencia;

import org.example.logica.Platillo;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    PlatilloJpaController platilloJpa = new PlatilloJpaController();


    public void crearPlatillo(Platillo platillo) {
        platilloJpa.create(platillo);
    }

    public void eliminarPlatillo(int id) {
        platilloJpa.destroy(id);
    }

    public List<Platillo> listarPlatillos() {
        return platilloJpa.findPlatilloEntities();
    }

    public void editarPlatillo(Platillo platillo) {
        platilloJpa.edit(platillo);
    }
}
