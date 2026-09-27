package org.uniquindio.edu.co.poo.generics.basico;
/**
 * Clase con un metodo generico para imprimir arreglos de cualquier tipo de dato
 */
public class ImpresoraGenerica {
    public static void main(String[] args) {
        // Arreglo de cadenas (String)
        String[] nombres = {"Juan", "Camila", "Carlos"};
        System.out.println("Lista de Nombres");
        imprimirArreglo(nombres);

        // Arreglo de numeros enteros (Integer)
        Integer[] numeros = {10, 20, 30, 40};
        System.out.println("Lista de Números");
        imprimirArreglo(numeros);
    }

    // Metodo generico para imprimir los elementos de un arreglo
    public static <T> void imprimirArreglo(T[] arreglo) {
        for (T elemento : arreglo) {
            System.out.println("Elemento: " + elemento);
        }
    }


}