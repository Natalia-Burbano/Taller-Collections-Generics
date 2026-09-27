package org.uniquindio.edu.co.poo.generics.intermedio;

/**
 * Clase generica restringida: solo acepta clases que hereden de Number.
 */
public class CajaNumerica<T extends Number> {
    public static void main(String[] args) {
        // Funciona con Integer (Enteros)
        CajaNumerica<Integer> entero = new CajaNumerica<>(15);
        System.out.println("El doble de 15 es: " + entero.doble());

        // Funciona con Double (Decimales)
        CajaNumerica<Double> decimal = new CajaNumerica<>(4.5);
        System.out.println("El doble de 4.5 es: " + decimal.doble());

        // ¡ERROR SI INTENTAS ESTO!:
        // CajaNumerica<String> texto = new CajaNumerica<>("Hola");
        // Java NO te dejará compilar porque String NO hereda de Number.
    }
    private T numero;
    public CajaNumerica(T numero) {
        this.numero = numero;
    }

    // Calcula el doble del número guardado
    public double doble() {
        // .doubleValue() es un metodo propio de la clase number de java
        return this.numero.doubleValue() * 2;
    }

}