package LinkedList;

/**
 * Clase Nodo para la Lista Enlazada Simple Circular (LESC).
 *
 * @param <T> Tipo de dato almacenado en el nodo.
 */
class Nodo<T> {

    T dato;
    Nodo<T> siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

/**
 * Clase que representa una Lista Enlazada Simple Circular (LESC). Permite
 * operaciones como agregar, eliminar y buscar elementos.
 *
 * @param <T> Tipo de dato almacenado en la lista.
 */
public class LinkedList_Circular<T> {

    private Node<T> last;
    private int size;

    /**
     * Clase interna que representa un nodo de la lista. Contiene un dato y una
     * referencia al siguiente nodo.
     */
    private static class Node<T> {

        T data;
        Node<T> next;

        /**
         * Constructor del nodo.
         *
         * @param data Dato que contiene el nodo.
         */
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Constructor de la lista circular. Inicializa la lista vacía.
     */
    public LinkedList_Circular() {
        last = null;
        size = 0;
    }

    /**
     * Verifica si la lista está vacía.
     *
     * @return true si la lista está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Retorna el tamaño de la lista.
     *
     * @return Número de elementos en la lista.
     */
    public int size() {
        return size;
    }

    /**
     * Agrega un elemento al inicio de la lista.
     *
     * @param data Elemento a agregar.
     */
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
        size++;
    }

    /**
     * Agrega un elemento al final de la lista.
     *
     * @param data Elemento a agregar.
     */
    public void addLast(T data) {
        addFirst(data);
        last = last.next;
    }

    /**
     * Elimina el primer elemento de la lista.
     *
     * @return Elemento eliminado.
     * @throws IllegalStateException si la lista está vacía.
     */
    public T removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía");
        }
        Node<T> first = last.next;
        if (first == last) {
            last = null;
        } else {
            last.next = first.next;
        }
        size--;
        return first.data;
    }

    /**
     * Elimina el último elemento de la lista.
     *
     * @return Elemento eliminado.
     * @throws IllegalStateException si la lista está vacía.
     */
    public T removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía");
        }
        Node<T> current = last.next;
        if (current == last) {
            last = null;
        } else {
            while (current.next != last) {
                current = current.next;
            }
            current.next = last.next;
            last = current;
        }
        size--;
        return last.data;
    }

    /**
     * Verifica si la lista contiene un elemento específico.
     *
     * @param data Elemento a buscar.
     * @return true si el elemento está en la lista, false en caso contrario.
     */
    public boolean contains(T data) {
        if (isEmpty()) {
            return false;
        }
        Node<T> current = last.next;
        do {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        } while (current != last.next);
        return false;
    }

    /**
     * Obtiene un elemento en una posición específica.
     *
     * @param index Índice del elemento a obtener.
     * @return Elemento en la posición dada.
     * @throws IndexOutOfBoundsException si el índice no es válido.
     */
    public T getElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Node<T> current = last.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    /**
     * Elimina todos los elementos de la lista.
     */
    public void clear() {
        last = null;
        size = 0;
    }

    /**
     * Retorna una representación en cadena de la lista.
     *
     * @return Cadena con los elementos de la lista.
     */
    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = last.next;
        do {
            sb.append(current.data).append(", ");
            current = current.next;
        } while (current != last.next);
        return sb.substring(0, sb.length() - 2) + "]";
    }
}
