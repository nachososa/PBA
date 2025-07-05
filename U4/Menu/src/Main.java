
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Lista principal
        List<Integer> lista = new ArrayList<>();

        // Scanner en bloque try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {

            boolean salir = false;

            while (!salir) {
                System.out.println("\n--- MENÚ ---");
                System.out.println("1. Cargar números en la lista.");
                System.out.println("2. Mostrar contenido de la lista.");
                System.out.println("3. Vaciar la lista.");
                System.out.println("0. Salir");
                System.out.print("Opción: ");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 ->
                        Metodos.opcionUno(lista);
                    case 2 ->
                        Metodos.opcionDos(lista);
                    case 3 ->
                        Metodos.opcionTres(lista);
                    case 0 ->
                        salir = true;
                    default ->
                        System.out.println("Opción inválida.");
                }
            }

            System.out.println("Programa finalizado.");
        }
    }
}
