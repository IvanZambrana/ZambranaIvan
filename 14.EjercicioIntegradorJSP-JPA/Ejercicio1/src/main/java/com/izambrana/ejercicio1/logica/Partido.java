
package com.izambrana.ejercicio1.logica;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ivan
 */
@Entity
public class Partido implements Serializable {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;
    private Date fecha;
    private Integer resultadoEquipo1;
    private Integer resultadoEquipo2;    

    @ManyToOne
    private Equipo equipo1;
    
    @ManyToOne
    private Equipo equipo2;   


    //Constructores
    public Partido() {
    }

    public Partido(Date fecha, Integer resultadoEquipo1, Integer resultadoEquipo2, Equipo equipo1, Equipo equipo2) {
        this.fecha = fecha;
        this.resultadoEquipo1 = resultadoEquipo1;
        this.resultadoEquipo2 = resultadoEquipo2;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    //Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getResultadoEquipo1() {
        return resultadoEquipo1;
    }

    public void setResultadoEquipo1(Integer resultadoEquipo1) {
        this.resultadoEquipo1 = resultadoEquipo1;
    }

    public Integer getResultadoEquipo2() {
        return resultadoEquipo2;
    }

    public void setResultadoEquipo2(Integer resultadoEquipo2) {
        this.resultadoEquipo2 = resultadoEquipo2;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    //Método para formatear fecha
    public String getFechaFormateada(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        return sdf.format(fecha);
    }
    
}