import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Crear una lista de eventos
        List<Evento> eventos = Arrays.asList(
                new Evento("Cena de empresa", LocalDate.of(2023, 11, 20), "Ocio"),
                new Evento("Torneo de bolos", LocalDate.of(2023, 12, 12), "Ocio"),
                new Evento("Reunión con los jefes", LocalDate.of(2023, 12, 20), "Reunión"),
                new Evento("Videoconferencia con compañeros de Argentina", LocalDate.of(2024, 1, 20), "Conferencia"),
                new Evento("Taller de Linkedin", LocalDate.of(2024, 1, 20), "Taller"),
                new Evento("Taller de buenas prácticas", LocalDate.of(2024, 2, 9), "Taller")
        );

        //Filtrar los eventos que están programados para una fecha específica
        System.out.println("--EVENTOS PROGRAMADOS PARA EL 20/01/2024--");
        eventos.stream()
                .filter(evento -> evento.getFecha().equals(LocalDate.of(2024, 1, 20)))
                .forEach(System.out::println);

        //Agrupar los eventos por categoría y cuenta cuántos eventos hay en cada categoría
        System.out.println("\n--NUMERO DE EVENTOS POR CATEGORÍA--");
        System.out.println(eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()))
        );

        // Encontrar el evento más próximo en el tiempo utilizando Optionals
        System.out.println("\n--EVENTO MÁS PRÓXIMO--");
        eventos.stream()
                .filter(evento -> evento.getFecha().isAfter(LocalDate.now()))
                .min(Comparator.comparing(Evento::getFecha))
                .ifPresentOrElse(
                        evento -> System.out.println("Proximo evento: " + evento.toString()),
                        () -> System.out.println("No hay eventos próximos")
                );
    }
}