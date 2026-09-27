package org.uniquindio.edu.co.poo.collections;

import java.util.LinkedList;

/**
 * Maneja los turnos de un banco usando LinkedList.
 * Permite agregar clientes en orden normal y meter casos urgentes al inicio
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        LinkedList<String> colaBanco = new LinkedList<>();

        // Agregamos clientes normales a la fila (se van al final).
        colaBanco.addLast("Carlos");
        colaBanco.addLast("Ana");
        colaBanco.addLast("Pedro");

        // Llega un cliente con urgencia y lo metemos de primero.
        colaBanco.addFirst("Dora la exploradora (Urgente)");

        System.out.println("Fila inicial de clientes: " + colaBanco);

        // Atendemos a los clientes en el orden en que estan en la fila.
        while (!colaBanco.isEmpty()) {
            // pollFirst elimina y nos da el primer elemento de la lista.
            String clienteAtendido = colaBanco.pollFirst();
            System.out.println("Atendiendo a: " + clienteAtendido);
        }
    }
}