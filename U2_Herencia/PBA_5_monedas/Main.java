// Main.java
package PBA_5_monedas;

public class Main {

    public static void main(String[] args) {
        // 1. Creación de instancias de diferentes monedas
        Moneda pesosArg = new PesoArgentino(370);   // 370 pesos argentinos
        Moneda dolares = new Dolar(2);             // 2 dólares
        Moneda euros = new Euro(3);                // 3 euros
        Moneda pesosPeru = new PesoPeruano(500);   // 500 soles peruanos

        // 2. Operaciones de suma (siempre devuelve el tipo del receptor)
        System.out.println("\n--- Operaciones de Suma ---");
        Moneda suma1 = pesosArg.suma(dolares); // PesoArgentino + Dolar = PesoArgentino
        System.out.println("370 pesos + 2 dólares = " + suma1);

        Moneda suma2 = euros.suma(pesosPeru);  // Euro + PesoPeruano = Euro
        System.out.println("3 euros + 500 soles = " + suma2);

        // 3. Conversiones a dólares
        System.out.println("\n--- Conversiones a Dólares ---");
        Dolar pesosEnDolares = pesosArg.asDolar();
        System.out.println("370 pesos argentinos = " + pesosEnDolares);

        Dolar eurosEnDolares = euros.asDolar();
        System.out.println("3 euros = " + eurosEnDolares);

        // 4. Suma de múltiples monedas
        System.out.println("\n--- Suma Múltiple ---");
        Moneda sumaTotal = pesosArg.suma(dolares).suma(euros).suma(pesosPeru);
        System.out.println("Suma total en pesos argentinos: " + sumaTotal);

        // 5. Mostrar todas las monedas creadas
        System.out.println("\n--- Monedas Creadas ---");
        Moneda[] monedas = {pesosArg, dolares, euros, pesosPeru};
        for (Moneda m : monedas) {
            System.out.println(m);
        }

        // 6. Comparación de valores en dólares
        System.out.println("\n--- Comparación en Dólares ---");
        System.out.println("370 pesos argentinos = " + pesosArg.asDolar());
        System.out.println("500 soles peruanos = " + pesosPeru.asDolar());
        System.out.println("3 euros = " + euros.asDolar());
    }
}
