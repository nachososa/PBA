package PBA_7_figura3;

import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);
    static Figuras figura[] = new Figuras[100];
    static int sumador;

    public static void main(String[] args) {
        int eleccion = 0;

        while (eleccion != 3) {

            System.out.println("Que desea hacer?");

            System.out.println(" 1: Cargar una figura , 2: Ver las figuras cargadas o 3: Salir ?");
            eleccion = entrada.nextInt();

            switch (eleccion) {
                case 1 ->
                    cargarFiguras();
                case 2 -> {
                    if (eleccion == 2 & sumador == 0) {
                        System.out.println("No hay figuras cargadas");

                    }

                    mostrarFiguas();
                }

                case 3 ->
                    System.out.println("  Saliendo...");

                default ->
                    System.out.println(" Seleccione un numero valido");
            }

        }
    }

    private static void cargarFiguras() {
        int valor;

        System.out.println(" Que figura va a cargar ?");
        System.out.println(" 1: Un Circulo , 2: Un Rectangulo o 3: Un Triangulo");
        valor = entrada.nextInt();
        entrada.nextLine();

        switch (valor) {

            case 1 -> {
                System.out.println(" Elija un nombre para la figura");
                String nombre = entrada.nextLine();

                System.out.println("Ingrese el valor del radio");
                double radio = entrada.nextDouble();
                figura[sumador++] = new Circulo(radio, nombre);
            }

            case 2 -> {
                System.out.println(" Elija un nombre para la figura");
                String nombreR = entrada.nextLine();

                System.out.println(" Ingrese el valor de  altura");
                double alturaR = entrada.nextDouble();
                System.out.println(" Ingrese el valor de  base");
                double baseR = entrada.nextDouble();
                figura[sumador++] = new Rectangulo(alturaR, baseR, nombreR);
            }

            case 3 -> {
                System.out.println(" Elija un nombre para la figura");
                String nombreT = entrada.nextLine();

                System.out.println(" Ingrese el valor de  altura");
                double alturaT = entrada.nextDouble();
                System.out.println(" Ingrese el valor de  base");
                double baseT = entrada.nextDouble();
                figura[sumador++] = new Triangulo(baseT, alturaT, nombreT);
            }

            default ->
                System.out.println(" Numero invalido");
        }
        System.out.println(" ");
        System.out.println(" Figura cargada con exito !");
        System.out.println("............................");
    }

    private static void mostrarFiguas() {
        for (int i = 0; i < sumador; i++) {
            //  System.out.println("la figura cargada es " + figura[i].getNombre() + " y su area es " + figura[i].calcularArea());
            System.out.println(figura[i].toString());
            System.out.println("Con un área de: " + figura[i].calcularArea());
        }
    }

}
