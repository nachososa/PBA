package items;

import juego.Posicion;

public class Item {

    public static final char LLAVE = 'L';
    public static final char PUERTA = 'H';
    public static final char EXPLOSIVO = 'C';
    public static final char PUNTO_ESCAPE = 'P';  // Nuevo símbolo

    private final char simbolo;
    private final Posicion posicion;
    private boolean recogido;

    public Item(char simbolo, int x, int y) {
        if (simbolo != LLAVE && simbolo != PUERTA && simbolo != EXPLOSIVO && simbolo != PUNTO_ESCAPE) {
            throw new IllegalArgumentException("Símbolo No Válido");
        }
        this.simbolo = simbolo;
        this.posicion = new Posicion(x, y);
        this.recogido = false;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public boolean isRecogido() {
        return recogido;
    }

    public void setRecogido(boolean recogido) {
        this.recogido = recogido;
    }

    public boolean esLlave() {
        return simbolo == LLAVE;
    }

    public boolean esPuerta() {
        return simbolo == PUERTA;
    }

    public boolean esExplosivo() {
        return simbolo == EXPLOSIVO;
    }

    public boolean esPuntoEscape() {
        return simbolo == PUNTO_ESCAPE;
    }
}
