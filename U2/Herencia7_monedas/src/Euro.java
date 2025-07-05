
public class Euro extends Moneda {

    // Cotización aproximada: 1 Euro = 1.2 Dólares (ejemplo)
    private static final double COTIZACION = 1.2;

    public Euro(double valor) {
        super(valor);
        this.cotizacionRespectoDolar = COTIZACION;
    }

    @Override
    public Moneda suma(Moneda otra) {
        double valorConvertido = convertirAValorComun(otra);
        return new Euro(this.valor + valorConvertido);
    }

    @Override
    public Dolar asDolar() {
        return new Dolar(this.valor * COTIZACION);
    }

    @Override
    public String toString() {
        return String.format("%.2f - Euros", valor);
    }
}
