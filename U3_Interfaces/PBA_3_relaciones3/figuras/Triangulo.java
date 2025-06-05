package figuras;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        @SuppressWarnings("unused")
        double area;
        return area = base * altura;
    }

    @Override
    public String toString() {
        return "Tipo: Triángulo | Nombre: " + getNombre() + ", con base: " + getBase() + ", altura: " + getAltura();
    }
}
