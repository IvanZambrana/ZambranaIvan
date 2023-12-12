import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Crear inventario de vehículos
        InventarioAutos<Auto> inventarioAutos = new InventarioAutos<>();

        //Agregar autos al inventario
        inventarioAutos.agregarAuto(new Auto("Subaru", "Impreza", 1998, 25000.0));
        inventarioAutos.agregarAuto(new Auto("Chevrolet", "Camaro", 1969, 58000.0));
        inventarioAutos.agregarAuto(new Auto("Nissan", "Skyline", 1998, 35000.0));
        inventarioAutos.agregarAuto(new Auto("Ford", "GT", 2005, 125000.0));
        inventarioAutos.agregarAuto(new Auto("Citroen", "C15", 1980, 1000.0));
        inventarioAutos.agregarAuto(new Auto("Fiat", "Multipla", 2005, 0.0));
        inventarioAutos.agregarAuto(new Auto("Citroen", "Saxo", 2003, 2500.0));

        //Buscar autos por marca
        System.out.println("\n--BUSCAR POR MARCA (CITROEN)--");
        List<Auto> autosPorMarca = inventarioAutos.buscarPorMarca("Citroen");
        autosPorMarca.forEach(System.out::println);

        //Buscar autos por año
        System.out.println("\n--BUSCAR POR AÑO (1998)--");
        List<Auto> autosPorYear = inventarioAutos.buscarPorYear(1998);
        autosPorYear.forEach(System.out::println);

        //Calcular valor total del inventario
        System.out.println("\nPRECIO TOTAL DEL INVENTARIO: " + inventarioAutos.calcularTotal() + " €");
    }
}