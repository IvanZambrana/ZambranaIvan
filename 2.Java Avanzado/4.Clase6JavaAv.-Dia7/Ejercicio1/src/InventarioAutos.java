import java.util.ArrayList;
import java.util.List;

public class InventarioAutos<T extends Auto> {
    private List<T> autos;

    public InventarioAutos() {
        this.autos = new ArrayList<>();
    }

    //Método genérico para agregar autos al inventario
    public void agregarAuto(T auto) {
        autos.add(auto);
        System.out.println("Auto agregado al inventario: " + auto.toString());
    }

    // Método genérico para buscar autos por marca
    public List<T> buscarPorMarca(String marca) {
        List<T> resultado = new ArrayList<>();
        for (T auto : autos) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                resultado.add(auto);
            }
        }
        return resultado;
    }

    // Método genérico para buscar autos por año
    public List<T> buscarPorYear(int year) {
        List<T> resultado = new ArrayList<>();
        for (T auto : autos) {
            if (auto.getYear() == year) {
                resultado.add(auto);
            }
        }
        return resultado;
    }

    // Método genérico para calcular el valor total del inventario
    public double calcularTotal() {
        double total = 0;
        for (T auto : autos) {
            total += auto.getPrecio();
        }
        return total;
    }

}