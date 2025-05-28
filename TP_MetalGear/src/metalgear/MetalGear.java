
package metalgear;

public class MetalGear extends Personaje implements Enemigo {
    public MetalGear() {
        super("Metal Gear REX", 100, new Posicion(0, 0));
    }

    public int atacar() {
        return (int)(Math.random() * 26 + 15); 
    }

    @Override
    public boolean detectarJugador(Posicion jugador) {
        return false; // no se usa en batalla final
    }

    @Override
    public void patrullar() {
        // No patrulla, es estático
    }

    @Override
    public void mover(String direccion) {
        // No se mueve
    }
}
