package PBA_2;

import java.util.Scanner;

public class FiguraFactory {

    public static Figuras crearFigura(int tipo, Scanner entrada) {
        System.out.print("Ingrese un nombre para la figura: ");
        String nombre = entrada.nextLine();

        switch (tipo) {
            case 1 -> {
                System.out.print("Ingrese el radio: ");
                double radio = entrada.nextDouble();
                entrada.nextLine(); // limpiar buffer
                return new Circulo(radio, nombre);
            }
            case 2 -> {
                System.out.print("Ingrese la altura: ");
                double altura = entrada.nextDouble();
                System.out.print("Ingrese la base: ");
                double base = entrada.nextDouble();
                entrada.nextLine(); // limpiar buffer
                return new Rectangulo(altura, base, nombre);
            }
            case 3 -> {
                System.out.print("Ingrese la base: ");
                double base = entrada.nextDouble();
                System.out.print("Ingrese la altura: ");
                double altura = entrada.nextDouble();
                entrada.nextLine(); // limpiar buffer
                return new Triangulo(base, altura, nombre);
            }
            default -> {
                System.out.println("Opción inválida.");
                return null;
            }
        }
    }
}
