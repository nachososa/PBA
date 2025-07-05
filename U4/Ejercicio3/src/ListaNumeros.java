
import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {

    private final List<Integer> numeros;

    public ListaNumeros() {
        this.numeros = new ArrayList<>();
    }

    // Agrega un número al final de la lista
    public void agregarAlFinal(int numero) {
        numeros.add(numero);
    }

    // Agrega un número al principio de la lista
    public void agregarAlPrincipio(int numero) {
        numeros.add(0, numero);
    }

    // Devuelve una copia de la lista (para mantener encapsulamiento)
    public List<Integer> obtenerLista() {
        return new ArrayList<>(numeros);
    }

    // Borra todos los elementos
    public void vaciarLista() {
        numeros.clear();
    }

    // Devuelve la cantidad de elementos
    public int cantidad() {
        return numeros.size();
    }

    // Devuelve si está vacía
    public boolean estaVacia() {
        return numeros.isEmpty();
    }
}
