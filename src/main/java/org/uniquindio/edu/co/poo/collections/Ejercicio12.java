package org.uniquindio.edu.co.poo.collections;

import java.util.TreeSet;

/**
 * Almacena nombres de estudiantes en un TreeSet para mantenerlos
 * ordenados alfabeticamente y obtener el primero y el último facilmente
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        // TreeSet elimina duplicados y ordena automáticamente.
        TreeSet<String> estudiantes = new TreeSet<>();

        // Agregamos estudiantes en cualquier orden.
        estudiantes.add("Sofia");
        estudiantes.add("Andres");
        estudiantes.add("Beatriz");
        estudiantes.add("Camilo");

        System.out.println("Lista completa organizada alfabeticamente: " + estudiantes);

        // Obtenemos el primer y el último nombre usando los metodos de TreeSet.
        if (!estudiantes.isEmpty()) {
            System.out.println("Primer estudiante (A-Z): " + estudiantes.first());
            System.out.println("Ultimo estudiante (A-Z): " + estudiantes.last());
        }
    }
}