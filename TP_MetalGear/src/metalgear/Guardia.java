
package metalgear;

public class Guardia extends Personaje implements Enemigo {
    public Guardia(Posicion pos) {
        super("Guardia", 50, pos);
    }

    public void patrullar() {
        // lógica de patrulla aleatoria
    }

    public boolean detectarJugador(Posicion jugador) {
        // verifica si jugador está a 1 celda
        int dx = Math.abs(jugador.getX() - this.posicion.getX());
        int dy = Math.abs(jugador.getY() - this.posicion.getY());
        return (dx + dy == 1);
    }

    @Override
    public void mover(String direccion) {
        // puede ser llamado desde patrulla
    }
}
