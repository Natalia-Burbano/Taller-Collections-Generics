package org.uniquindio.edu.co.poo.generics.basico;

import java.util.Arrays;

/**
 * Contiene un metodo sencillo para cambiar de posición dos elementos en un arreglo
 */
public class Intercambiar {
    public static void main(String[] args) {
        // Arreglo de palabras
        String[] nombres = {"Ana", "Pedro"};
        System.out.println("Antes del cambio: " + Arrays.toString(nombres));

        // Intercambiamos la posicion 0 y la 1
        intercambiarPosiciones(nombres, 0, 1);
        System.out.println("Después del cambio: " + Arrays.toString(nombres));
    }

    // Metodo generico para intercambiar elementos usando una variable temporal
    public static <T> void intercambiarPosiciones(T[] arreglo, int pos1, int pos2) {
        // Guardamos temporalmente el primer valor
        T temporal = arreglo[pos1];

        // Ponemos el segundo valor en la primera posición
        arreglo[pos1] = arreglo[pos2];

        // Ponemos el valor guardado en la segunda posición
        arreglo[pos2] = temporal;
    }


}