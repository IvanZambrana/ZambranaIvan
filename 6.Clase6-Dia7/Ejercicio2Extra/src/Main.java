import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creamos lista de productos
        List<Producto> inventario = new ArrayList<>();

        //Añadir productos a la lista
        inventario.add(new Producto(1, "Teléfono", "Samsung", "Smartphone", 200.0, 300.0, 20));
        inventario.add(new Producto(2, "Laptop", "Dell", "Portátil", 600.0, 800.0, 15));
        inventario.add(new Producto(3, "Auriculares", "Sony", "Accesorio", 20.0, 40.0, 50));
        inventario.add(new Producto(4, "Cargador", "Anker", "Accesorio", 10.0, 15.0, 30));
        inventario.add(new Producto(5, "Tablet", "Apple", "Tablet", 250.0, 350.0, 10));
        inventario.add(new Producto(6, "Smartwatch", "Samsung", "Wearable", 50.0, 80.0, 25));
        inventario.add(new Producto(7, "Impresora", "HP", "Periférico", 80.0, 120.0, 12));
        inventario.add(new Producto(8, "Altavoces", "Bose", "Accesorio", 40.0, 60.0, 18));
        inventario.add(new Producto(9, "Monitor", "LG", "Periférico", 100.0, 150.0, 14));
        inventario.add(new Producto(10, "Router", "TP-Link", "Red", 25.0, 40.0, 22));

        // Encontrar el producto con el mayor precio de venta
        Producto productoMasCaro = inventario.get(0);
        for (Producto producto : inventario) {
            if (producto.getPrecioVenta() > productoMasCaro.getPrecioVenta()) {
                productoMasCaro = producto;
            }
        }
        System.out.println("El producto más caro es: " + productoMasCaro);

        // Encontrar el producto con el menor precio de costo
        Producto productoMasBarato = inventario.get(0);
        for (Producto producto : inventario) {
            if (producto.getPrecioCosto() < productoMasBarato.getPrecioCosto()) {
                productoMasBarato = producto;
            }
        }
        System.out.println("El producto más barato es: " + productoMasBarato);

        // Borrar el producto en la posición 5
        if (inventario.size() >= 6) {
            Producto productoBorrado = inventario.remove(5);
            System.out.println("Se ha eliminado el producto en la posición 5: " + productoBorrado);
        } else {
            System.out.println("No se puede eliminar el producto en la posición 5, ya que no hay suficientes elementos en el inventario.");
        }

        // Encontrar el producto con la mayor cantidad en stock y descontar 3 unidades
        Producto productoMayorStock = inventario.get(0);
        for (Producto producto : inventario) {
            if (producto.getCantidadEnStock() > productoMayorStock.getCantidadEnStock()) {
                productoMayorStock = producto;
            }
        }
        System.out.println("El producto con la mayor cantidad en stock es: " + productoMayorStock);

        if (productoMayorStock.getCantidadEnStock() >= 3) {
            productoMayorStock.setCantidadEnStock(productoMayorStock.getCantidadEnStock() - 3);
            System.out.println("Se han descontado 3 unidades del stock del producto con mayor stock.");
        } else {
            System.out.println("No se pueden descontar 3 unidades del stock del producto con mayor stock, ya que no hay suficientes unidades en stock.");
        }
    }
}