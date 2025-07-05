// Hereda de Figura

public class Triangulo extends Figura {

    // Atributos
    private double base;
    private double altura;

    // Constructor
    public Triangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Getters y Setters
    // Base
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // Altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Sobreescribimos obligatoriamente el método calcularArea()  
    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }

}
