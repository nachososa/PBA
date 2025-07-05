
public class Circulo extends Figuras {

    private double radio;
    private static final double PI = 3.1415;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Tipo: Círculo | Nombre: " + nombre + ", Radio: " + radio;
    }
}
