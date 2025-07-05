
public class Solista {

    private String apellido;
    private String nombre;
    private String nacionalidad;
    private Instrumento instrumento;
    private String genero;
    private String discografica;
    private int anioInicio;

    public Solista(String apellido, String nombre, String nacionalidad, Instrumento instrumento, String genero, String discografica, int anioInicio) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.instrumento = instrumento;
        this.genero = genero;
        this.discografica = discografica;
        this.anioInicio = anioInicio;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + nacionalidad + ")"
                + (instrumento != null ? " - Instrumento: " + instrumento : "");
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
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
