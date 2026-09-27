package org.uniquindio.edu.co.poo.generics.avanzado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Guarda una lista de elementos comparables y permite filtrarlos
 * usando EXCLUSIVAMENTE un Iterator (sin usar for-each).
 */

public class InventarioCaja<T extends Comparable<T>> {
    public static void main(String[] args) {
        InventarioCaja<Integer> inventario = new InventarioCaja<>();
        inventario.agregar(10);
        inventario.agregar(25);
        inventario.agregar(5);
        inventario.agregar(40);

        System.out.println("Numeros mayores que 20: " + inventario.obtenerMayoresQue(20));
    }

    private List<T> elementos = new ArrayList<>();

    // Metodo para agregar elementos
    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    // Filtra los elementos mayores que un umbral dado usando solo Iterator
    public List<T> obtenerMayoresQue(T umbral) {
        List<T> resultado = new ArrayList<>();

        // Creamos el iterador de la lista
        Iterator<T> iterador = elementos.iterator();

        // Recorremos la lista obligatoriamente con el ciclo while e Iterator
        while (iterador.hasNext()) {
            T actual = iterador.next();

            // Si el elemento actual es mayor que el umbral, lo agregamos al resultado
            if (actual.compareTo(umbral) > 0) {
                resultado.add(actual);
            }
        }

        return resultado;
    }

}
