
import java.util.Set;

public class Utils {

    /**
     * Imprime en una línea los números de un Set separados por espacios.
     */
    public static void imprimirSet(Set<Integer> numeros, String mensaje) {
        System.out.print(mensaje + ": ");
        for (Integer num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
