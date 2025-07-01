package PBA_1;

/*
Clases Abstractas

Son clases que:
- No pueden instanciar directamente.

Pueden contener:
- Métodos abstractos (sin cuerpo, como calcularArea()).
- Métodos con implementación (como getNombre() o setNombre()).
- Atributos, constructores y lógica común.


 */
public abstract class Figuras {

    // Atributos
    protected String nombre;

    // Constructor
    public Figuras(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodos
    public abstract double calcularArea();
}
