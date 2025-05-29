
package metalgear;

public class Snake extends Personaje {
    public Snake(Posicion posicionInicial) {
        super("Snake", 100, posicionInicial);
    }

    public int ataqueSnake(){
        return 0;
    }
    
    public void usarItem(){
    
    }
    
    @Override
    public void mover(String direccion) {
    }
}
