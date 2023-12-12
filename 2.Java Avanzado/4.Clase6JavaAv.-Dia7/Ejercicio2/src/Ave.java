public class Ave extends Mascota{
    //Atributo propio
    private String tipoAve;

    //Constructor
    public Ave(Long id, String nombre, int edad, String especie, String tipoAve) {
        super(id, nombre, edad, especie);
        this.tipoAve = tipoAve;
    }
    @Override
    public String toString() {
        return "Ave{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", especie='" + getEspecie() + '\'' +
                ", raza='" + tipoAve + '\'' +
                '}';
    }
}
