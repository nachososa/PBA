
import java.util.ArrayList;
import java.util.List;

public class Curso {

    private final List<Alumno> alumnos;

    public Curso(List<Alumno> alumnosIniciales) {
        this.alumnos = new ArrayList<>(alumnosIniciales);
    }

    public void matricularAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void mostrarAlumnos() {
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

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
