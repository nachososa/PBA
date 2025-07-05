
public class Main {

    public static void main(String[] args) {
        // Se crea triang1
        Triangulo triang1 = new Triangulo(7, 8, "Triángulo 1");
        System.out.println(triang1);

        // Se crea triang2
        Triangulo triang2 = new Triangulo(4, 8, "Triángulo 1");

        // Se utiliza el método equals
        if (triang1.equals(triang2)) {
            System.out.println("Los triángulos son iguales");
        } else {
            System.out.println("Los triángulos NO son iguales");
        }
    }
}
