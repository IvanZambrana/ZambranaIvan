package com.izambrana.ejercicio1.persistencia;

import com.izambrana.ejercicio1.logica.Equipo;
import com.izambrana.ejercicio1.logica.Partido;
import com.izambrana.ejercicio1.logica.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan
 */
public class ControladoraPersistencia {
    EquipoJpaController equipoJPA = new EquipoJpaController();
    PartidoJpaController partidoJPA= new PartidoJpaController();
    
    //Para Equipo
     public void crearEquipo(Equipo equipo) {
        equipoJPA.create(equipo);
    }
    
    public void eliminarEquipo(Long id) {
        try {
            equipoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Equipo> traerEquipos() {
        return equipoJPA.findEquipoEntities();
    }
    
    public void editarEquipo(Equipo equipo) {
        try {
            equipoJPA.edit(equipo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    
    public Equipo ObtenerEquipo(Long id) {
        return equipoJPA.findEquipo(id);
    }    
    
    
     //Para Partido
    public void crearPartido(Partido partido) {
        partidoJPA.create(partido);
    }
    
    public void eliminarPartido(Long id) {
        try {
            partidoJPA.destroy(id);
        } catch (com.izambrana.ejercicio1.persistencia.exceptions.NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Partido> traerPartidos() {
        return partidoJPA.findPartidoEntities();
    }
    
    public void editarPartido(Partido partido) {
        try {
            partidoJPA.edit(partido);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
