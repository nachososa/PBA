
import java.util.ArrayList;
import java.util.List;

public class Disco {

    private String titulo;
    private int anio;
    private Object interprete;
    private List<Cancion> canciones;

    public Disco(String titulo, int anio, Object interprete) {
        this.titulo = titulo;
        this.anio = anio;
        this.interprete = interprete;
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public Object getInterprete() {
        return interprete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("🎵 Disco: ").append(titulo)
                .append(" (").append(anio).append(")\n")
                .append("👤 Intérprete: ").append(interprete).append("\n")
                .append("📀 Canciones:\n");
        for (Cancion c : canciones) {
            sb.append(" - ").append(c).append("\n");
        }
        return sb.toString();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setInterprete(Object interprete) {
        this.interprete = interprete;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }
}
