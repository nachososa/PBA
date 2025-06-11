package personajes;

import enemigos.Enemigo;

public class BigBoss extends Personaje implements Enemigo {

    private static final int DISTANCIA_DETECCION = 3;
    private boolean alerta;

    public BigBoss(int x, int y) {
        super(x, y);
        this.alerta = false;
    }

    @Override
    public boolean detectarSnake(Snake snake) {
        int distanciaX = Math.abs(this.getPosicion().getX() - snake.getPosicion().getX());
        int distanciaY = Math.abs(this.getPosicion().getY() - snake.getPosicion().getY());

        if (distanciaX <= DISTANCIA_DETECCION && distanciaY <= DISTANCIA_DETECCION) {
            this.alerta = true;
            return true;
        }
        return false;
    }

    @Override
    public void patrullar() {
    }

    @Override
    public boolean estaEnAlerta() {
        return alerta;
    }

    @Override
    public void setAlerta(boolean estado) {
        this.alerta = estado;
    }

    @Override
    public void moverArriba() {
    }

    @Override
    public void moverAbajo() {
    }

    @Override
    public void moverIzquierda() {
    }

    @Override
    public void moverDerecha() {
    }

    @Override
    public String toString() {
        return String.format("BigBoss [%s] en (%d,%d) - %s",
                alerta ? "ALERTA" : "Normal",
                getPosicion().getX(),
                getPosicion().getY(),
                alerta ? "¡En guardia!" : "Esperando");
    }
}
