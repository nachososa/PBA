
import java.util.List;
import java.util.Scanner;

public class Metodos {

    public static void opcionUno(List<Integer> lista) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Opción 1: Ingresar números enteros y (-1) para finalizar.");

        int numero;
        do {
            System.out.print("Número: ");
            numero = sc.nextInt();
            if (numero != -1) {
                lista.add(numero);
            }
        } while (numero != -1);

        System.out.println("Carga finalizada. Se cargaron " + lista.size() + " elementos.");
    }

    public static void opcionDos(List<Integer> lista) {
        System.out.println("Opción 2: Mostrar contenido de la lista.");
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("Elementos de la lista: " + lista);
        }
    }

    public static void opcionTres(List<Integer> lista) {
        System.out.println("Opción 3: Vaciar la lista.");
        lista.clear();
        System.out.println("La lista fue vaciada.");
    }
}
