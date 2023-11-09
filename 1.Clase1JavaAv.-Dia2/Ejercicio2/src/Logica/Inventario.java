package Logica;

import Excepciones.InventarioInvalidoException;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    //Crear lista de productos
    private ArrayList<Producto> inventario = new ArrayList<>();

    //Método agregarProducto
    public void agregarProducto() throws InventarioInvalidoException{

        Scanner scanner = new Scanner(System.in);
        //Preguntamos al usuario el nombre
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();

        //Comprobamos que el nombre no esté vacío
        if (nombre == null || nombre.isEmpty()) {
            throw new InventarioInvalidoException("El nombre del producto no puede estar vacío.");
        }

        //Pedimos precio del producto
        System.out.print("Precio del producto: ");
        double precio;

        //Comprobamos que el usuario añada un Double para definir el precio
        if (scanner.hasNextDouble()) {
            precio = scanner.nextDouble();
        } else {
            throw new InventarioInvalidoException("El precio del producto debe ser un número válido.");
        }

        //Comprobamos que sea mayor que 0
        if (precio <= 0) {
            throw new InventarioInvalidoException("El precio del producto debe ser mayor que cero.");
        }

        //Preguntamos al usuario la cantidad de stock
        System.out.print("Cantidad disponible: ");
        int cantidad;

        //Comprobamos que el usuario añada un Int para definir el número de stock
        if (scanner.hasNextInt()) {
            cantidad = scanner.nextInt();
        } else {
            throw new InventarioInvalidoException("La cantidad disponible del producto debe ser un número válido.");
        }

        //Comprobamos que sea mayor que 0
        if (cantidad < 0) {
            throw new InventarioInvalidoException("La cantidad disponible del producto no puede ser negativa.");
        }

        //Crear producto y agregarlo al inventario
        Producto producto = new Producto(nombre, precio, cantidad);
        inventario.add(producto);

        System.out.println("Producto agregado con éxito");
        scanner.close();
    }
}
