
public class PesoPeruano extends Moneda {

    private static final double COTIZACION = 3.33;

    public PesoPeruano(double valor) {
        super(valor);
        this.cotizacionRespectoDolar = 1 / COTIZACION;
    }

    @Override
    public Moneda suma(Moneda otra) {
        double valorConvertido = convertirAValorComun(otra);
        return new PesoPeruano(this.valor + valorConvertido);
    }

    @Override
    public Dolar asDolar() {
        return new Dolar(this.valor / COTIZACION);
    }

    @Override
    public String toString() {
        return String.format("%.2f - Soles Peruanos", valor);
    }
}
