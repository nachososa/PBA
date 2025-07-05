
public class Rectangulo extends Figuras {

    /// Atributos
    private final double altura;
    private final double base;

    // Constructor
    public Rectangulo(double altura, double base, String nombre) {
        super(nombre);
        this.altura = altura;
        this.base = base;
    }

    // Getters y Setters
    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    // Reescribe: Clase Abstracta Figura
    @Override
    public double calcularArea() {
        return base * altura;
    }

    // Clase Objetc
    @Override
    public String toString() {
        return "Tipo: Rectángulo | Nombre: " + nombre + ", con base: " + base + ", altura: " + altura;
    }
}
