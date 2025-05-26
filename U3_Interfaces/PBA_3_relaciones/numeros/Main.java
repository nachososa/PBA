package numeros;

public class Main {

    public static void main(String[] args) {
        Numero n1 = new Numero(10);
        Numero n2 = new Numero(20);

        System.out.println(n1 + " es mayor que " + n2 + "? " + n1.esMayor(n2));
        System.out.println(n1 + " es menor que " + n2 + "? " + n1.esMenor(n2));
        System.out.println(n1 + " es igual que " + n2 + "? " + n1.esIgual(n2));
    }
}
