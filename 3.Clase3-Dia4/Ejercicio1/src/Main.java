
/*
* Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde) con los siguientes atributos: cod, marca, modelo, consumo y color.
Luego, realiza las siguientes acciones:
a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
* */
public class Main {
    public static void main(String[] args) {

        //Istanciar objetos
        Electrodomestico nevera = new Electrodomestico(1, "Balay", "E-300", 'C', "rojo");
        Electrodomestico lavadora = new Electrodomestico(2, "Bosh", "T-1234", 'A', "blanco");
        Electrodomestico congelador = new Electrodomestico(3, "LG", "M-601", 'B', "gris");
        Electrodomestico electrodomesticoVacio = new Electrodomestico();

        //Mostrar por pantalla los datos requeridos de los electrodomésticos
        System.out.println("1.Nevera: Marca -> " + nevera.getMarca() +
                " ,Modelo -> " + nevera.getModelo() +
                " ,Consumo energético -> " + nevera.getConsumoEnergetico()
        );
        System.out.println("2.Lavadora: Marca -> " + lavadora.getMarca() +
                " ,Modelo -> " + lavadora.getModelo() +
                " ,Consumo energético -> " + lavadora.getConsumoEnergetico()
        );
        System.out.println("3.Congelador: Marca -> " + congelador.getMarca() +
                " ,Modelo -> " + congelador.getModelo() +
                " ,Consumo energético -> " + congelador.getConsumoEnergetico()
        );

        //Del electrodoméstico vacío se obtienen los siguientes datos:
        //Código -> 0 Marca -> null ,Modelo -> null ,Consumo energético ->   ,Color -> null
        System.out.println("4.ElectrodomesticoVacio:" +
                " Código -> " + electrodomesticoVacio.getCod() +
                " Marca -> " + electrodomesticoVacio.getMarca() +
                " ,Modelo -> " + electrodomesticoVacio.getModelo() +
                " ,Consumo energético -> " + electrodomesticoVacio.getConsumoEnergetico() +
                " ,Color -> " + electrodomesticoVacio.getColor()
        );

    }
}