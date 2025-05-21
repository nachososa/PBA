package PBA_6_figura2;

public abstract class Figura {

    // Atributos protected
    protected String nombre;

    // Constructores
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos abstractos
    public abstract double calcularArea();
}
