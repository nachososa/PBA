package enemigos;

import personajes.Snake;

public interface Enemigo {

    boolean detectarSnake(Snake snake);

    void patrullar();

    boolean estaEnAlerta();

    void setAlerta(boolean estado);
}
