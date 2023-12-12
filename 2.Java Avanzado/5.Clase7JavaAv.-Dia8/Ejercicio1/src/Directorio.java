import java.util.ArrayList;
import java.util.List;

public class Directorio {
    //Atributos
    String nombre;
    List<Directorio> subdirectorios;
    List<String> archivos;

    //Constructor
    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    //Método par agregar subdirectorios
    public void agregarSubdirectorio(Directorio subdirectorio) {
        this.subdirectorios.add(subdirectorio);
    }

    //Método para agregar archivos
    public void agregarArchivos(List<String> nuevosArchivos) {
        this.archivos.addAll(nuevosArchivos);
    }
}
