// Triangulo hereda de figura

public class Triangulo extends Figura {

    // Atributos privados
    private double base;
    private double altura;

    // Constructores
    public Triangulo(double base, double altura, String nombre) {
        // hereda de figura
        super(nombre);

        // define dos atributos propios
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

    // Sobreescritura de métodos

    /*
    Método equals(): Es importante incluir una verificación con instanceof. Se está forzando el downcasting sin verificar el tipo del objeto (Triangulo t = (Triangulo) obj;). Esto puede causar una excepción ClassCastException si se pasa un objeto que no es de tipo Triangulo.
    
    Uso de == para double: Comparar double con == puede generar errores por precisión. En contextos reales se usa una tolerancia (epsilon) para comparar.
     */
    // calcularArea
    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    // toString
    @Override
    public String toString() {
        String mensaje = "TRIANGULO " + this.nombre
                + " - Base: " + this.base
                + " cmts de base - Altura:  " + this.altura
                + " cmts.";

        return mensaje;
    }

    @Override
    // equals
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Triangulo t = (Triangulo) obj;
        return this.base == t.base && this.altura == t.altura;
    }

    // equals
    @Override
    public int hashCode() {
        return Double.hashCode(base) * 31 + Double.hashCode(altura);
    }
}
