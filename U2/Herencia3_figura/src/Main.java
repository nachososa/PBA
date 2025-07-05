
public class Main {

    public static void main(String[] args) {

        // Circulo
        Circulo c = new Circulo("Circulo 1", 44.55);

        // Rectángulo
        Rectangulo r = new Rectangulo("Rectangulo 1", 30, 40);

        // Triangulo
        Triangulo t = new Triangulo(50, 70, "Triangulo 1");

        // Impresiones por
        System.out.println("Área del círculo: " + c.calcularArea());
        System.out.println("Área del rectángulo: " + r.calcularArea());
        System.out.println("Área del triángulo: " + t.calcularArea());

        // Polimorfismo
        // Se crea un array de Figura con espacio para 100 elementos
        Figura figuras[] = new Figura[100];

        // Guarda tus tres figuras concretas (Circulo, Rectangulo, Triangulo) en las primeras posiciones del arreglo.
        figuras[0] = c;
        figuras[1] = r;
        figuras[2] = t;

        // Itera sobre las tres posiciones y llama al método calcularArea() de cada una.
        for (int i = 0; i < 3; i++) {
            System.out.println("Area: " + figuras[i].calcularArea());
        }

    }

}
