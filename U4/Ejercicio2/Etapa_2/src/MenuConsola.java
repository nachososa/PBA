
import java.util.Scanner;

public class MenuConsola {

    private final Scanner entrada;
    private final GestionFiguras gestor;

    public MenuConsola(Scanner entrada, GestionFiguras gestor) {
        this.entrada = entrada;
        this.gestor = gestor;
    }

    public void mostrar() {
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1: Cargar una figura");
            System.out.println("2: Ver las figuras cargadas");
            System.out.println("3: Ver suma total de áreas");
            System.out.println("4: Salir");
            System.out.print("Opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 ->
                    cargarFigura();
                case 2 ->
                    mostrarFiguras();
                case 3 ->
                    mostrarSumaAreas();
                case 4 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opción inválida.");
            }
        }
    }

    private void cargarFigura() {
        System.out.println("¿Qué figura desea cargar?");
        System.out.println("1: Círculo");
        System.out.println("2: Rectángulo");
        System.out.println("3: Triángulo");
        System.out.print("Opción: ");

        int tipo = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer

        Figuras figura = FiguraFactory.crearFigura(tipo, entrada);
        if (figura != null) {
            gestor.agregarFigura(figura);
            System.out.println("¡Figura cargada con éxito!");
        }
    }

    private void mostrarFiguras() {
        if (gestor.getCantidad() == 0) {
            System.out.println("No hay figuras cargadas.");
            return;
        }

        for (Figuras figura : gestor.getFiguras()) {
            System.out.println(figura);
            System.out.println("Área: " + figura.calcularArea());
            System.out.println();
        }
    }

    private void mostrarSumaAreas() {
        if (gestor.getCantidad() == 0) {
            System.out.println("No hay figuras cargadas.");
            return;
        }

        double total = gestor.calcularSumaAreas();
        System.out.println("Suma total de áreas: " + total);
        System.out.println();
    }
}
