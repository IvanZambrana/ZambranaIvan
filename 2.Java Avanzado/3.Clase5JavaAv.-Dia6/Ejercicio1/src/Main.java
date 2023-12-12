import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Creamos lista de trabajadores
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Jose Sanchez", 30000.0, "Analista"),
                new Empleado("Maria Jimenez", 332900.5, "Jefa Suprema"),
                new Empleado("Paco Rubio", 18000.0, "Desarrollador"),
                new Empleado("Antonio Gutierrez", 40500.0, "Analista"),
                new Empleado("Luisa Patiño", 25000.0, "Recursos Humanos"),
                new Empleado("Luis Diaz", 22000.0, "Desarrollador")
        );

        //Filtrar empleados cuyo salario sea mayor a cierto valor específico (40000 por ejemplo)
        System.out.println("--EMPLEADOS QUE COBRAN MÁS DE 40000 €--");
        empleados.stream()
                .filter(empleado -> empleado.getSalario() > 40000)
                .forEach(empleado -> {
                    System.out.println("Nombre: " + empleado.getNombre() +
                            ", Salario: $" + empleado.getSalario() +
                            ", Categoría: " + empleado.getCategoria());
                });

        //Agrupar los empleados por categoría y calcula el salario promedio para cada categoría
        System.out.println("\n\n--SALARIO MEDIO POR CATEGORÍA--");
        Map<String, Double> porCategoria = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria,
                        Collectors.averagingDouble(Empleado::getSalario)));
        porCategoria.forEach((categoria, salarioPromedio) ->
                System.out.println("Categoría: " + categoria + ", Salario Promedio: $" + salarioPromedio)
        );

        //Encontrar al empleado con el salario más alto utilizando Optionals
        System.out.println("\n\n--TRABAJADOR CON EL SALARIO MÁS ALTO--");
        Optional<Empleado> masAlto = empleados.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario));
        masAlto.ifPresent(
                empleado -> System.out.println("Nombre: " + empleado.getNombre() +
                        ", Salario: $" + empleado.getSalario() +
                        ", Categoría: " + empleado.getCategoria())
        );

    }
}