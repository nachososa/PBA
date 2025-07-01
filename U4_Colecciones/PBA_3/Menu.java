package PBA_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private final List<Alumno> alumnos;
    private final Scanner scanner;
    private final Serialize serializer;

    public Menu() {
        this.serializer = new Serialize();
        this.alumnos = new ArrayList<>(serializer.cargarAlumnos());
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE ALUMNOS ---");
            System.out.println("1. Agregar nuevo alumno");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 ->
                    agregarAlumno();
                case 2 ->
                    mostrarAlumnos();
                case 0 -> {
                    serializer.guardarAlumnos(alumnos);
                    System.out.println("Datos guardados. Saliendo del programa...");
                }
                default ->
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }

    private void agregarAlumno() {
        System.out.println("\n--- NUEVO ALUMNO ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Legajo: ");
        int legajo = scanner.nextInt();
        System.out.print("Nota TP1: ");
        float nota = scanner.nextFloat();
        scanner.nextLine(); // Limpiar buffer

        alumnos.add(new Alumno(nombre, legajo, nota));
        System.out.println("\nAlumno agregado correctamente!");
    }

    private void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("\nNo hay alumnos registrados.");
            return;
        }

        System.out.println("\n--- LISTA DE ALUMNOS ---");
        alumnos.forEach(alumno -> {
            alumno.imprimirAlumno();
            System.out.println("----------------------");
        });
    }
}
