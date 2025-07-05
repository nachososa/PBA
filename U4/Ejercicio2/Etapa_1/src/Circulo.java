
public class Circulo extends Figuras {

    /// Atributos
    private static final double PI = 3.1415;
    private double radio;

    // Constructor
    public Circulo(double radio, String nombre) {
        super(nombre); // Clase Abstracta Figura
        this.radio = radio;
    }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Reescribe: Clase Abstracta Figura
    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    // Clase Objetc
    @Override
    public String toString() {
        return "Tipo: Círculo | Nombre: " + nombre + ", con radio: " + radio;
    }
}
