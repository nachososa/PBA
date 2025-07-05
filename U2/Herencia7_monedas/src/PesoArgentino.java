
public class PesoArgentino extends Moneda {

    private static final double COTIZACION = 185.0;

    public PesoArgentino(double valor) {
        super(valor);
        this.cotizacionRespectoDolar = COTIZACION;
    }

    @Override
    public Moneda suma(Moneda otra) {
        double valorConvertido = convertirAValorComun(otra);
        return new PesoArgentino(this.valor + valorConvertido);
    }

    @Override
    public Dolar asDolar() {
        return new Dolar(this.valor / COTIZACION);
    }
}
