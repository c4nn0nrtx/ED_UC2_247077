package Pruebas;

import LinkedList.DoubleLinkedList_Circular;
import LinkedList.LinkedList_Simple;
import LinkedList.DoubleLinkedList_Simple;
import LinkedList.LinkedList_Circular;

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

//        // Lista Enlazada Simple
//
//        LinkedList_Simple lista = new LinkedList_Simple();
//        lista.addFirst(10);
//        lista.addLast(20);
//        lista.addFirst(5);
//        System.out.println("Lista: " + lista);
//        System.out.println("Tamaño: " + lista.size());
//        System.out.println("¿Está vacía?: " + lista.isEmpty());
//        System.out.println("Contiene 20?: " + lista.contains(20));
//        System.out.println("Primer elemento: " + lista.removeFirst());
//        System.out.println("Último elemento: " + lista.removeLast());
//        System.out.println("Lista después de eliminar: " + lista);
//        System.out.println("Elemento en la posición 0: " + lista.getElement(0));
//        lista.clear();
//        System.out.println("Lista después de limpiar: " + lista);
//        System.out.println("Tamaño después de limpiar: " + lista.size());


//        //Lista Doblemente Enlazada Simple
//        
//        DoubleLinkedList_Simple<Integer> lista = new DoubleLinkedList_Simple<>();
//        System.out.println("Lista vacía: " + lista.isEmpty());
//        lista.addFirst(10);
//        lista.addLast(20);
//        lista.addFirst(5);
//        System.out.println("Lista después de agregar elementos: " + lista);
//        System.out.println("Tamaño de la lista: " + lista.size());
//        System.out.println("La lista contiene 10: " + lista.contains(10));
//        lista.removeFirst();
//        System.out.println("Lista después de eliminar el primer elemento: " + lista);
//        lista.removeLast();
//        System.out.println("Lista después de eliminar el último elemento: " + lista);
//        System.out.println("Elemento en la posición 0: " + lista.getElement(0));
//        lista.clear();
//        System.out.println("Lista después de limpiar: " + lista);


//        //Lista Enlazada Simple Circular
//
//        LinkedList_Circular<Integer> lista = new LinkedList_Circular<>();
//        
//        System.out.println("Lista vacía: " + lista.isEmpty());
//        
//        lista.addFirst(10);
//        lista.addLast(20);
//        lista.addLast(30);
//        System.out.println("Lista después de agregar elementos: " + lista);
//        
//        System.out.println("Contiene 20: " + lista.contains(20));
//        System.out.println("Elemento en posición 1: " + lista.getElement(1));
//        
//        lista.removeFirst();
//        System.out.println("Lista después de removeFirst: " + lista);
//        
//        lista.removeLast();
//        System.out.println("Lista después de removeLast: " + lista);
//        
//        lista.clear();
//        System.out.println("Lista después de clear: " + lista.isEmpty());


        //Lista Doblemente Enlazada Circular
        DoubleLinkedList_Circular<Integer> list = new DoubleLinkedList_Circular<>();

        // Prueba de isEmpty y size
        System.out.println("Lista vacía: " + list.isEmpty()); // true
        System.out.println("Tamaño: " + list.size()); // 0

        // Agregar elementos al inicio y al final
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(5);
        list.addLast(25);

        System.out.println("Lista después de agregar elementos: " + list);
        System.out.println("Tamaño: " + list.size());

        // Prueba de contains
        System.out.println("Contiene 10: " + list.contains(10)); // true
        System.out.println("Contiene 30: " + list.contains(30)); // false

        // Obtener elementos
        System.out.println("Elemento en posición 1: " + list.getElement(1)); // 10

        // Remover elementos
        list.removeFirst();
        System.out.println("Lista después de removeFirst(): " + list);

        list.removeLast();
        System.out.println("Lista después de removeLast(): " + list);

        // Limpiar la lista
        list.clear();
        System.out.println("Lista después de clear(): " + list);
        System.out.println("Lista vacía: " + list.isEmpty()); // true
    }
}
