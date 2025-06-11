package misiones;

import java.util.Random;
import java.util.Scanner;

public class MisionFinal {

    private int vidaSnake;
    private int vidaRex;
    private final Random random;
    private final Scanner scanner;
    private boolean snakeEsquivando;

    public MisionFinal() {
        this.vidaSnake = 100;
        this.vidaRex = 100;
        this.random = new Random();
        this.scanner = new Scanner(System.in);
        this.snakeEsquivando = false;
    }

    public void iniciarBatallaFinal() {

        int turno = 1;

        while (vidaSnake > 0 && vidaRex > 0) {

            System.out.println("-------------------------------------");
            System.out.println("TURNO " + turno);
            turnoSnake();
            if (vidaRex <= 0) {
                break;
            }
            turnoRex();
            turno++;
        }

        if (vidaSnake <= 0) {
            System.out.println("\n*** Snake ha sido derrotado. Mision fallida. ***");
        } else {
            System.out.println("\n*** REX ha sido destruido! Mision completada. ***");
        }
    }

    private void turnoSnake() {
        System.out.println();
        System.out.println("*** Snake puede: ***");
        System.out.println("1 - Disparar un misil");
        System.out.println("2 - Esquivar el ataque");
        System.out.print("\nElige una accion: ");

        String eleccion = scanner.nextLine();
        while (!eleccion.equals("1") && !eleccion.equals("2")) {
            System.out.print("Opcion invalida. Elige 1 o 2: ");
            eleccion = scanner.nextLine();
        }

        if (eleccion.equals("1")) {
            snakeEsquivando = false;
            int danio = random.nextInt(16) + 20;  // (1)

            vidaRex -= danio;
            if (vidaRex < 0) {
                vidaRex = 0;
            }
            System.out.println("Le diste a REX!");
            System.out.println("Danio producido: " + danio + " HP");
            System.out.println("Vida de REX: " + vidaRex + " HP");
        } else {
            snakeEsquivando = true;
            System.out.println("Snake se prepara para esquivar el ataque!");
        }
    }

    private void turnoRex() {
        System.out.println();
        System.out.println("*** Metal Gear REX ataca con un Canion Laser ***");

        int danio = random.nextInt(11) + 10;  // (1)

        if (snakeEsquivando) {
            int reduccion = random.nextInt(41) + 60; // (1)
            int danioReducido = danio * (100 - reduccion) / 100;
            vidaSnake -= danioReducido;
            if (vidaSnake < 0) {
                vidaSnake = 0;
            }
            System.out.println("Eludiste el ataque!");
            System.out.println("Danio producido: " + danioReducido + " HP");
        } else {
            vidaSnake -= danio;
            if (vidaSnake < 0) {
                vidaSnake = 0;
            }
            System.out.println("Impacto directo!");
            System.out.println("Danio producido: " + danio + " HP");
        }

        System.out.println("Tu vida: " + vidaSnake + " HP");
        System.out.println("Vida de REX: " + vidaRex + " HP");
    }
}
