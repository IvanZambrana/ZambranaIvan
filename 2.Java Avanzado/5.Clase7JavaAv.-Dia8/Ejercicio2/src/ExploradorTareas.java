public class ExploradorTareas {
    public static void explorarTarea(Tarea tarea, int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("|\t"); // (EXTRA) Agregar algo de arte
        }
        System.out.println("|-- " + tarea.getNombre());


        for (Tarea subtarea : tarea.getSubtareas()) {
            explorarTarea(subtarea, nivel + 1);
        }
    }
}
