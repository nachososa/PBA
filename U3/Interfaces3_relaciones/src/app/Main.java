package app;

import java.util.Scanner;
import numeros.Numero;
import personas.Persona;
import relaciones.IRelacionable;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Comparador ===");
            System.out.println("1. Comparar personas");
            System.out.println("2. Comparar números");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 ->
                    compararPersonas(sc);
                case 2 ->
                    compararNumeros(sc);
                case 0 ->
                    System.out.println("Adiós!");
                default ->
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);
    }

    public static void compararPersonas(Scanner sc) {
        System.out.print("Nombre 1: ");
        String nombre1 = sc.nextLine();
        System.out.print("Edad 1: ");
        int edad1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre 2: ");
        String nombre2 = sc.nextLine();
        System.out.print("Edad 2: ");
        int edad2 = sc.nextInt();
        sc.nextLine();

        Persona p1 = new Persona(nombre1, edad1);
        Persona p2 = new Persona(nombre2, edad2);

        mostrarComparacion(p1, p2);
    }

    public static void compararNumeros(Scanner sc) {
        System.out.print("Número 1: ");
        int v1 = sc.nextInt();
        System.out.print("Número 2: ");
        int v2 = sc.nextInt();

        Numero n1 = new Numero(v1);
        Numero n2 = new Numero(v2);

        mostrarComparacion(n1, n2);
    }

    public static void mostrarComparacion(IRelacionable a, IRelacionable b) {
        System.out.println("\nComparación:");
        System.out.println(a + " es mayor que " + b + "? " + a.esMayor(b));
        System.out.println(a + " es menor que " + b + "? " + a.esMenor(b));
        System.out.println(a + " es igual a " + b + "? " + a.esIgual(b));
    }
}
