
import java.util.*;

public class Seleccion {

    private List<Jugador> jugadores;
    private Set<Jugador> titulares;
    private Set<Jugador> suplentes;

    public Seleccion() {
        jugadores = new ArrayList<>();
        titulares = new HashSet<>();
        suplentes = new HashSet<>();
    }

    public void agregarJugador(Jugador j) {
        jugadores.add(j);
    }

    public void asignarTitularesYSuplentes() {
        titulares.clear();
        suplentes.clear();

        for (Jugador j : jugadores) {
            double promedio = j.promedioGoles();
            if (j.getPosicion() == 'A') { // arquero
                if (promedio > 2.5) {
                    titulares.add(j);
                } else {
                    suplentes.add(j);
                }
            } else {
                if (promedio > 1.5) {
                    titulares.add(j);
                } else {
                    suplentes.add(j);
                }
            }
        }
    }

    public void mostrarTitulares() {
        System.out.println("Titulares:");
        for (Jugador j : titulares) {
            System.out.println("- " + j.getNombre());
        }
    }

    public boolean existeJugadorTitular(String nombre) {
        for (Jugador j : titulares) {
            if (j.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public void eliminarJugador(String nombre) {
        jugadores.removeIf(j -> j.getNombre().equalsIgnoreCase(nombre));
        titulares.removeIf(j -> j.getNombre().equalsIgnoreCase(nombre));
        suplentes.removeIf(j -> j.getNombre().equalsIgnoreCase(nombre));
    }

    public int cantidadJugadores() {
        return jugadores.size();
    }

    // Getters para posibles usos externos
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public Set<Jugador> getTitulares() {
        return titulares;
    }

    public Set<Jugador> getSuplentes() {
        return suplentes;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setTitulares(Set<Jugador> titulares) {
        this.titulares = titulares;
    }

    public void setSuplentes(Set<Jugador> suplentes) {
        this.suplentes = suplentes;
    }
}
