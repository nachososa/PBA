
public abstract class Moneda {

    // Atributos
    protected double valor;
    protected double cotizacionRespectoDolar;

    // Constructor
    public Moneda(double valor) {
        this.valor = valor;
    }

    // Metodos a abstractos
    public abstract Moneda suma(Moneda otra);

    public abstract Dolar asDolar();

    @Override
    public String toString() {
        return valor + " - " + getClass().getSimpleName();
    }

    protected double convertirAValorComun(Moneda otra) {
        return otra.valor * (otra.cotizacionRespectoDolar / this.cotizacionRespectoDolar);
    }
}
