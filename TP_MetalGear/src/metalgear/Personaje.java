
package metalgear;

public abstract class Personaje {
    protected String nombre;
    protected int vida = 100;
    protected Posicion posicion;

    public Personaje(String nombre, int vida, Posicion posicion) {
        this.nombre = nombre;
        this.vida = vida;
        this.posicion = posicion;
    }

    public abstract void mover(String direccion);

    public int getVida() {
        return vida;
    }

    public Posicion getPosicion() {
        return posicion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void golpeRecibido(int cantidad) {
        vida -= cantidad;
        if (vida < 0) vida = 0;
    }

    public void setPosicion(Posicion nueva) {
        this.posicion = nueva;
    }
    

}
