
public class Main {

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║     SIMULACIÓN DEPREDADOR-PRESA      ║");
        System.out.println("╚══════════════════════════════════════╝\n");

        System.out.println("--- ACCIONES DEL LEÓN ---");
        Leon leon = new Leon();
        leon.cazar();
        leon.perseguir();
        System.out.println();

        System.out.println("--- ACCIONES DE LA RANA ---");
        Rana rana = new Rana();
        System.out.println("Como depredador:");
        rana.cazar();
        rana.perseguir();
        System.out.println("Como presa:");
        rana.huir();
        rana.observar();
        System.out.println();

        System.out.println("--- ACCIONES DE LA OVEJA ---");
        Oveja oveja = new Oveja();
        oveja.huir();
        oveja.observar();
        System.out.println();

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║       FIN DE LA SIMULACIÓN           ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
}
