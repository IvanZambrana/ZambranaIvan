import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascota {
    //Crear lista de mascotas
    private static List<Mascota<?>> mascotas = new ArrayList<>();

    //Método para agregar mascotas al registro
    public static void agregarMascota(Mascota<?> mascota) {
        mascotas.add(mascota);
    }

    //Método para buscar mascota por nombre
    public static List<Mascota<?>> buscarPorNombre(String nombre) {
        List<Mascota<?>> listaPorNombre = new ArrayList<>();
        for (Mascota<?> mascota : mascotas) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                listaPorNombre.add(mascota);
            }
        }
        return listaPorNombre;
    }

    //Método para buscar mascota por especie
    public static List<Mascota<?>> buscarPorEspecie(String especie) {
        List<Mascota<?>> listaPorEspecie = new ArrayList<>();
        for (Mascota<?> mascota : mascotas) {
            if (mascota.getEspecie().equalsIgnoreCase(especie)) {
                listaPorEspecie.add(mascota);
            }
        }
        return listaPorEspecie;
    }

    //Método para contar la cantidad total de mascotas registradas
    public static int contarMascotas() {
        return mascotas.size();
    }

    //Método para generar datos aleatorios
    public static void generarDatosAleatorios(int n) {
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            //Para la edad se genera un número aleatorio del 1 al 15
            int edad = random.nextInt(15) + 1;

            //Switch para crear aleatoriamente Perro, Gato, Av o Reptil
            switch (random.nextInt(4)) {
                case 0:
                    agregarMascota(new Perro(new Random().nextLong(), generarNombreAleatorio(), edad, "Perro", generarRazaPerro()));
                    break;
                case 1:
                    agregarMascota(new Gato(new Random().nextLong(), generarNombreAleatorio(), edad, "Gato", generarRazaGato()));
                    break;
                case 2:
                    agregarMascota(new Reptil(new Random().nextLong(), generarNombreAleatorio(), edad, "Reptil", generarRazaReptil()));
                    break;
                case 3:
                    agregarMascota(new Ave(new Random().nextLong(), generarNombreAleatorio(), edad, "Ave", generarRazaAve()));
                    break;
            }
        }
    }
    //Método para generar nombre aleatorio
    public static String generarNombreAleatorio() {
        String[] nombres = {"Milú", "Leo", "India", "Selene", "Richi", "Forky", "Fleki", "Paquito", "Luis", "Antonio", "Simba", "Cheeto", "Lucy"};
        Random random = new Random();
        return nombres[random.nextInt(nombres.length)];
    }

    //Método para generar raza de perro aleatoria
    public static String generarRazaPerro() {
        String[] nombres = {"Chihuahua", "Carlino", "Yorkshire", "Pastor Alemán", "Pastor Belga", "Chucho", "Bichón", "Gran Danés", "Labrador", "Galgo"};
        Random random = new Random();
        return nombres[random.nextInt(nombres.length)];
    }

    //Método para generar raza de gato aleatoria
    public static String generarRazaGato() {
        String[] nombres = {"Persa", "Siamés", "Maine Coon", "Sphynx", "Burmés", "Siberiano", "Scottish Fold", "Angora", "Oriental", "Callejero"};
        Random random = new Random();
        return nombres[random.nextInt(nombres.length)];
    }

    //Método para generar tipo de reptil aleatorio
    public static String generarRazaReptil() {
        String[] nombres = {"Boa", "Vibora", "Dragoón de Comodo", "Lagarto Bético", "Cobra", "Camaleón", "Pogona", "Lagartija", "Salamanquesa", "Iguana"};
        Random random = new Random();
        return nombres[random.nextInt(nombres.length)];
    }

    //Método para generar raza de ave aleatoria
    public static String generarRazaAve() {
        String[] nombres = {"Gorrión", "Golondrina", "Jilguero", "Pinzón", "Chamarín", "Agapornis", "Periquito", "Loro", "Canario", "Águila"};
        Random random = new Random();
        return nombres[random.nextInt(nombres.length)];
    }
}
