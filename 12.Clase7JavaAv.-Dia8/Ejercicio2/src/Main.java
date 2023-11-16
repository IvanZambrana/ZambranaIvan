public class Main {
    public static void main(String[] args) {
        //Crear tarea raiz
        Tarea tareaPrincipal = new Tarea("Proyecto: Desarrollo de Software");

        //Crear tareas principales
        Tarea tarea1 = new Tarea("Tarea Principal: Diseño de la Aplicación");
        Tarea tarea2 = new Tarea("Tarea Principal: Implementación del Código");
        Tarea tarea3 = new Tarea("Tarea Principal: Pruebas y depuración");

        //Crear subtareas
        Tarea tarea11 = new Tarea("Subtarea: Crear Prototipo");
        Tarea tarea12 = new Tarea("Subtarea: Diseñar interfaz");
        Tarea tarea13 = new Tarea("Subtarea: Documentar Requisitos");

        Tarea tarea21 = new Tarea("Subtarea: Desarrollar Backend");
        Tarea tarea22 = new Tarea("Subtarea: Desarrollar Forntend");

        Tarea tarea31 = new Tarea("Subtarea: Ejecutar Pruebas de Integración");
        Tarea tarea32 = new Tarea("Subtarea: Solucionar Errores");

        //Crear sub-subtareas
        Tarea tarea121 = new Tarea("Sub-subtarea: Definir Esquema de Colores");
        Tarea tarea122 = new Tarea("Sub-subtarea: Diseño Responsivo");

        Tarea tarea211 = new Tarea("Sub-subtarea: Configurar Base de Datos");
        Tarea tarea212 = new Tarea("Sub-subtarea: Crear Lógica de Negocios");

        Tarea tarea221 = new Tarea("Sub-subtarea: Codificar Interfaz de Usuario");
        Tarea tarea222 = new Tarea("Sub-subtarea: Integrar con Backend");

        //Añadir tareas
        tarea12.agregarSubtarea(tarea121);
        tarea12.agregarSubtarea(tarea122);

        tarea21.agregarSubtarea(tarea211);
        tarea21.agregarSubtarea(tarea212);

        tarea22.agregarSubtarea(tarea221);
        tarea22.agregarSubtarea(tarea222);

        tarea1.agregarSubtarea(tarea11);
        tarea1.agregarSubtarea(tarea12);
        tarea1.agregarSubtarea(tarea13);

        tarea2.agregarSubtarea(tarea21);
        tarea2.agregarSubtarea(tarea22);

        tarea3.agregarSubtarea(tarea31);
        tarea3.agregarSubtarea(tarea32);

        tareaPrincipal.agregarSubtarea(tarea1);
        tareaPrincipal.agregarSubtarea(tarea2);
        tareaPrincipal.agregarSubtarea(tarea3);

        //Mostrar estructura
        ExploradorTareas.explorarTarea(tareaPrincipal, 0);


    }
}