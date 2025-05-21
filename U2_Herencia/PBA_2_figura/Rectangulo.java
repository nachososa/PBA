package PBA_2_figura;

// Subclase de Figura
public class Rectangulo extends Figura {

    // Atributos privados
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Getters y Setter
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
        return this.base * this.altura;
    }
}
