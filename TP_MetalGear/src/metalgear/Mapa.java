
package metalgear;

public class Mapa {
    private Celda[][] celdas;
    private int filas;
    private int columnas;

    public Mapa(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        celdas = new Celda[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                celdas[i][j] = new Celda();
            }
        }
    }

    public void moverPersonaje(Personaje p, String direccion) {
        Posicion actual = p.getPosicion();
        int x = actual.getX();
        int y = actual.getY();

        int nuevoX = x;
        int nuevoY = y;

        switch (direccion.toLowerCase()) {
            case "norte": nuevoX--; break;
            case "sur": nuevoX++; break;
            case "este": nuevoY++; break;
            case "oeste": nuevoY--; break;
        }

        if (nuevoX >= 0 && nuevoX < filas && nuevoY >= 0 && nuevoY < columnas) {
            Celda nuevaCelda = celdas[nuevoX][nuevoY];
            if (nuevaCelda.estaBloqueada()) {
                System.out.println("¡La puerta está bloqueada!");
                return;
            }
            // Actualizar mapa
            celdas[x][y].setPersonaje(null);
            nuevaCelda.setPersonaje(p);
            p.setPosicion(new Posicion(nuevoX, nuevoY));
        } else {
            System.out.println("¡Movimiento inválido!");
        }
    }

    public Celda getCelda(int x, int y) {
        return celdas[x][y];
    }
}
