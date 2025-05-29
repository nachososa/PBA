
package metalgear;

public interface Enemigo {
    void patrullar();
    int atacar();
    boolean detectarSnake(Posicion jugador);
}
