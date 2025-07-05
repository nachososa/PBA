
import java.util.*;

public class OperacionesLista {

    public static void imprimirLista(List<Integer> lista) {
        System.out.println("Lista actual: " + lista);
    }

    public static void contarParesEImpares(List<Integer> lista) {
        int pares = 0;
        int impares = 0;
        for (int n : lista) {
            if (n % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares + " | Impares: " + impares);
    }

    public static void reemplazarImparesPorCero(List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 != 0) {
                lista.set(i, 0);
            }
        }
        System.out.println("Impares reemplazados por 0.");
    }

    public static void mostrarMaximoYMinimo(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        int max = Collections.max(lista);
        int min = Collections.min(lista);
        System.out.println("Máximo: " + max + " | Mínimo: " + min);
    }

    public static void eliminarMayoresA100(List<Integer> lista) {
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next() > 100) {
                it.remove();
            }
        }
        System.out.println("Números mayores a 100 eliminados.");
    }

    public static void trabajarConCopia(List<Integer> listaOriginal) {
        List<Integer> copia = new ArrayList<>(listaOriginal);
        System.out.println("Trabajando sobre una copia. Lista original: " + listaOriginal);
        reemplazarImparesPorCero(copia);
        eliminarMayoresA100(copia);
        mostrarMaximoYMinimo(copia);
        ordenarEImprimir(copia);
    }

    public static void ordenarEImprimir(List<Integer> lista) {
        List<Integer> copiaOrdenada = new ArrayList<>(lista);
        Collections.sort(copiaOrdenada);
        System.out.println("Lista ordenada: " + copiaOrdenada);
    }
}
