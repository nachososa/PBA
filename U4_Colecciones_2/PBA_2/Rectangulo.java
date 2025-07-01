package PBA_2;

public class Rectangulo extends Figuras {

    private double altura;
    private double base;

    public Rectangulo(double altura, double base, String nombre) {
        super(nombre);
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Tipo: Rectángulo | Nombre: " + nombre + ", Base: " + base + ", Altura: " + altura;
    }
}
