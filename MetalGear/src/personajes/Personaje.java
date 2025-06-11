package personajes;

import juego.Posicion;

public abstract class Personaje {

    protected Posicion posicion;

    public Personaje(int x, int y) {
        this.posicion = new Posicion(x, y);
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public abstract void moverArriba();

    public abstract void moverAbajo();

    public abstract void moverIzquierda();

    public abstract void moverDerecha();
}
