
public class Alumno {

    // Atributos
    private String nombre;
    private int legajo;
    private float notaTP1;

    // Constructor
    public Alumno(String nombre, int legajo, float notaTP1) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.notaTP1 = notaTP1;
    }

    // Getters y Setters
    // nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // legajo
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    // notaTP1
    public float getnotaTP1() {
        return notaTP1;
    }

    public void setnotaTP1(int notaTP1) {
        this.notaTP1 = notaTP1;
    }

    // Métodos
    public void imprimirAlumno() {
        System.out.println(
                "Alumno: " + nombre
                + "\nLegajo: " + legajo
                + "\nNota TP 1: " + notaTP1
        );
    }
}
