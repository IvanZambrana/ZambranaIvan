public class Reptil extends Mascota{
    //Atributo propio
    private String tipoReptil;

    //Constructor

    public Reptil(Long id, String nombre, int edad, String especie, String tipoReptil) {
        super(id, nombre, edad, especie);
        this.tipoReptil = tipoReptil;
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", especie='" + getEspecie() + '\'' +
                ", raza='" + tipoReptil + '\'' +
                '}';
    }
}
