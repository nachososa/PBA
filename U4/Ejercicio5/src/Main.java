
public class Main {

    public static void main(String[] args) {

        Seleccion seleccion = new Seleccion();

        // Agregar jugadores
        seleccion.agregarJugador(new Jugador("Messi", 'V', 40, 20));
        seleccion.agregarJugador(new Jugador("Funes Mori", 'D', 2, 10));
        seleccion.agregarJugador(new Jugador("Romero", 'A', 30, 12));  // arquero con goles atajados
        seleccion.agregarJugador(new Jugador("Paredes", 'M', 10, 12));
        seleccion.agregarJugador(new Jugador("Di María", 'V', 15, 15));
        seleccion.agregarJugador(new Jugador("Otamendi", 'D', 1, 10));
        seleccion.agregarJugador(new Jugador("Dibu Martínez", 'A', 40, 10)); // arquero titular
        seleccion.agregarJugador(new Jugador("De Paul", 'M', 5, 10));

        // Asignar titulares y suplentes según el promedio de goles
        seleccion.asignarTitularesYSuplentes();

        // Mostrar titulares
        seleccion.mostrarTitulares();

        // Consultar si Messi está entre titulares
        if (seleccion.existeJugadorTitular("Messi")) {
            System.out.println("Messi está en el equipo titular.");
        } else {
            System.out.println("Messi NO está en el equipo titular.");
        }

        // Eliminar a Funes Mori y mostrar cantidad de jugadores restantes
        seleccion.eliminarJugador("Funes Mori");
        System.out.println("Cantidad de jugadores después de eliminar a Funes Mori: " + seleccion.cantidadJugadores());
    }
}
