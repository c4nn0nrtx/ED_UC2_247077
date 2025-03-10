package LinkedList;

/**
 * Representa una lista enlazada simple.
 *
 * @author Brandon Valenzuela
 */
public class LinkedList {

    private Nodo inicial; // Primer nodo de la lista
    private int tam; // Tamaño de la lista

    /**
     * Constructor de la lista enlazada. Inicializa la lista como vacía.
     */
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
     * @pre El dato debe ser un número entero válido.
     * @post La lista tendrá un nuevo nodo al inicio.
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
     * @pre El dato debe ser un número entero válido.
     * @post La lista tendrá un nuevo nodo al final.
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
     *
     * @pre La lista no debe estar vacía.
     * @post Se eliminará el primer nodo de la lista si existe.
     */
    public void removeFirst() {
        if (!isEmpty()) {
            inicial = inicial.siguiente;
            tam--;
        }
    }

    /**
     * Elimina el último elemento de la lista.
     *
     * @pre La lista no debe estar vacía.
     * @post Se eliminará el último nodo de la lista si existe.
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
     * @param index Índice del elemento (debe ser >= 0 y < tam).
     * @
     * return Elemento en la posición indicada o -1 si el índice es inválido.
     * @pre El índice debe estar dentro del rango de la lista.
     * @post No se modifica la lista, solo se devuelve el valor del nodo en la
     * posición indicada.
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
     *
     * @post La lista estará vacía.
     */
    public void clear() {
        inicial = null;
        tam = 0;
    }

    /**
     * Retorna una representación en cadena de la lista.
     *
     * @return Cadena con los elementos de la lista en formato [elem1, elem2,
     * ...].
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

/**
 * Representa un nodo de la lista enlazada.
 */
class Nodo {

    int dato; // Valor del nodo
    Nodo siguiente; // Referencia al siguiente nodo

    /**
     * Constructor de un nodo.
     *
     * @param dato Valor del nodo.
     */
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
