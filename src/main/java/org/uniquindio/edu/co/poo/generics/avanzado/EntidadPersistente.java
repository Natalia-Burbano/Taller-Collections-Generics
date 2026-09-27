package org.uniquindio.edu.co.poo.generics.avanzado;

/**
 * La 'T' debe ser obligatoriamente un numero Y tambien poder compararse
 */
public class EntidadPersistente<T extends Number & Comparable<T>> {
    public static void main(String[] args) {
        EntidadPersistente<Integer> entidad = new EntidadPersistente<>(100);

        System.out.println("¿100 es mayor que 50? " + entidad.esMayorQue(50));
        System.out.println("¿100 es mayor que 150? " + entidad.esMayorQue(150));
    }

    private T valor;

    public EntidadPersistente(T valor) {
        this.valor = valor;
    }

    // Compara si el valor guardado es mayor que otro valor que le pasemos
    public boolean esMayorQue(T otroValor) {
        return this.valor.compareTo(otroValor) > 0;
    }
}