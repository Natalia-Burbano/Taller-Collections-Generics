package org.uniquindio.edu.co.poo.generics.avanzado;

import java.util.ArrayList;
import java.util.List;

/**
 * Ordena los elementos de una lista de menor a mayor (o en orden alfabetico)
 */
public class Ordenador<T extends Comparable<T>> {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Uva");
        frutas.add("Banano");
        frutas.add("Manzana");

        Ordenador<String> ordenador = new Ordenador<>();
        ordenador.ordenar(frutas);

        System.out.println("Frutas ordenadas (A-Z): " + frutas);
    }

    // Metodo sencillo que ordena la lista
    public void ordenar(List<T> lista) {
        int tamano = lista.size();

        // Recorremos la lista comparando parejas de elementos
        for (int i = 0; i < tamano - 1; i++) {
            for (int j = 0; j < tamano - 1; j++) {

                // Si el elemento actual es mayor que el siguiente, los intercambiamos
                if (lista.get(j).compareTo(lista.get(j + 1)) > 0) {
                    T temporal = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temporal);
                }
            }
        }
    }

}
