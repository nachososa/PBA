
public class Jugador {

    private String nombre;
    private char posicion;
    private int goles;
    private int partidosJugados;

    public Jugador(String nombre, char posicion, int goles, int partidosJugados) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.goles = goles;
        this.partidosJugados = partidosJugados;
    }

    public String getNombre() {
        return nombre;
    }

    public char getPosicion() {
        return posicion;
    }

    public int getGoles() {
        return goles;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public double promedioGoles() {
        if (partidosJugados == 0) {
            return 0;
        }
        return (double) goles / partidosJugados;
    }

    @Override
    public String toString() {
        return nombre + " (" + posicion + ") - Goles: " + goles + ", Partidos: " + partidosJugados;
    }

    // Opcional: hashCode y equals si se usan en Sets
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Jugador)) {
            return false;
        }
        Jugador j = (Jugador) o;
        return nombre.equalsIgnoreCase(j.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(char posicion) {
        this.posicion = posicion;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
}
