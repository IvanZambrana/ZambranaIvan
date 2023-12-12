public class GestionDatos {
    //Atributos
    private String[] vectorDatos;
    private int capacidad;

    //Constructor
    public GestionDatos(int capacidad) {
        this.vectorDatos = new String[capacidad];
        this.capacidad = capacidad;
    }

    //Método almacenarDato
    public void almacenarDato(int indice, String dato){
        //Comprobamos que el índice esté entre 0 y la capacidad del vector
        if (indice < 0 || indice >= capacidad){
            System.out.println("Error: Índice fuera del rango del vector.");
            return;
        }

        //En caso de que esté dentro del rango, el dato se almacenará en el vector
        vectorDatos[indice] = dato;
        System.out.println("Dato '" + dato + "' añadido con éxito en el índice " + indice);

    }

    //Método accederDato
    public void accederDato(int indice){
        //Intentamos acceder al dato
        try {
            String dato = vectorDatos[indice];
            System.out.println("Dato en la posición " + indice + " : " + dato);
        }catch (ArrayIndexOutOfBoundsException e){
            //La excepción ArrayIndexOutOfBoundsException se encarga del manejo del error de límites del vector
            System.out.println("Error: Intento de acceso a una posición inválida en el vector.");



        }
    }
}
