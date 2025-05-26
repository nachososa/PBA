package numeros;

import relaciones.IRelacionable;

public class Numero implements IRelacionable {

    // Atributos
    private int valor;

    // Constructor
    public Numero(int valor) {
        this.valor = valor;
    }

    // Getters y Setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Metodos
    @Override
    public boolean esMayor(Object o) {
        if (o instanceof Numero numero) {
            return this.valor > numero.valor;
        }
        return false;
    }

    @Override
    public boolean esMenor(Object o) {
        if (o instanceof Numero numero) {
            return this.valor < numero.valor;
        }
        return false;
    }

    @Override
    public boolean esIgual(Object o) {
        if (o instanceof Numero numero) {
            return this.valor == numero.valor;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
