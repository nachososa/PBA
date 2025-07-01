package PBA_5;

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
            System.out.println("1. Matricular Alumno");
            System.out.println("2. Desmatricular Alumno");
            System.out.println("3. Listado Alfabético");
            System.out.println("4. Listado Aprobados");
            System.out.println("5. Listado Desaprobados");
            System.out.println("6. Consultar alumno por legajo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 ->
                    matricularAlumno();
                case 2 ->
                    desmatricularAlumno();
                case 3 ->
                    curso.mostrarAlumnos();
                case 4 ->
                    curso.mostrarAprobados();
                case 5 ->
                    curso.mostrarDesaprobados();
                case 6 ->
                    consultarAlumno();
                case 0 -> {
                    serializer.guardarAlumnos(curso.getAlumnos());
                    System.out.println("Datos guardados. Saliendo del programa...");
                }
                default ->
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }

    // *** MATRICULAR ALUMNOS ***
    private void matricularAlumno() {

        System.out.println("\n--- MATRICULAR NUEVO ALUMNO ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Legajo: ");
        int legajo = scanner.nextInt();

        System.out.print("Nota TP1: ");
        float nota = scanner.nextFloat();
        scanner.nextLine();

        curso.matricularAlumno(new Alumno(nombre, legajo, nota));
        System.out.println("\nAlumno matriculado correctamente!");
    }

    // *** DESMATRICULAR ALUMNOS ***
    private void desmatricularAlumno() {
        System.out.print("\nIngrese legajo del alumno a desmatricular: ");
        int legajo = scanner.nextInt();
        scanner.nextLine();

        if (curso.desmatricularAlumno(legajo)) {
            System.out.println("✅ Alumno desmatriculado correctamente.");
        } else {
            System.out.println("❌ No se encontró alumno con legajo " + legajo);
        }
    }

    // *** CONSULTAR ALUMNOS ***
    private void consultarAlumno() {
        System.out.print("\nIngrese legajo del alumno a consultar: ");
        int legajo = scanner.nextInt();
        scanner.nextLine();

        Alumno alumno = curso.consultarAlumno(legajo);

        if (alumno != null) {
            System.out.println("\n--- DATOS DEL ALUMNO ---");
            alumno.imprimirAlumno();
        } else {
            System.out.println("❌ No se encontró alumno con legajo " + legajo);
        }
    }
}
