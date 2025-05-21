package PBA_2_figura;

public abstract class Figura {

    // Atributos protegidos
    protected String nombre;

    // Constructor
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos abstractos
    public abstract double calcularArea();

}
