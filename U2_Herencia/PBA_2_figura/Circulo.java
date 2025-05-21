package PBA_2_figura;

public class Circulo extends Figura {

    // Atributos privados
    private static final double PI = 3.1415;
    private double radio;

    // Constructor
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // Getters y Setters
    // Radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // PI: no tiene setter ya que es una constante.
    public double getPI() {
        return PI;
    }

    // Sobreescribimos obligatoriamente el método calcularArea()
    @Override
    public double calcularArea() {
        double area = PI * radio * radio;
        return area;
    }

}
