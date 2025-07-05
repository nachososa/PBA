
import java.util.*;

public class AccesoEstadio {

    public static void main(String[] args) {

        // Datos simulados
        Set<String> abonados = new HashSet<>(Set.of("Ana", "Carlos", "Lola"));
        Set<String> invitados = new HashSet<>(Set.of("Luis", "Bruno"));
        Set<String> menores = new HashSet<>(Set.of("Valen", "Sol"));
        Set<String> todos = new HashSet<>(Set.of("Ana", "Carlos", "Lola", "Luis", "Bruno", "Valen", "Sol", "Martin", "Sofía"));

        ControlAcceso acceso = new ControlAcceso(abonados, invitados, menores);

        Set<String> sinRestriccion = acceso.ingresarSinRestriccion();
        Set<String> conRestriccion = acceso.ingresarConRestriccion();
        Set<String> noIngresan = acceso.noIngresan(todos);

        // Mostrar resultados
        System.out.println("🔓 Ingresan sin restricción: " + sinRestriccion);
        System.out.println("🟡 Ingresan con restricción (menores acompañados): " + conRestriccion);
        System.out.println("⛔ No ingresan: " + noIngresan);
    }
}
