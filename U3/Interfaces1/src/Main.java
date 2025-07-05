
public class Main {

    public static void main(String[] args) {

        Personaje miPersonaje = new Personaje(0, 0);
        ManejadorPaginas miLibro = new ManejadorPaginas(1, 100);

        System.out.println(miPersonaje.toString());
        simularMovimientos(miPersonaje);
        System.out.println(miPersonaje.toString());

        System.out.println(miLibro.toString());
        simularMovimientos(miLibro);
        System.out.println(miLibro.toString());
    }

    public static void simularMovimientos(IMovible movible) {
        System.out.println("Movimientos de la clase" + movible.getClass().getSimpleName());
        movible.moverAdelante();
        movible.moverAdelante();
        movible.moverAdelante();
        movible.moverAtras();
        movible.moverAtras();
    }

}
