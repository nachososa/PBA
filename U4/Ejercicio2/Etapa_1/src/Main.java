
import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);
    static Figuras[] figura = new Figuras[100];
    static int sumador = 0;

    public static void main(String[] args) {
        int eleccion = 0;

        while (eleccion != 3) {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1: Cargar una figura");
            System.out.println("2: Ver las figuras cargadas");
            System.out.println("3: Salir");
            System.out.print("Opción: ");

            eleccion = entrada.nextInt();
            entrada.nextLine();

            switch (eleccion) {
                case 1 ->
                    cargarFiguras();

                case 2 -> {
                    if (sumador == 0) {
                        System.out.println("No hay figuras cargadas");
                    } else {
                        mostrarFiguras();
                    }
                }

                case 3 ->
                    System.out.println("Saliendo...");

                default ->
                    System.out.println("Seleccione un número válido");
            }
        }
    }

    private static void cargarFiguras() {
        System.out.println("¿Qué figura desea cargar?");
        System.out.println("1: Círculo");
        System.out.println("2: Rectángulo");
        System.out.println("3: Triángulo");
        System.out.print("Opción: ");

        int opcion = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer

        System.out.print("Ingrese un nombre para la figura: ");
        String nombre = entrada.nextLine();

        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese el radio: ");
                double radio = entrada.nextDouble();
                figura[sumador++] = new Circulo(radio, nombre);
            }

            case 2 -> {
                System.out.print("Ingrese la altura: ");
                double alturaR = entrada.nextDouble();
                System.out.print("Ingrese la base: ");
                double baseR = entrada.nextDouble();
                figura[sumador++] = new Rectangulo(alturaR, baseR, nombre);
            }

            case 3 -> {
                System.out.print("Ingrese la altura: ");
                double alturaT = entrada.nextDouble();
                System.out.print("Ingrese la base: ");
                double baseT = entrada.nextDouble();
                figura[sumador++] = new Triangulo(baseT, alturaT, nombre);
            }

            default ->
                System.out.println("Opción inválida.");
        }

        System.out.println("¡Figura cargada con éxito!");
        System.out.println("--------------------------");
    }

    private static void mostrarFiguras() {
        for (int i = 0; i < sumador; i++) {
            System.out.println(figura[i].toString());
            System.out.println("Área: " + figura[i].calcularArea());
            System.out.println();
        }
    }
}
