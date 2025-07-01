package PBA_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Curso {

    private final List<Alumno> alumnos;

    public Curso(List<Alumno> alumnosIniciales) {
        this.alumnos = new ArrayList<>(alumnosIniciales);
    }

    // Agregar Alumno
    public void matricularAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    // Eliminar Alumno
    public boolean desmatricularAlumno(int legajo) {
        return alumnos.removeIf(alumno -> alumno.getLegajo() == legajo);
    }

    // Listado de Alumnos Alfabético
    public void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("\nNo hay alumnos registrados.");
            return;
        }

        System.out.println("\n--- LISTA DE ALUMNOS (ORDEN ALFABÉTICO) ---");

        alumnos.stream()
                .sorted(Comparator.comparing(Alumno::getNombre, String.CASE_INSENSITIVE_ORDER))
                .forEach(alumno -> {
                    alumno.imprimirAlumno();
                    System.out.println("----------------------");
                });
    }

    // Listado de Alumnos Aprobados (nota >= 7) en orden alfabético
    public void mostrarAprobados() {
        if (alumnos.isEmpty()) {
            System.out.println("\nNo hay alumnos registrados.");
            return;
        }

        System.out.println("\n--- LISTA DE ALUMNOS APROBADOS (ORDEN ALFABÉTICO) ---");

        alumnos.stream()
                .filter(alumno -> alumno.getnotaTP1() >= 7) // Usar el nombre actual del getter
                .sorted(Comparator.comparing(Alumno::getNombre, String.CASE_INSENSITIVE_ORDER))
                .forEach(alumno -> {
                    alumno.imprimirAlumno();
                    System.out.println("----------------------");
                });
    }

    // Listado de Alumnos Desaprobados (nota < 4) en orden alfabético
    public void mostrarDesaprobados() {
        if (alumnos.isEmpty()) {
            System.out.println("\nNo hay alumnos registrados.");
            return;
        }

        System.out.println("\n--- LISTA DE ALUMNOS DESAPROBADOS (ORDEN ALFABÉTICO) ---");

        alumnos.stream()
                .filter(alumno -> alumno.getnotaTP1() < 4) // Filtra desaprobados
                .sorted(Comparator.comparing(Alumno::getNombre, String.CASE_INSENSITIVE_ORDER))
                .forEach(alumno -> {
                    alumno.imprimirAlumno();
                    System.out.println("----------------------");
                });
    }

    // consultarAlumno
    public Alumno consultarAlumno(int legajo) {
        return alumnos.stream()
                .filter(a -> a.getLegajo() == legajo)
                .findFirst()
                .orElse(null);
    }

    // getter que devuelve la lista completa de alumnos almacenada en la clase Curso
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
