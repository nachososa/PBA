
package metalgear;

public interface Enemigo {
    void patrullar();
    boolean detectarJugador(Posicion jugador);
}
