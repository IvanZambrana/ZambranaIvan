public class Perro extends Mascota{
    //Atributo propio
    private String raza;

    //Constructor
    public Perro(Long id, String nombre, int edad, String especie, String raza) {
        super(id, nombre, edad, especie);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", especie='" + getEspecie() + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
}
