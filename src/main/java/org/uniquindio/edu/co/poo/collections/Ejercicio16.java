package org.uniquindio.edu.co.poo.collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Registra productos escaneados en un supermercado en el mismo orden
 * en que se agregaron usando LinkedHashMap y calcula el total
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        // LinkedHashMap guarda la relación Clave-Valor manteniendo el orden de inserción.
        LinkedHashMap<String, Double> factura = new LinkedHashMap<>();

        // Escaneamos productos (Nombre, Precio).
        factura.put("Leche", 3500.0);
        factura.put("Galletas", 2000.0);
        factura.put("Cafe", 8500.0);

        double total = 0.0;

        System.out.println(" FACTURA DE COMPRA ");

        // Recorremos el mapa para mostrar el detalle e ir sumando.
        for (Map.Entry<String, Double> producto : factura.entrySet()) {
            System.out.println("Producto: " + producto.getKey() + " | Precio: $" + producto.getValue());
            total += producto.getValue();
        }

        System.out.println("Total a pagar: $" + total);
    }
}