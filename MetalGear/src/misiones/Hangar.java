package misiones;

import items.Item;
import juego.Celda;
import juego.Mapa;
import juego.Posicion;
import personajes.Guardia;
import personajes.Snake;

public class Hangar {

    private Mapa mapa;
    private Snake snake;
    private Guardia[] guardias;
    private boolean llaveRecogida = false;
    @SuppressWarnings("unused")
    private Item llave;
    @SuppressWarnings("unused")
    private Item puerta;

    public void iniciarMision1() {
        mapa = new Mapa(7, 7);

        Posicion posSnake = mapa.generarPosicionAleatoria();
        snake = new Snake(posSnake.getX(), posSnake.getY());
        mapa.getCelda(posSnake.getX(), posSnake.getY()).setPersonaje(snake);

        colocarItemAleatorio('L');
        colocarItemAleatorio('H');

        int cantidadGuardias = 2;

        guardias = new Guardia[cantidadGuardias];
        for (int i = 0; i < cantidadGuardias; i++) {
            Posicion posGuardia;
            do {
                posGuardia = mapa.generarPosicionAleatoria();
            } while (!esPosicionValidaParaGuardia(posSnake, posGuardia)
                    || mapa.getCelda(posGuardia.getX(), posGuardia.getY()).estaOcupada());

            guardias[i] = new Guardia(posGuardia.getX(), posGuardia.getY());
            mapa.getCelda(posGuardia.getX(), posGuardia.getY()).setPersonaje(guardias[i]);
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

        if (simbolo == 'L') {
            llave = item;
        } else if (simbolo == 'H') {
            puerta = item;
        }
    }

    private boolean esPosicionValidaParaGuardia(Posicion posSnake, Posicion posGuardia) {
        int distanciaX = Math.abs(posSnake.getX() - posGuardia.getX());
        int distanciaY = Math.abs(posSnake.getY() - posGuardia.getY());
        return distanciaX > 2 || distanciaY > 2;
    }

    public void verificarRecogerLlave() {
        Celda celdaActual = mapa.getCelda(snake.getPosicion().getX(), snake.getPosicion().getY());
        if (celdaActual.getItem() != null && celdaActual.getItem().getSimbolo() == 'L') {
            llaveRecogida = true;
            celdaActual.setItem(null);
            System.out.println("Has recogido la llave!");
        }
    }

    public boolean verificarEscapeExitoso() {
        Celda celdaActual = mapa.getCelda(snake.getPosicion().getX(), snake.getPosicion().getY());
        return celdaActual.getItem() != null && celdaActual.getItem().getSimbolo() == 'H' && llaveRecogida;
    }

    public boolean verificarCaptura() {
        for (Guardia guardia : guardias) {
            int distanciaX = Math.abs(snake.getPosicion().getX() - guardia.getPosicion().getX());
            int distanciaY = Math.abs(snake.getPosicion().getY() - guardia.getPosicion().getY());
            if (distanciaX <= 1 && distanciaY <= 1 && !(distanciaX == 0 && distanciaY == 0)) {
                System.out.println("Has sido capturado por un guardia");
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

        verificarRecogerLlave();
    }

    public void moverGuardias() {
        for (Guardia guardia : guardias) {
            int x = guardia.getPosicion().getX();
            int y = guardia.getPosicion().getY();
            mapa.getCelda(x, y).setPersonaje(null);
            int direccion = (int) (Math.random() * 4);
            switch (direccion) {
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
                guardia.getPosicion().setX(x);
                guardia.getPosicion().setY(y);
            }
            mapa.getCelda(x, y).setPersonaje(guardia);
        }
    }

    public void imprimirEstado() {
        System.out.println("Snake: " + (llaveRecogida ? "Tiene la llave" : "Necesita la llave"));
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
}
