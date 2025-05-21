package PBA_7_figura3;

// Clase abstracta: no se puede crear instancias a partir de ella,  y los métodos abstractos tienen que ser implementados por las subclases.
public abstract class Figuras {

    // Atributos protegidos
    protected String nombre;

    public Figuras(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

}
