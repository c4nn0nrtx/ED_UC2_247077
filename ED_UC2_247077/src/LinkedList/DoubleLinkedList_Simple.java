package LinkedList;

/**
 *
 * @author brand
 */
/**
 * Clase Nodo que representa un elemento de la Lista Doblemente Enlazada (LDE).
 *
 * @param <T> Tipo de dato almacenado en el nodo.
 */
class Nodo<T> {

    T dato;
    Nodo<T> anterior, siguiente;

    /**
     * Constructor del nodo.
     *
     * @param dato El dato a almacenar en el nodo.
     */
    public Nodo(T dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}

/**
 * Clase Lista Doblemente Enlazada (LDE) con métodos básicos.
 *
 * @param <T> Tipo de datos que manejará la lista.
 */
public class DoubleLinkedList_Simple<T> {

    private Nodo<T> inicial;
    private int contador;

    /**
     * Constructor que inicializa la lista vacía.
     */
    public DoubleLinkedList_Simple() {
        this.inicial = null;
        this.contador = 0;
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
     * Retorna el tamaño de la lista.
     *
     * @return Número de elementos en la lista.
     */
    public int size() {
        return contador;
    }

    /**
     * Agrega un elemento al inicio de la lista.
     *
     * @param dato El dato a agregar.
     */
    public void addFirst(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (isEmpty()) {
            inicial = nuevo;
        } else {
            nuevo.siguiente = inicial;
            inicial.anterior = nuevo;
            inicial = nuevo;
        }
        contador++;
    }

    /**
     * Agrega un elemento al final de la lista.
     *
     * @param dato El dato a agregar.
     */
    public void addLast(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (isEmpty()) {
            inicial = nuevo;
        } else {
            Nodo<T> temp = inicial;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.anterior = temp;
        }
        contador++;
    }

    /**
     * Elimina el primer elemento de la lista.
     */
    public void removeFirst() {
        if (!isEmpty()) {
            inicial = inicial.siguiente;
            if (inicial != null) {
                inicial.anterior = null;
            }
            contador--;
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
                Nodo<T> temp = inicial;
                while (temp.siguiente != null) {
                    temp = temp.siguiente;
                }
                temp.anterior.siguiente = null;
            }
            contador--;
        }
    }

    /**
     * Verifica si un elemento está en la lista.
     *
     * @param dato El elemento a buscar.
     * @return true si el elemento está en la lista, false en caso contrario.
     */
    public boolean contains(T dato) {
        Nodo<T> temp = inicial;
        while (temp != null) {
            if (temp.dato.equals(dato)) {
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }

    /**
     * Obtiene un elemento de la lista por su índice.
     *
     * @param index Índice del elemento.
     * @return El elemento en la posición indicada.
     */
    public T getElement(int index) {
        if (index < 0 || index >= contador) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Nodo<T> temp = inicial;
        for (int i = 0; i < index; i++) {
            temp = temp.siguiente;
        }
        return temp.dato;
    }

    /**
     * Elimina todos los elementos de la lista.
     */
    public void clear() {
        inicial = null;
        contador = 0;
    }

    /**
     * Representación en cadena de la lista.
     *
     * @return Cadena con los elementos de la lista.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> temp = inicial;
        while (temp != null) {
            sb.append(temp.dato);
            if (temp.siguiente != null) {
                sb.append(" <-> ");
            }
            temp = temp.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }
}
