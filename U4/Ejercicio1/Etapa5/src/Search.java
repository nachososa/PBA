
import java.util.List;

public class Search {

    public static Alumno buscarAlumno(List<Alumno> alumnos, Object criterio) {
        if (criterio instanceof Integer) {
            int legajo = (int) criterio;
            return alumnos.stream()
                    .filter(a -> a.getLegajo() == legajo)
                    .findFirst()
                    .orElse(null);
        } else if (criterio instanceof String nombre) {
            return alumnos.stream()
                    .filter(a -> a.getNombre().equalsIgnoreCase(nombre))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }
}
