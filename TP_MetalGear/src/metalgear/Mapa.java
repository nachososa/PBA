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
            case "norte":
                nuevoX--;
                break;
            case "sur":
                nuevoX++;
                break;
            case "este":
                nuevoY++;
                break;
            case "oeste":
                nuevoY--;
                break;
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

    public void colocarInicial(Object objeto, int x, int y) {
        if (x >= 0 && x < filas && y >= 0 && y < columnas) {
            Celda celdaDestino = celdas[x][y];

            if (objeto instanceof Personaje) {
                Personaje p = (Personaje) objeto;
                if (celdaDestino.getPersonaje() == null) {
                    celdaDestino.setPersonaje(p);
                    p.setPosicion(new Posicion(x, y));
                } else {
                    System.out.println("¡Ya hay un personaje en esta celda!");
                }

            } else if (objeto instanceof Item) {
                Item item = (Item) objeto;
                if (celdaDestino.getItem() == null) {
                    celdaDestino.setItem(item);
                } else {
                    System.out.println("¡Ya hay un item en esta celda!");
                }

            } else if (objeto instanceof String) {
                String tipo = (String) objeto;
                if (tipo.equalsIgnoreCase("puerta")) {
                    celdaDestino.setPuerta(true);
                    celdaDestino.setBloqueada(false);
                } else if (tipo.equalsIgnoreCase("puerta-bloqueada")) {
                    celdaDestino.setPuerta(true);
                    celdaDestino.setBloqueada(true);
                } else {
                    System.out.println("¡Tipo de objeto String desconocido!");
                }

            } else {
                System.out.println("¡Tipo de objeto no válido!");
            }

        } else {
            System.out.println("¡Posición fuera de los límites del mapa!");
        }
    }

    public void mostrarMapa() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Celda celda = celdas[i][j];

                if (celda.getPersonaje() != null) {
                    if (celda.getPersonaje() instanceof Snake) {
                        System.out.print("S ");  // Snake
                    } else if (celda.getPersonaje() instanceof Guardia) {
                        System.out.print("G ");  // Guardia
                    } else if (celda.getPersonaje() instanceof MetalGear) {
                        System.out.print("M ");  // MetalGear (si lo usás en mapa)
                    } else {
                        System.out.print("P ");  // Otro personaje genérico
                    }

                } else if (celda.getItem() != null) {
                    System.out.print("I ");      // Item

                } else if (celda.esPuerta()) {
                    if (celda.estaBloqueada()) {
                        System.out.print("B ");  // Puerta bloqueada
                    } else {
                        System.out.print("D ");  // Puerta desbloqueada
                    }

                } else {
                    System.out.print(". ");      // Celda vacía
                }
            }
            System.out.println();
        }
    }

    public Celda getCelda(int x, int y) {
        return celdas[x][y];
    }
}
