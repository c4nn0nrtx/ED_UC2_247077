package Pruebas;

import LinkedList.LinkedList_Simple;

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
        LinkedList_Simple lista = new LinkedList_Simple();
        lista.addFirst(10);
        lista.addLast(20);
        lista.addFirst(5);
        System.out.println("Lista: " + lista);
        System.out.println("Tamaño: " + lista.size());
        System.out.println("¿Está vacía?: " + lista.isEmpty());
        System.out.println("Contiene 20?: " + lista.contains(20));
        System.out.println("Primer elemento: " + lista.removeFirst());
        System.out.println("Último elemento: " + lista.removeLast());
        System.out.println("Lista después de eliminar: " + lista);
        System.out.println("Elemento en la posición 0: " + lista.getElement(0));
        lista.clear();
        System.out.println("Lista después de limpiar: " + lista);
        System.out.println("Tamaño después de limpiar: " + lista.size());
    }
}
