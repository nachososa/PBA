
import java.util.Scanner;

public class Menu {

    private final ListaNumeros listaNumeros;
    private final Scanner scanner;

    public Menu() {
        this.listaNumeros = new ListaNumeros();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            mostrarOpciones();
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 ->
                    agregarNumeroAlFinal();
                case 2 ->
                    agregarNumeroAlPrincipio();
                case 3 ->
                    OperacionesLista.imprimirLista(listaNumeros.obtenerLista());
                case 4 ->
                    OperacionesLista.contarParesEImpares(listaNumeros.obtenerLista());
                case 5 ->
                    OperacionesLista.reemplazarImparesPorCero(listaNumeros.obtenerLista());
                case 6 ->
                    OperacionesLista.mostrarMaximoYMinimo(listaNumeros.obtenerLista());
                case 7 ->
                    OperacionesLista.eliminarMayoresA100(listaNumeros.obtenerLista());
                case 8 ->
                    OperacionesLista.mostrarMaximoYMinimo(listaNumeros.obtenerLista());
                case 9 ->
                    OperacionesLista.trabajarConCopia(listaNumeros.obtenerLista());
                case 10 ->
                    OperacionesLista.ordenarEImprimir(listaNumeros.obtenerLista());
                case 0 ->
                    salir = true;
                default ->
                    System.out.println("Opción inválida.");
            }
        }

        System.out.println("Programa finalizado.");
    }

    private void mostrarOpciones() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Agregar número al final");
        System.out.println("2. Agregar número al principio");
        System.out.println("3. Mostrar lista");
        System.out.println("4. Contar pares e impares");
        System.out.println("5. Reemplazar impares por 0");
        System.out.println("6. Mostrar máximo y mínimo");
        System.out.println("7. Eliminar números mayores a 100");
        System.out.println("8. Mostrar máximo y mínimo actual");
        System.out.println("9. Copiar lista y trabajar sobre la copia");
        System.out.println("10. Ordenar e imprimir la lista");
        System.out.println("0. Salir");
    }

    private void agregarNumeroAlFinal() {
        System.out.print("Número a agregar al final: ");
        int numero = scanner.nextInt();
        listaNumeros.agregarAlFinal(numero);
    }

    private void agregarNumeroAlPrincipio() {
        System.out.print("Número a agregar al principio: ");
        int numero = scanner.nextInt();
        listaNumeros.agregarAlPrincipio(numero);
    }
}
