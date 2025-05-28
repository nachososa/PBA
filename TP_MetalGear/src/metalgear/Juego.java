
package metalgear;
import java.util.Scanner;

public class Juego {
    private int misionesCompletadas;
    private Scanner scanner;

    public Juego() {
        misionesCompletadas = 0;
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n=== ESCAPE DE LA BASE ===");
            System.out.println("1. Iniciar misión");
            System.out.println("2. Guardar estado");
            System.out.println("3. Cargar estado");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1 -> iniciarMision();
                case 2 -> guardarEstado();
                case 3 -> cargarEstado();
                case 4 -> System.out.println("¡Gracias por jugar!");
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    private int leerEntero() {
        while (!scanner.hasNextInt()) {
            System.out.println("Debe ingresar un número válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void iniciarMision() {
        System.out.println("\n--- Iniciando misión... ---");

        switch (misionesCompletadas) {
            case 0:
                System.out.println("Mision 1: Hangar de Entrada");
                // ejecutarMision1();
                misionesCompletadas++;
                break;
            case 1:
                System.out.println("Mision 2: Almacén de Armas");
                // ejecutarMision2();
                misionesCompletadas++;
                break;
            case 2:
                System.out.println("Mision 3: Batalla final: Metal Gear");
                // ejecutarMision3();
                misionesCompletadas++;
                break;
            default:
                System.out.println("¡Felicitaciones! Has finalizado el juego!");
        }
    }

    private void guardarEstado() {
        int codigo = misionesCompletadas;
        System.out.println("Guardado con Exito!. Tu código es: " + codigo);
    }

    private void cargarEstado() {
        System.out.print("Ingrese su código de guardado: ");
        int codigo = leerEntero();

        if (codigo % 123 == 0) {
            misionesCompletadas = codigo / 123;
            System.out.println("Estado cargado. Misiones completadas: " + misionesCompletadas);
        } else {
            System.out.println("Código inválido. No se pudo cargar el estado.");
        }
    }

        public static void main(String[] args) {
        Juego juego = new Juego();
        juego.mostrarMenu();
    }
}
