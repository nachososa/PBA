package PBA_2_ecuaciones;

public class Main {

    public static void main(String[] args) {
        Punto P1 = new Punto(1, 1);
        Punto P2 = new Punto(2, 2);
        Recta R1 = new Recta(P1, P2);

        System.out.println("Pendiente de la recta R1: " + R1.pendiente());

        Punto P3 = new Punto(3, 3);
        Recta R2 = new Recta(P2, P3);

        System.out.println("¿R1 y R2 son paralelas?: " + R1.paralelas(R2));
    }
}
