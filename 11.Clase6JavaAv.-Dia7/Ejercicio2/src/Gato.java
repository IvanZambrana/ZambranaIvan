public class Gato extends Mascota {
    //Atributo propio
    private String raza;

    //Constructor
    public Gato(Long id, String nombre, int edad, String especie, String raza) {
        super(id, nombre, edad, especie);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", especie='" + getEspecie() + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
}
