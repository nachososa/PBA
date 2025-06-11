package personajes;

import enemigos.Enemigo;
import juego.Mapa;
import juego.Posicion;

public class Guardia extends Personaje implements Enemigo {

    private static final int DISTANCIA_DETECCION = 1;

    private boolean alerta;

    public Guardia(int x, int y) {
        super(x, y);
        this.alerta = false;
    }

    @Override
    public void moverArriba() {
        if (puedeMoverse(0, 1)) {
            this.getPosicion().setY(this.getPosicion().getY() + 1);
        }
    }

    @Override
    public void moverAbajo() {
        if (puedeMoverse(0, -1)) {
            this.getPosicion().setY(this.getPosicion().getY() - 1);
        }
    }

    @Override
    public void moverIzquierda() {
        if (puedeMoverse(-1, 0)) {
            this.getPosicion().setX(this.getPosicion().getX() - 1);
        }
    }

    @Override
    public void moverDerecha() {
        if (puedeMoverse(1, 0)) {
            this.getPosicion().setX(this.getPosicion().getX() + 1);
        }
    }

    //
    private boolean puedeMoverse(int deltaX, int deltaY) {
        Posicion nuevaPos = new Posicion(
                this.getPosicion().getX() + deltaX,
                this.getPosicion().getY() + deltaY
        );
        return Mapa.getInstance().esPosicionValida(nuevaPos);
    }

    @Override
    public void patrullar() {
        int direccion = (int) (Math.random() * 4);
        switch (direccion) {
            case 0 ->
                moverArriba();
            case 1 ->
                moverAbajo();
            case 2 ->
                moverIzquierda();
            case 3 ->
                moverDerecha();
        }
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
    public boolean estaEnAlerta() {
        return alerta;
    }

    //
    @Override
    public void setAlerta(boolean estado) {
        this.alerta = estado;
    }
}
