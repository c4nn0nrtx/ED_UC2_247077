package LinkedList;

/**
 * LinkedList.java
 * 
 * Representa una lista enlazada simple.
 * 
 * @author Brandon Valenzuela
 */
public class LinkedList {

    private Nodo inicial;
    private int tam;

    public LinkedList() {
        this.inicial = null;
        this.tam = 0;
    }

    /**
     * Verifica si la lista está vacía.
     *
     * @return true si la lista está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return inicial == null;
    }

    /**
     * Obtiene el tamaño de la lista.
     *
     * @return Número de elementos en la lista.
     */
    public int size() {
        return tam;
    }

    /**
     * Agrega un elemento al inicio de la lista.
     *
     * @param dato Elemento a agregar.
     */
    public void addFirst(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = inicial;
        inicial = nuevo;
        tam++;
    }

    /**
     * Agrega un elemento al final de la lista.
     *
     * @param dato Elemento a agregar.
     */
    public void addLast(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (isEmpty()) {
            inicial = nuevo;
        } else {
            Nodo actual = inicial;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        tam++;
    }

    /**
     * Elimina el primer elemento de la lista.
     */
    public void removeFirst() {
        if (!isEmpty()) {
            inicial = inicial.siguiente;
            tam--;
        }
    }

    /**
     * Elimina el último elemento de la lista.
     */
    public void removeLast() {
        if (!isEmpty()) {
            if (inicial.siguiente == null) {
                inicial = null;
            } else {
                Nodo actual = inicial;
                while (actual.siguiente.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = null;
            }
            tam--;
        }
    }

    /**
     * Verifica si un elemento está en la lista.
     *
     * @param dato Elemento a buscar.
     * @return true si el elemento está en la lista, false en caso contrario.
     */
    public boolean contains(int dato) {
        Nodo actual = inicial;
        while (actual != null) {
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    /**
     * Obtiene un elemento en una posición específica.
     *
     * @param index Índice del elemento.
     * @return Elemento en la posición indicada o -1 si el índice es inválido.
     */
    public int getElement(int index) {
        if (index < 0 || index >= tam) {
            return -1;
        }
        Nodo actual = inicial;
        for (int i = 0; i < index; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    /**
     * Elimina todos los elementos de la lista.
     */
    public void clear() {
        inicial = null;
        tam = 0;
    }

    /**
     * Retorna una representación en cadena de la lista.
     *
     * @return Cadena con los elementos de la lista.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Nodo actual = inicial;
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) {
                sb.append(", ");
            }
            actual = actual.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }
}

class Nodo {

    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
