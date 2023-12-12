import java.util.ArrayList;
import java.util.List;

public class Tarea {
    String nombre;
    List<Tarea> subtareas;

    //Constructor
    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(List<Tarea> subtareas) {
        this.subtareas = subtareas;
    }

    //Agregar Subtareas
    public void agregarSubtarea(Tarea subtarea){
        this.subtareas.add(subtarea);
    }
}
