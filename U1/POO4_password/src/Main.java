
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Solicitar cantidad de contraseñas
        try (Scanner scanner = new Scanner(System.in)) {

            // Solicitar cantidad de contraseñas
            System.out.print("Ingrese la cantidad de contraseñas: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            Password[] passwords = new Password[n];

            // Solicitar longitud mínima
            System.out.print("Ingrese la longitud mínima de las contraseñas: ");
            int longitudMinima = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            for (int i = 0; i < n; i++) {
                String texto;

                // Pedir contraseña válida
                do {
                    System.out.print("Ingrese la contraseña #" + (i + 1) + ": ");
                    texto = scanner.nextLine();

                    if (texto.length() < longitudMinima) {
                        System.out.println("La contraseña es demasiado corta. Intente nuevamente.");
                    }
                } while (texto.length() < longitudMinima);

                // Crear objeto Password y verificar fuerza
                passwords[i] = new Password(texto);
                boolean fuerte = passwords[i].esFuerte();

                System.out.println("Contraseña #" + (i + 1) + " es " + (fuerte ? "fuerte" : "débil") + ".");
            }
        }
    }
}
