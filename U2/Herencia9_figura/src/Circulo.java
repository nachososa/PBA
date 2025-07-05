
public class Circulo extends Figuras {

    private double Pi = 3.1415;
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPi() {
        return Pi;
    }

    public void setPi(double Pi) {
        this.Pi = Pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double Radio) {
        this.radio = Radio;
    }

    @Override
    public double calcularArea() {
        @SuppressWarnings("unused")
        double area;
        return area = Pi * radio * radio;
        //ojo, podemos hacer directamente --> return  Pi * Radio * Radio
    }

    @Override
    public String toString() {
        return "Tipo: Círculo | Nombre: " + getNombre() + ", con radio: " + getRadio();
    }
}
