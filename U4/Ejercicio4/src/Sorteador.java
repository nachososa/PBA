
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Sorteador {

    private final int numeroMaximo;
    private final int cantidadNumeros;

    public Sorteador(int numeroMaximo, int cantidadNumeros) {
        this.numeroMaximo = numeroMaximo;
        this.cantidadNumeros = cantidadNumeros;
    }

    /**
     * Genera una colección de números únicos aleatorios dentro del rango. Usa
     * TreeSet para mantener ordenados los números.
     */
    public Set<Integer> sortea() {
        Set<Integer> numerosSorteados = new TreeSet<>();
        Random random = new Random();

        while (numerosSorteados.size() < cantidadNumeros) {
            int numeroAleatorio = random.nextInt(numeroMaximo) + 1; // 1 a numeroMaximo
            numerosSorteados.add(numeroAleatorio);
        }

        return numerosSorteados;
    }
}
