// Menu de nagvegación
package ui;

import java.util.Scanner;

public class Menu {

    // Atributos
    private final Scanner scanner;

    // Constructor
    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    // Metodos
    public void mostrar() {
        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Nueva partida");
            System.out.println("2. Cargar partida");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 ->
                        iniciarNuevaPartida();
                    case 2 ->
                        cargarPartida();
                    case 3 ->
                        System.out.println("¡Hasta luego!");
                    default ->
                        System.out.println("Opción inválida. Por favor, elija 1-3.");
                }
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.nextLine();
                opcion = 0;
            }

        } while (opcion != 3);
    }

    private void iniciarNuevaPartida() {
        System.out.println("\n[Simulación] Iniciando nueva partida...");
        System.out.println("¡Partida iniciada con éxito!");
    }

    private void cargarPartida() {
        System.out.println("\n[Simulación] Cargando partida...");
        System.out.println("¡Partida cargada con éxito!");
    }
}
