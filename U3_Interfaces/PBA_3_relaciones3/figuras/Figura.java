package figuras;

/*
Clase abstracta
No se puede crear instancias a partir de ella
Los métodos abstractos tienen que ser implementados por las subclases.
 */
public abstract class Figura {

    // Atributos protegidos
    protected String nombre;

    // Constructor
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

    // Métodos Abstractos
    public abstract double calcularArea();
}
