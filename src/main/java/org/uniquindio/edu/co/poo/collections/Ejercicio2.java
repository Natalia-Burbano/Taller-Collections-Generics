package org.uniquindio.edu.co.poo.collections;
import java.util.Stack;
/**
 * Inserta un elemento en una pila, siempre que su tipo
 * coincida con el del elemento que está en la cima
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Stack<Object> pila = new Stack<>();
        insertar(pila, 10);
        insertar(pila, 20);
        insertar(pila, "Hola");
        insertar(pila, 30);
        System.out.println("Pila final: " + pila);
    }

    public static void insertar(Stack<Object> pila, Object elemento) {

        // Verificamos que el elemento no sea nulo.
        if (elemento == null) {
            System.out.println("No se permiten valores nulos.");
            return;
        }

        // Comprobamos si la pila está vacia o si el nuevo
        // elemento es del mismo tipo que el de la cima.
        if (pila.isEmpty() ||
                pila.peek().getClass().equals(elemento.getClass())) {

            // Insertamos el elemento en la pila.
            pila.push(elemento);
            System.out.println("Elemento agregado: " + elemento);

        } else {
            // Rechazamos el elemento si su tipo es diferente.
            System.out.println("No se puede agregar: " + elemento);
        }
    }


}
