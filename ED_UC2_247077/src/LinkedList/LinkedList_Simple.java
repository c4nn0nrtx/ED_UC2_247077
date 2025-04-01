package LinkedList;

/**
 * Representa una lista enlazada simple.
 *
 * @author Brandon Valenzuela
 */

public class LinkedList_Simple {
    private Nodo inicial;
    private int tam;

    public LinkedList_Simple() {
        this.inicial = null;
        this.tam = 0;
    }

    /**
     * Verifica si la lista está vacía.
     * @return true si la lista está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return inicial == null;
    }

    /**
     * Devuelve el número de elementos en la lista.
     * @return El número de elementos en la lista.
     */
    public int size() {
        return tam;
    }

    /**
     * Añade un elemento al principio de la lista.
     * @param e El elemento a añadir.
     * @return true si el elemento se añadió correctamente, false en caso contrario.
     * @throws IllegalArgumentException Si el elemento es nulo.
     */
    public boolean addFirst(Integer e) {
        if (e == null) {
            throw new IllegalArgumentException("No se permiten datos nulos.");
        }
        Nodo nuevoNodo = new Nodo(e);
        nuevoNodo.siguiente = inicial;
        inicial = nuevoNodo;
        tam++;
        return true;
    }

    /**
     * Añade un elemento al final de la lista.
     * @param e El elemento a añadir.
     * @return true si el elemento se añadió correctamente, false en caso contrario.
     * @throws IllegalArgumentException Si el elemento es nulo.
     */
    public boolean addLast(Integer e) {
        if (e == null) {
            throw new IllegalArgumentException("No se permiten datos nulos.");
        }
        Nodo nuevoNodo = new Nodo(e);
        if (isEmpty()) {
            inicial = nuevoNodo;
        } else {
            Nodo actual = inicial;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        tam++;
        return true;
    }

    /**
     * Elimina el primer elemento de la lista.
     * @return El elemento eliminado, o null si la lista está vacía.
     */
    public Integer removeFirst() {
        if (isEmpty()) {
            return null;
        }
        int temp = inicial.dato;
        inicial = inicial.siguiente;
        tam--;
        return temp;
    }

    /**
     * Elimina el último elemento de la lista.
     * @return El elemento eliminado, o null si la lista está vacía.
     */
    public Integer removeLast() {
        if (isEmpty()) {
            return null;
        }
        if (tam == 1) {
            return removeFirst();
        }
        Nodo actual = inicial;
        Nodo anterior = null;
        while (actual.siguiente != null) {
            anterior = actual;
            actual = actual.siguiente;
        }
        anterior.siguiente = null;
        tam--;
        return actual.dato;
    }

    /**
     * Busca un elemento en la lista.
     * @param e El elemento a buscar.
     * @return true si el elemento está en la lista, false en caso contrario.
     */
    public boolean contains(Integer e) {
        Nodo actual = inicial;
        while (actual != null) {
            if (actual.dato == e) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    /**
     * Obtiene el elemento en la posición especificada.
     * @param index La posición del elemento a obtener.
     * @return El elemento en la posición especificada, o null si la posición es inválida.
     * @throws IndexOutOfBoundsException Si el índice está fuera de rango.
     */
    public Integer getElement(int index) {
        if (index < 0 || index >= tam) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
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
     * Devuelve una representación en cadena de la lista.
     * @return Una cadena que representa la lista.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
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
