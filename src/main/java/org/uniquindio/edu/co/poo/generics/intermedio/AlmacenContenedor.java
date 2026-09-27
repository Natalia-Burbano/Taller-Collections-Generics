package org.uniquindio.edu.co.poo.generics.intermedio;

import java.util.ArrayList;
import java.util.List;
/**
 * Guarda una lista de elementos y busca cual es el mayor de todos
 */

// Interfaz sencilla que exige que los elementos se puedan comparar entre si
interface Almacenable<T extends Comparable<T>> {
    void guardar(T item);
    T maximo();
}

public class AlmacenContenedor<T extends Comparable<T>> implements Almacenable<T> {
    public static void main(String[] args) {
        AlmacenContenedor<Integer> almacen = new AlmacenContenedor<>();
        almacen.guardar(10);
        almacen.guardar(45);
        almacen.guardar(22);

        System.out.println("El numero mayor es: " + almacen.maximo());
    }

    private List<T> elementos = new ArrayList<>();

    public void guardar(T item) {
        elementos.add(item);
    }

    public T maximo() {
        if (elementos.isEmpty()) {
            return null;
        }

        // Asumimos que el primero es el mayor
        T mayor = elementos.get(0);

        // Comparamos uno a uno
        for (T item : elementos) {
            // compareTo devuelve un número positivo si 'item' es mayor que 'mayor'
            if (item.compareTo(mayor) > 0) {
                mayor = item;
            }
        }
        return mayor;
    }

}