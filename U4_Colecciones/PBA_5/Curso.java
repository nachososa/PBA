package PBA_5;

import java.util.ArrayList;
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
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getLegajo() == legajo) {
                alumnos.remove(i);
                return true;
            }
        }
        return false;
    }

    // Ordenar alumnos por nombre (helper method)
    private void ordenarAlumnosPorNombre() {
        alumnos.sort((a1, a2) -> a1.getNombre().compareToIgnoreCase(a2.getNombre()));
    }

    // Listado de Alumnos Alfabético
    public void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("\nNo hay alumnos registrados.");
            return;
        }

        System.out.println("\n--- LISTA DE ALUMNOS (ORDEN ALFABÉTICO) ---");
        ordenarAlumnosPorNombre();

        for (Alumno alumno : alumnos) {
            alumno.imprimirAlumno();
            System.out.println("----------------------");
        }
    }

    // Listado de Alumnos Aprobados
    public void mostrarAprobados() {
        if (alumnos.isEmpty()) {
            System.out.println("\nNo hay alumnos registrados.");
            return;
        }

        System.out.println("\n--- LISTA DE ALUMNOS APROBADOS (ORDEN ALFABÉTICO) ---");
        ordenarAlumnosPorNombre();

        for (Alumno alumno : alumnos) {
            if (alumno.getnotaTP1() >= 7) {
                alumno.imprimirAlumno();
                System.out.println("----------------------");
            }
        }
    }

    // Listado de Alumnos Desaprobados
    public void mostrarDesaprobados() {
        if (alumnos.isEmpty()) {
            System.out.println("\nNo hay alumnos registrados.");
            return;
        }

        System.out.println("\n--- LISTA DE ALUMNOS DESAPROBADOS (ORDEN ALFABÉTICO) ---");
        ordenarAlumnosPorNombre();

        for (Alumno alumno : alumnos) {
            if (alumno.getnotaTP1() < 4) {
                alumno.imprimirAlumno();
                System.out.println("----------------------");
            }
        }
    }

    // Consultar Alumno
    public Alumno consultarAlumno(int legajo) {
        for (Alumno alumno : alumnos) {
            if (alumno.getLegajo() == legajo) {
                return alumno;
            }
        }
        return null;
    }

    // Getter de alumnos
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
