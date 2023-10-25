
/*
Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono
(tener en cuenta todos sus atributos, constructores y métodos getters y setters).
a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después
    de los datos de las dos personas cuyos nombres fueron cambiados.
d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
*/
public class Main {

    public static void main(String[] args) {
        //Crear Vector
        Persona[] personas = new Persona[5];

        //Crear personas
        personas[0] = new Persona(1, "Pablo Torre", 20, "C/ Girona, 123", "666444333");
        personas[1] = new Persona(2, "Luis Miguel", 53, "C/ Vuelve, 12", "654543321");
        personas[2] = new Persona(3, "Camilo Sesto", 72, "C/ Melina, 75", "606000303");
        personas[3] = new Persona(4, "Jose Luis Gil", 65, "C/ Buzz, 1", "666777111");
        personas[4] = new Persona(5, "Luis Posada", 60, "C/ Sparrow, 31", "657657657");

        //Recorrer el vector para mostrar nombre y edad de cada persona
        System.out.println("\n--NOMBRE Y EDAD DE CADA PERSONA--");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + ", " + persona.getEdad());
        }

        //Cambiar el nombre de dos personas
        System.out.println("\n--CAMBIAR NOMBRE DE 2 PERSONAS--");
        System.out.println("ANTES:\n\t- " + personas[0].getNombre() + "\n\t- " + personas[4].getNombre());
        personas[0].setNombre("Paula Torre");
        personas[4].setNombre("Luisa Posada");
        System.out.println("DESPUES:\n\t- " + personas[0].getNombre() + "\n\t- " + personas[4].getNombre());

        //Mostrar solo personas menores de 30 años
        System.out.println("\n--MOSTRAR DATOS DE PERSONAS MENORES DE 30 AÑOS--");
        for (Persona persona : personas) {
            if(persona.getEdad()<= 30){
                System.out.println(persona.getId()+ ". " +
                        persona.getNombre() + ", " +
                        persona.getEdad() + ", '" +
                        persona.getDireccion() + "', " +
                        persona.getNumTelefono()
                );
            }

        }
    }
}