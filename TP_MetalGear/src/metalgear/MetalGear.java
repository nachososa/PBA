
package metalgear;

public class MetalGear extends Personaje implements Enemigo {
    public MetalGear() {
        super("Metal Gear", 100, new Posicion(0, 0));
    }

    @Override
    public int atacar() {
        return (int)(Math.random() * 26 + 15); 
    }
    
    public int ataqueMisil(){
        return 0;
    }
    
    public int ataqueLaser(){
        return 0;
    }

    @Override
    public boolean detectarSnake(Posicion jugador) {
        return false;
    }

    @Override
    public void patrullar() {
       
    }

    @Override
    public void mover(String direccion) {
        
    }
}
