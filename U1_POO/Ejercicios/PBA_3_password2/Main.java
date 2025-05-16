package PBA_3_password2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N;

            System.out.print("Ingrese la cantidad de contraseñas a verificar: ");
            N = sc.nextInt();
            sc.nextLine();

            Password[] contrasenas = new Password[N];

            System.out.print("Ingrese la longitud mínima requerida para las contraseñas: ");
            int longitudMinima = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < N; i++) {
                String texto;
                do {
                    System.out.print("Ingrese la contraseña #" + (i + 1) + ": ");
                    texto = sc.nextLine();

                    if (texto.length() < longitudMinima) {
                        System.out.println("La contraseña es demasiado corta. Intente de nuevo.");
                    }
                } while (texto.length() < longitudMinima);

                contrasenas[i] = new Password(texto);

                if (contrasenas[i].esFuerte()) {
                    System.out.println("La contraseña #" + (i + 1) + " es FUERTE.");
                } else {
                    System.out.println("La contraseña #" + (i + 1) + " NO es fuerte.");
                    System.out.println("Debe tener más de 2 mayúsculas, más de 1 minúscula y más de 5 números.");
                }
            }
        }
    }
}
