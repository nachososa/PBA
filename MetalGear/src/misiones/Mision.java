package misiones;

import java.util.Scanner;

public abstract class Mision {

    protected boolean completada;

    public abstract void iniciar();

    public abstract void imprimirEstado();

    public abstract void moverSnake(char direccion);

    public abstract void moverGuardias();

    public abstract boolean verificarCaptura();

    public abstract boolean verificarEscapeExitoso();

    public void ejecutar(Scanner scanner) {
        boolean activa = true;
        while (activa) {
            imprimirEstado();
            System.out.print("\nMovimiento (W/A/S/D) o Q para salir: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                activa = false;
            } else {
                char dir = input.toUpperCase().charAt(0);
                if ("WASD".indexOf(dir) >= 0) {
                    moverSnake(dir);
                    moverGuardias();

                    if (verificarCaptura()) {
                        System.out.println("¡Capturado! Misión fallida.");
                        activa = false;
                    } else if (verificarEscapeExitoso()) {
                        System.out.println("¡Misión completada!");
                        completada = true;
                        activa = false;
                    }
                } else {
                    System.out.println("Entrada inválida. Use W/A/S/D para moverse.");
                }
            }
        }
    }

    public boolean estaCompletada() {
        return completada;
    }
}
