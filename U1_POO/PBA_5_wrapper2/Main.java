package PBA_5_wrapper2;

public class Main {

    public static void main(String[] args) {

        System.out.println("Parte 1");
        Integer valor1 = 10;
        int valor2 = 30;
        int comparar;

        if (valor1.equals(valor2)) {
            System.out.println("Son iguales");
        } else {
            comparar = valor1.compareTo(valor2);

            if (comparar > 0) {
                System.out.println("valor1 es mayor que valor2");
            } else {
                System.out.println("valor2 es mayor que valor1");
            }
        }
        System.out.println("");

        System.out.println("Parte 2");
        Integer num; // es null por defecto
        String numS = "3"; // es una cadena
        // paso de cadena a un objeto entero
        num = Integer.valueOf(numS);
        // Imprimo
        System.out.println("num=" + num);
        System.out.println("");
    }

}
