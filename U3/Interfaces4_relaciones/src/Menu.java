
import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        try (scanner) {
            int opcion;

            do {
                mostrarMenu();
                opcion = obtenerOpcion();
                procesarOpcion(opcion);
            } while (opcion != 9);
        }
    }

    private void mostrarMenu() {
        System.out.println("\nMenu Principal");
        System.out.println("1. Cargar Figura");
        System.out.println("2. Mostrar Figuras");
        System.out.println("3. Borrar Última Figura");
        System.out.println("4. Ver si hay figuras iguales");
        System.out.println("5. Figura de mayor área");
        System.out.println("6. Figura de menor área");
        System.out.println("7. Figuras de áreas iguales");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    private int obtenerOpcion() {
        return scanner.nextInt();
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1 ->
                System.out.println("Opción seleccionada: Cargar Figura");
            case 2 ->
                System.out.println("Opción seleccionada: Mostrar Figuras");
            case 3 ->
                System.out.println("Opción seleccionada: Borrar Última Figura");
            case 4 ->
                System.out.println("Opción seleccionada: Ver si hay figuras iguales");
            case 5 ->
                System.out.println("Opción seleccionada: Figura de mayor área");
            case 6 ->
                System.out.println("Opción seleccionada: Figura de menor área");
            case 7 ->
                System.out.println("Opción seleccionada: Figuras de áreas iguales");
            case 9 ->
                System.out.println("Saliendo del programa...");
            default ->
                System.out.println("Opción no válida");
        }
    }
}
