package personajes;

public class Snake extends Personaje {

    private boolean tieneLlave;

    public Snake(int x, int y) {
        super(x, y);
        this.tieneLlave = false;
    }

    public boolean tieneLlave() {
        return tieneLlave;
    }

    public void recogerLlave() {
        this.tieneLlave = true;
    }

    @Override
    public void moverArriba() {
        this.posicion.setY(this.posicion.getY() + 1);
    }

    @Override
    public void moverAbajo() {
        this.posicion.setY(this.posicion.getY() - 1);
    }

    @Override
    public void moverIzquierda() {
        this.posicion.setX(this.posicion.getX() - 1);
    }

    @Override
    public void moverDerecha() {
        this.posicion.setX(this.posicion.getX() + 1);
    }
}
