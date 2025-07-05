
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            int opcion;

            do {
                // Mostrar menú
                System.out.println("=== MENÚ SIMPLE ===");
                System.out.println("1. Saludar");
                System.out.println("2. Mostrar fecha actual");
                System.out.println("3. Salir");
                System.out.print("Elija una opción: ");

                // Leer opción
                opcion = scanner.nextInt();

                // Ejecutar según opción
                switch (opcion) {
                    case 1 ->
                        System.out.println("¡Hola! ¿Cómo estás?");
                    case 2 ->
                        System.out.println("Hoy es 17 de mayo de 2025.");
                    case 3 ->
                        System.out.println("Saliendo...");
                    default ->
                        System.out.println("Opción inválida. Intente de nuevo.");
                }
                System.out.println();
            } while (opcion != 3);
        }
    }
}
