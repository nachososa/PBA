
package metalgear;

public class Guardia extends Personaje implements Enemigo {
    public Guardia(Posicion pos) {
        super("Guardia", 50, pos);
    }

    @Override
    public void patrullar() {
        
    }
    
    @Override
    public boolean detectarSnake(Posicion jugador) {
        int dx = Math.abs(jugador.getX() - this.posicion.getX());
        int dy = Math.abs(jugador.getY() - this.posicion.getY());
        return (dx + dy == 1);
    }
    
    @Override
    public int atacar(){
        return 0;
    }


    @Override
    public void mover(String direccion) {
        
    }
}
