import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Agregar mascotas aleatorias
        RegistroMascota.generarDatosAleatorios(30);

        //Buscar por nombre
        String nombre = "Leo";
        System.out.println("--BUSCAR POR NOMBRE (LEO)--");
        List<Mascota<?>> porNombre = RegistroMascota.buscarPorNombre(nombre);

        porNombre.forEach(System.out::println);

        //Buscar por especie
        System.out.println("\n\n--BUSCAR POR ESPECIE (GATO)--");
        String especie = "Gato";
        List<Mascota<?>> porEspecie = RegistroMascota.buscarPorEspecie(especie);
        porEspecie.forEach(System.out::println);

        //Contar cantidad de mascotas
        System.out.println("\n\nNÚMERO DE MASCOTAS REGISTRADAS : " + RegistroMascota.contarMascotas());

    }
}