package juego;

import items.Item;
import java.util.Random;
import personajes.Personaje;
import personajes.Snake;

public class Mapa {

    private static Mapa instancia;
    private final Celda[][] celdas;
    private final int filas;
    private final int columnas;
    private final Random random;

    public Mapa(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.celdas = new Celda[filas][columnas];
        this.random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                celdas[i][j] = new Celda();
            }
        }
    }

    public static Mapa getInstance(int filas, int columnas) {
        if (instancia == null) {
            instancia = new Mapa(filas, columnas);
        }
        return instancia;
    }

    public static Mapa getInstance() {
        if (instancia == null) {
            throw new IllegalStateException("Mapa no inicializado)");
        }
        return instancia;
    }

    public Celda getCelda(int x, int y) {
        if (x < 0 || x >= columnas || y < 0 || y >= filas) {
            return null;
        }
        return celdas[y][x];
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public Posicion generarPosicionAleatoria() {
        int x = random.nextInt(columnas);
        int y = random.nextInt(filas);
        return new Posicion(x, y);
    }

    public boolean esPosicionValida(Posicion posicion) {
        if (posicion == null) {
            return false;
        }
        int x = posicion.getX();
        int y = posicion.getY();
        return x >= 0 && x < columnas && y >= 0 && y < filas;
    }

    public boolean esPosicionValidaParaGuardia(Posicion posSnake, Posicion posGuardia) {
        if (!esPosicionValida(posSnake) || !esPosicionValida(posGuardia)) {
            return false;
        }
        int distanciaX = Math.abs(posSnake.getX() - posGuardia.getX());
        int distanciaY = Math.abs(posSnake.getY() - posGuardia.getY());
        return distanciaX > 2 || distanciaY > 2;
    }

    public boolean colocarPersonaje(Personaje personaje, Posicion posicion) {
        if (!esPosicionValida(posicion)) {
            return false;
        }
        Celda celda = getCelda(posicion.getX(), posicion.getY());
        if (celda.estaOcupada()) {
            return false;
        }
        celda.setPersonaje(personaje);
        return true;
    }

    public boolean colocarItem(Item item, Posicion posicion) {
        if (!esPosicionValida(posicion)) {
            return false;
        }
        Celda celda = getCelda(posicion.getX(), posicion.getY());
        if (celda.getItem() != null) {
            return false;
        }
        celda.setItem(item);
        return true;
    }

    public void limpiarCelda(Posicion posicion) {
        if (esPosicionValida(posicion)) {
            Celda celda = getCelda(posicion.getX(), posicion.getY());
            celda.setPersonaje(null);
            celda.setItem(null);
        }
    }

    public void imprimirMapa() {
        System.out.println("\nEstado del Mapa:");
        for (int y = filas - 1; y >= 0; y--) {
            for (int x = 0; x < columnas; x++) {
                Celda celda = celdas[y][x];
                if (celda.getPersonaje() != null) {
                    System.out.print(celda.getPersonaje() instanceof Snake ? "S " : "* ");
                } else if (celda.getItem() != null) {
                    System.out.print(celda.getItem().getSimbolo() + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
