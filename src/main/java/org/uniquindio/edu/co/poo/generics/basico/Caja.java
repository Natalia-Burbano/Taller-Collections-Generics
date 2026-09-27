package org.uniquindio.edu.co.poo.generics.basico;

/**
 * Clase generica que permite almacenar cualquier tipo de objeto T
 */
public class Caja<T> {
    public static void main(String[] args) {
        // Creamos una caja que obligatoriamente guardara un String
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Un regalo de cumpleaños");
        System.out.println("Contenido: " + cajaTexto.obtener());

        // Creamos una caja que obligatoriamente guardara un Integer
        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(2026);
        System.out.println("Contenido: " + cajaNumero.obtener());
    }

    // Atributo cuyo tipo de dato se definira cuando se cree la Caja
    private T contenido;

    // Guarda un valor del tipo T
    public void guardar(T valor) {
        this.contenido = valor;
    }

    // Devuelve el valor almacenado de tipo T
    public T obtener() {
        return this.contenido;
    }


}