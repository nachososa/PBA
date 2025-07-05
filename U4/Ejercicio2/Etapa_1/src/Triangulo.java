
public class Triangulo extends Figuras {

    /// Atributos
    private final double base;
    private final double altura;

    // Constructor
    public Triangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Getters y Setters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Reescribe: Clase Abstracta Figura
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Clase Objetc
    @Override
    public String toString() {
        return "Tipo: Triángulo | Nombre: " + nombre + ", con base: " + base + ", altura: " + altura;
    }
}
