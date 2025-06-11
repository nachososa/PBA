package juego;

import items.Item;
import personajes.Personaje;

public class Celda {

    private Personaje personaje;
    private Item item;

    public boolean estaOcupada() {
        return personaje != null;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
