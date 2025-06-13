package PBA_4_interfaces1;

/*
Síntesis
 */
public class Main {

    public static void main(String[] args) {

        Personaje miPersonaje = new Personaje(0, 0);
        // Tipo de retorno - Nombre del Objeto - y creación del objeto
        // Tipo (clase Personaje): Personaje
        // Nombre de la variable/objeto: miPersonaje
        // Operador de asignación: =
        // Constructor, con dos parámetros: new Personaje(0, 0);

        ManejadorPaginas miLibro = new ManejadorPaginas(1, 100);
        // Tipo de retorno - Nombre del Objeto - y creación del objeto
        // Tipo (clase ManejadorPaginas): ManejadorPaginas
        // Nombre de la variable/objeto: miLibro
        // Operador de asignación: =
        // Constructor, con dos parámetros: new ManejadorPaginas(1, 100);

        /*-------------------------------*/
        System.out.println("miPersonaje");
        System.out.println("1.- Mostrar estado inicial del personaje");
        System.out.println(miPersonaje.toString());
        System.out.println(" ");

        System.out.println("2.- Simular movimientos sobre el personaje");
        simularMovimientos(miPersonaje);
        System.out.println(" ");

        System.out.println("3.- Mostrar estado final del personaje");
        System.out.println(miPersonaje.toString());
        System.out.println(" ");

        /*-------------------------------*/
        System.out.println("miLibro");
        System.out.println("1.- Mostrar estado inicial del libro");
        System.out.println(miLibro.toString());
        System.out.println(" ");

        System.out.println("2.- Simular movimientos sobre el libro");
        simularMovimientos(miLibro);
        System.out.println(" ");

        System.out.println("3.- Mostrar estado final del libro");
        System.out.println(miLibro.toString());
        System.out.println(" ");
    }

    // Método polimórfico que simula movimientos en cualquier objeto que implemente la interfaz IMovible.
    // Demuestra el uso del polimorfismo y programación de interfaces.
    public static void simularMovimientos(IMovible movible) {
        System.out.println("Movimientos de la clase " + movible.getClass().getSimpleName());
        movible.moverAdelante();
        movible.moverAdelante();
        movible.moverAdelante();
        movible.moverAtras();
        movible.moverAtras();
    }
}
