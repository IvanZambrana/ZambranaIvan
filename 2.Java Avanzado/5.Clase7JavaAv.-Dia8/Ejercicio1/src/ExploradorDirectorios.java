public class ExploradorDirectorios {
    public static void explorarDirectorio(Directorio directorio, int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t"); // Ajuste de espaciado para representar la jerarquía
        }
        System.out.println(directorio.getNombre());
        // Imprimir archivos del directorio actual
        for (String archivo : directorio.getArchivos()) {
            for (int i = 0; i < nivel + 1; i++) {
                System.out.print("\t"); // Ajuste de espaciado para representar la jerarquía
            }
            System.out.println("Archivo: " + archivo);
        }

        for (Directorio subdirectorio : directorio.getSubdirectorios()) {
            explorarDirectorio(subdirectorio, nivel + 1);
        }
    }
}
