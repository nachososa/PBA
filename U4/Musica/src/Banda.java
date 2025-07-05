
public class Banda {

    private final String nombre;
    private String genero;
    private String discografica;
    private int anioInicio;

    public Banda(String nombre, String genero, String discografica, int anioInicio) {
        this.nombre = nombre;
        this.genero = genero;
        this.discografica = discografica;
        this.anioInicio = anioInicio;
    }

    @Override
    public String toString() {
        return "Banda: " + nombre + " (" + anioInicio + ")";
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public int getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(int anioInicio) {
        this.anioInicio = anioInicio;
    }
}
