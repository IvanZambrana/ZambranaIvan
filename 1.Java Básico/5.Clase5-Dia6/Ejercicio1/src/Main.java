public class Main {
    public static void main(String[] args) {
        //Crear mamífero, ave y reptil
        Mamifero mamifero = new Mamifero(1, "León Pardo", 5, "Pelaje", "Carnívoro",
                4, "Vivíparo", "Amarillo", "Savana");
        Ave ave = new Ave(2, "Águila Calva", 10, "Plumaje", "Carnívoro",
                2, "Planeador", "Negro/Blanco", "Aguila");
        Reptil reptil = new Reptil(3, "Serpiente", 3, "Escamas", "Carnívoro",
                1.5, "Escamas lisas", "Veneno neurotóxico", "Selva");

        //Mandar saludar de los diferentes animales
        mamifero.saludar();
        ave.saludar();
        reptil.saludar();

        //D)Intentar asignar un objeto de tipo "Animal" a un objeto de tipo "Mamifero" generará una excepción en tiempo de ejecución (ClassCastException)
        // ya que no es una conversión válida. Esto se debe a que un "Animal" no es necesariamente un "Mamífero"
        /*
        DESCOMENTAR LÍNEAS DE CÓDIGO PARA PROBAR
        Animal animal = new Animal(4, "Animal Genérico", 1, "Piel Genérica", "Alimentación Genérica");
        Mamifero mamifero2 = (Mamifero) animal; // Esto generará una excepción en tiempo de ejecución.
         */

        //E)Cambiar el modificador de acceso de los métodos de "public" a "private" impedirá el acceso a estos métodos desde el método "main"
        // y generará errores de compilación.
    }
}