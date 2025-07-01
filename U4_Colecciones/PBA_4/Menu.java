package PBA_4;

import java.util.Scanner;

public class Menu {

    private final Curso curso;
    private final Scanner scanner;
    private final Serialize serializer;

    public Menu() {
        this.serializer = new Serialize();
        this.curso = new Curso(serializer.cargarAlumnos());
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE ALUMNOS ---");
            System.out.println("1. Matricular nuevo alumno");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 ->
                    matricularAlumno();
                case 2 ->
                    curso.mostrarAlumnos();
                case 0 -> {
                    serializer.guardarAlumnos(curso.getAlumnos());
                    System.out.println("Datos guardados. Saliendo del programa...");
                }
                default ->
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }

    private void matricularAlumno() {
        System.out.println("\n--- NUEVO ALUMNO ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Legajo: ");
        int legajo = scanner.nextInt();
        System.out.print("Nota TP1: ");
        float nota = scanner.nextFloat();
        scanner.nextLine();

        curso.matricularAlumno(new Alumno(nombre, legajo, nota));
        System.out.println("\nAlumno agregado correctamente!");
    }
}
