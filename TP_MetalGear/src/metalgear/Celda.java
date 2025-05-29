package metalgear;

public class Celda {

    private Personaje personaje;
    private Item item;
    private boolean esPuerta;
    private boolean bloqueada;

    public Celda() {
        this.personaje = null;
        this.item = null;
        this.esPuerta = false;
        this.bloqueada = false;
    }

    public void setPersonaje(Personaje p) {
        this.personaje = p;
    }

    public void setItem(Item i) {
        this.item = i;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public Item getItem() {
        return item;
    }

    public void setPuerta(boolean esPuerta) {
        this.esPuerta = esPuerta;
    }

    public boolean esPuerta() {
        return esPuerta;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

    public boolean estaBloqueada() {
        return bloqueada;
    }

    public boolean estaVacia() {
        return personaje == null && item == null;
    }
}
