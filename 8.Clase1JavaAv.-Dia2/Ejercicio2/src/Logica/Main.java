package Logica;

import Excepciones.InventarioInvalidoException;

public class Main {
    public static void main(String[] args) {
        //Creamos Inventario
        Inventario inventario = new Inventario();

        //Intentamos añadir producto contemplando todos los errores del usuario
        try {
            inventario.agregarProducto();
        }catch (InventarioInvalidoException e){
            System.out.println("Error en el inventario: " + e.getMessage());
        }
    }
}