
public class Dolar extends Moneda {

    public Dolar(double valor) {
        super(valor);
        this.cotizacionRespectoDolar = 1.0; // 1 dólar = 1 dólar
    }

    @Override
    public Moneda suma(Moneda otra) {
        double valorConvertido = convertirAValorComun(otra);
        return new Dolar(this.valor + valorConvertido);
    }

    @Override
    public Dolar asDolar() {
        return this;
    }
}
