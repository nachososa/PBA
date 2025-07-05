
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Loteria {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese cantidad de números a sortear: ");
            int cantidad = scanner.nextInt();

            System.out.print("Ingrese rango máximo para los números: ");
            int maximo = scanner.nextInt();

            // Validación básica
            if (cantidad > maximo) {
                System.out.println("Error: La cantidad no puede ser mayor que el rango máximo.");
                return;
            }

            // Creamos el sorteador y generamos los números sorteados
            Sorteador sorteador = new Sorteador(maximo, cantidad);
            Set<Integer> numerosSorteados = sorteador.sortea();

            // Simulamos "mis números" que también son aleatorios
            Set<Integer> misNumeros = sorteador.sortea();

            // Calcular números acertados (intersección)
            Set<Integer> numerosAcertados = new TreeSet<>(numerosSorteados);
            numerosAcertados.retainAll(misNumeros);

            // Mostrar resultados
            Utils.imprimirSet(numerosSorteados, "Números sorteados");
            Utils.imprimirSet(misNumeros, "Mis números");
            Utils.imprimirSet(numerosAcertados, "Números acertados");
        }
    }
}
