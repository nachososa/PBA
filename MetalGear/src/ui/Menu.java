package ui;

import java.util.Scanner;
import misiones.Almacen;
import misiones.Hangar;
import misiones.MisionFinal;
import utils.Guardado;

public class Menu {

    private final Scanner scanner;
    private int misionesCompletadas = 0;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrar() {
        String input;
        int opcion = 0;

        do {
            mostrarTitulo("METAL GEAR: THE BLOODY MISSION");

            System.out.println("\nSelecciona tu opcion:");
            System.out.println("1. " + capitalizar(obtenerNombreMisionActual()));
            if (misionesCompletadas >= 1) {
                System.out.println("2. Guardar partida");
            }
            System.out.println("3. Cargar partida");
            System.out.println("4. Salir");
            mostrarSeparador();
            System.out.print("\nIngresa una opcion: ");

            input = scanner.nextLine();

            try {
                opcion = Integer.parseInt(input);

                switch (opcion) {
                    case 1 ->
                        iniciarMisionActual();

                    case 2 -> {
                        if (misionesCompletadas >= 1) {
                            Guardado.guardarEstado(misionesCompletadas);
                        } else {
                            System.out.println("Debes completar la Mision 1 antes de guardar una partida.");
                        }
                    }

                    case 3 -> {
                        System.out.print("Ingresa el codigo de partida: ");
                        String codigo = scanner.nextLine().trim().toUpperCase();
                        int estado = Guardado.cargarEstadoPorCodigo(codigo);
                        if (estado >= 0) {
                            misionesCompletadas = estado;
                            System.out.println("Partida cargada. Estado actual: " + capitalizar(obtenerNombreMisionActual()));
                        } else {
                            System.out.println("Codigo invalido o partida no encontrada.");
                        }
                    }

                    case 4 ->
                        System.out.println("\nHasta luego, Snake!");

                    default ->
                        System.out.println("Opcion invalida. Por favor, elija una opcion valida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un numero valido.");
            }

        } while (opcion != 4);
    }

    private void iniciarMisionActual() {
        switch (misionesCompletadas) {
            case 0 ->
                iniciarMision1();
            case 1 ->
                iniciarMision2();
            case 2 ->
                iniciarMision3();
            default -> {
                System.out.println("\nHas completado todas las misiones!");
                System.out.print("¿Deseas reiniciar el juego? (S/N): ");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("S")) {
                    misionesCompletadas = 0;
                    iniciarMision1();
                }
            }
        }
    }

    private void iniciarMision1() {
        mostrarTitulo("MISION 1: HANGAR DE ENTRADA");
        System.out.println("\nPara completar esta mision Snake debe:");
        System.out.println("- Encontrar la tarjeta de acceso (L)");
        System.out.println("- Llegar a la puerta del hangar (H)");
        mostrarSeparador();

        Hangar mision = new Hangar();
        mision.iniciarMision1();

        boolean misionActiva = true;
        while (misionActiva) {
            mision.imprimirEstado();
            System.out.print("\nMovimiento (W/A/S/D) o Q para salir: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                misionActiva = false;
            } else if (!input.isEmpty()) {
                char direccion = input.toUpperCase().charAt(0);
                if ("WASD".indexOf(direccion) >= 0) {
                    mision.moverSnake(direccion);
                    mision.moverGuardias();

                    if (mision.verificarCaptura()) {
                        System.out.println("Capturado! Mision fallida.");
                        misionActiva = false;
                    } else if (mision.verificarEscapeExitoso()) {
                        System.out.println("Mision completada! Has escapado del hangar.");
                        misionesCompletadas = 1;
                        misionActiva = false;
                    }
                } else {
                    System.out.println("Entrada invalida. Use W/A/S/D para moverse.");
                }
            }
        }
    }

    private void iniciarMision2() {
        mostrarTitulo("MISION 2: ALMACEN DE ARMAS");
        System.out.println("\nPara completar esta mision Snake debe:");
        System.out.println("- Encontrar el explosivo (C)");
        System.out.println("- Llegar al punto de extraccion (P)");
        System.out.println("- Asegurarse que no haya enemigos a 3 celdas");
        mostrarSeparador();

        Almacen mision = new Almacen();
        mision.iniciarMision2();

        boolean misionActiva = true;
        while (misionActiva) {
            mision.imprimirEstado();
            System.out.print("\nMovimiento (W/A/S/D) o Q para salir: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                misionActiva = false;
            } else if (!input.isEmpty()) {
                char direccion = input.toUpperCase().charAt(0);
                if ("WASD".indexOf(direccion) >= 0) {
                    mision.moverSnake(direccion);
                    mision.moverGuardias();

                    if (mision.verificarCaptura()) {
                        System.out.println("Capturado! Mision fallida.");
                        misionActiva = false;
                    } else if (mision.verificarEscapeExitoso()) {
                        System.out.println("Mision completada! Has asegurado el almacen.");
                        misionesCompletadas = 2;
                        misionActiva = false;
                    }
                } else {
                    System.out.println("Entrada invalida. Use W/A/S/D para moverse.");
                }
            }
        }
    }

    private void iniciarMision3() {
        mostrarTitulo("MISION FINAL: METAL GEAR REX");
        System.out.println("\nPara completar esta mision Snake debe:");
        System.out.println("- Derrotar a Metal Gear REX en una batalla por turnos.");
        System.out.println(" ");

        MisionFinal mision = new MisionFinal();
        mision.iniciarBatallaFinal();

        misionesCompletadas = 3;
    }

    private String obtenerNombreMisionActual() {
        return switch (misionesCompletadas) {
            case 0 ->
                "mision 1: Hangar de entrada";
            case 1 ->
                "mision 2: Almacen de armas";
            case 2 ->
                "mision final: Metal Gear REX";
            default ->
                "juego (reiniciar)";
        };
    }

    private void mostrarTitulo(String titulo) {
        System.out.println("========================================");
        System.out.println("  " + titulo);
        System.out.println("========================================");
    }

    private void mostrarSeparador() {
        System.out.println("----------------------------------------");
    }

    private String capitalizar(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }
}
