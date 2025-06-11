package misiones;

import items.Item;
import juego.Celda;
import juego.Mapa;
import juego.Posicion;
import personajes.Guardia;
import personajes.Snake;

public class Almacen {

    private Mapa mapa;
    private Snake snake;
    private Guardia[] enemigos;
    private boolean c4Recogido = false;
    @SuppressWarnings("unused")
    private Item c4;
    @SuppressWarnings("unused")
    private Item puntoEscape;

    public void iniciarMision2() {
        mapa = new Mapa(9, 9);

        Posicion posSnake = mapa.generarPosicionAleatoria();
        snake = new Snake(posSnake.getX(), posSnake.getY());
        mapa.getCelda(posSnake.getX(), posSnake.getY()).setPersonaje(snake);

        colocarItemAleatorio('C');
        colocarItemAleatorio('P');

        int cantidadEnemigos = 3;

        enemigos = new Guardia[cantidadEnemigos];
        for (int i = 0; i < cantidadEnemigos; i++) {
            Posicion posEnemigo;
            do {
                posEnemigo = mapa.generarPosicionAleatoria();
            } while (!esPosicionValidaParaEnemigo(posSnake, posEnemigo)
                    || mapa.getCelda(posEnemigo.getX(), posEnemigo.getY()).estaOcupada());

            enemigos[i] = new Guardia(posEnemigo.getX(), posEnemigo.getY());
            mapa.getCelda(posEnemigo.getX(), posEnemigo.getY()).setPersonaje(enemigos[i]);
        }
    }

    private void colocarItemAleatorio(char simbolo) {
        Posicion pos;
        do {
            pos = mapa.generarPosicionAleatoria();
        } while (mapa.getCelda(pos.getX(), pos.getY()).estaOcupada()
                || mapa.getCelda(pos.getX(), pos.getY()).getItem() != null);

        Item item = new Item(simbolo, pos.getX(), pos.getY());
        mapa.getCelda(pos.getX(), pos.getY()).setItem(item);

        if (simbolo == 'C') {
            c4 = item;
        } else if (simbolo == 'P') {
            puntoEscape = item;
        }
    }

    private boolean esPosicionValidaParaEnemigo(Posicion posSnake, Posicion posEnemigo) {
        int dx = Math.abs(posSnake.getX() - posEnemigo.getX());
        int dy = Math.abs(posSnake.getY() - posEnemigo.getY());
        return dx > 2 || dy > 2;
    }

    public void verificarRecogerC4() {
        Celda celda = mapa.getCelda(snake.getPosicion().getX(), snake.getPosicion().getY());
        if (celda.getItem() != null && celda.getItem().getSimbolo() == 'C') {
            c4Recogido = true;
            celda.setItem(null);
            System.out.println("¡Has recogido el explosivo C4!");
        }
    }

    public boolean verificarEscapeExitoso() {
        Celda celda = mapa.getCelda(snake.getPosicion().getX(), snake.getPosicion().getY());

        if (celda.getItem() != null && celda.getItem().getSimbolo() == 'P' && c4Recogido) {
            for (Guardia enemigo : enemigos) {
                int dx = Math.abs(snake.getPosicion().getX() - enemigo.getPosicion().getX());
                int dy = Math.abs(snake.getPosicion().getY() - enemigo.getPosicion().getY());
                if (dx <= 3 && dy <= 3) {
                    System.out.println("¡No puedes escapar! Hay enemigos cerca del punto de extracción.");
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean verificarCaptura() {
        for (Guardia enemigo : enemigos) {
            int dx = Math.abs(snake.getPosicion().getX() - enemigo.getPosicion().getX());
            int dy = Math.abs(snake.getPosicion().getY() - enemigo.getPosicion().getY());
            if ((dx <= 1 && dy <= 1) && !(dx == 0 && dy == 0)) {
                System.out.println("¡Has sido capturado por un enemigo!");
                return true;
            }
        }
        return false;
    }

    public void moverSnake(char direccion) {
        int x = snake.getPosicion().getX();
        int y = snake.getPosicion().getY();

        mapa.getCelda(x, y).setPersonaje(null);

        switch (direccion) {
            case 'W', 'w' -> {
                if (y < mapa.getFilas() - 1) {
                    y++;
                }
            }
            case 'S', 's' -> {
                if (y > 0) {
                    y--;
                }
            }
            case 'A', 'a' -> {
                if (x > 0) {
                    x--;
                }
            }
            case 'D', 'd' -> {
                if (x < mapa.getColumnas() - 1) {
                    x++;
                }
            }
        }

        snake.getPosicion().setX(x);
        snake.getPosicion().setY(y);
        mapa.getCelda(x, y).setPersonaje(snake);

        verificarRecogerC4();
    }

    public void moverEnemigos() {
        for (Guardia enemigo : enemigos) {
            int x = enemigo.getPosicion().getX();
            int y = enemigo.getPosicion().getY();
            mapa.getCelda(x, y).setPersonaje(null);

            int dir = (int) (Math.random() * 4);
            switch (dir) {
                case 0 -> {
                    if (y < mapa.getFilas() - 1) {
                        y++;

                    }
                }
                case 1 -> {
                    if (y > 0) {
                        y--;

                    }
                }
                case 2 -> {
                    if (x > 0) {
                        x--;

                    }
                }
                case 3 -> {
                    if (x < mapa.getColumnas() - 1) {
                        x++;

                    }
                }
            }

            if (!mapa.getCelda(x, y).estaOcupada()) {
                enemigo.getPosicion().setX(x);
                enemigo.getPosicion().setY(y);
            }

            mapa.getCelda(x, y).setPersonaje(enemigo);
        }
    }

    public void imprimirEstado() {
        System.out.println("Snake: " + (c4Recogido ? "Tiene el C4" : "Necesita el C4"));
        System.out.println();

        for (int y = mapa.getFilas() - 1; y >= 0; y--) {
            for (int x = 0; x < mapa.getColumnas(); x++) {
                Celda celda = mapa.getCelda(x, y);

                if (celda.getPersonaje() instanceof Snake) {
                    System.out.print("S ");
                } else if (celda.getPersonaje() instanceof Guardia) {
                    System.out.print("G ");
                } else if (celda.getItem() != null) {
                    System.out.print(celda.getItem().getSimbolo() + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void moverGuardias() {
        moverEnemigos();
    }

}
