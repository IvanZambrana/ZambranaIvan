public class Main {
    public static void main(String[] args) {
        //Crear lista de vestimentas
        Vestimenta[] vestimentas = new Vestimenta[9];

        //3 zapatos
        vestimentas[0] = new Zapato(1, "Zapato Deportivo", 99.99, "Nike", "42", "Negro", "Cuero", "Cordones");
        vestimentas[1] = new Zapato(2, "Zapato Formal", 149.99, "Adidas", "41", "Marrón", "Piel Sintética", "Hebilla");
        vestimentas[2] = new Zapato(3, "Zapato Casual", 69.99, "Umbro", "43", "Azul", "Lona", "Cordones");

        //3 pantalones
        vestimentas[3] = new Pantalon(4, "Pantalón Vaquero", 59.99, "Levi's", "32", "Azul", "Slim Fit", "Denim");
        vestimentas[4] = new Pantalon(5, "Pantalón Chino", 45.99, "Dockers", "30", "Beige", "Regular Fit", "Algodón");
        vestimentas[5] = new Pantalon(6, "Pantalón Deportivo", 29.99, "Puma", "34", "Gris", "Corte Recto", "Poliéster");

        //2 camisetas
        vestimentas[6] = new Camiseta(7, "Camiseta Manga Corta", 19.99, "H&M", "M", "Blanca", "Corta", "Redondo");
        vestimentas[7] = new Camiseta(8, "Camiseta Manga Larga", 24.99, "Zara", "L", "Negra", "Larga", "V");

        //1 sombrero
        vestimentas[8] = new Sombrero(9, "Sombrero de Paja", 39.99, "Brixton", "Talla única", "Marrón", "Paja", "Única");

        //Recorremos lista mostrando el mensaje
        for (Vestimenta vestimenta : vestimentas) {
            vestimenta.mostrarMensaje();
        }
    }
}