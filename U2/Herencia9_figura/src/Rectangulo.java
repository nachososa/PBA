
public class Rectangulo extends Figuras {

    private double altura;
    private double base;

    public Rectangulo(double altura, double base, String nombre) {
        super(nombre);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        @SuppressWarnings("unused")
        double area;
        return area = (base * altura) / 2;
        //ojo, podemos hacer directamente --> return  (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Tipo: Rectángulo | Nombre: " + getNombre() + ", con base: " + getBase() + ", altura: " + getAltura();
    }
}
