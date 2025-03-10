package Pruebas;

import LinkedList.LinkedList;

/**
 * Clase de pruebas para la implementación de la lista enlazada simple.
 *
 * Se realizan operaciones de inserción, eliminación, búsqueda y limpieza para
 * verificar el correcto funcionamiento de la estructura de datos.
 *
 * @author Brandon Valenzuela
 */
public class Pruebas {

    /**
     * Método principal para probar la funcionalidad de la lista enlazada.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();

        // Verificar si la lista está vacía
        System.out.println("Lista vacía: " + lista.isEmpty());

        // Agregar elementos a la lista
        lista.addFirst(10);
        lista.addLast(20);
        lista.addLast(30);
        System.out.println("Lista después de agregar elementos: " + lista);

        // Consultar información de la lista
        System.out.println("Tamaño de la lista: " + lista.size());
        System.out.println("Contiene 20: " + lista.contains(20));
        System.out.println("Elemento en índice 1: " + lista.getElement(1));

        // Eliminar elementos de la lista
        lista.removeFirst();
        System.out.println("Lista después de eliminar el primer elemento: " + lista);
        lista.removeLast();
        System.out.println("Lista después de eliminar el último elemento: " + lista);

        // Limpiar la lista
        lista.clear();
        System.out.println("Lista después de limpiarla: " + lista);
    }
}
