
public class Main {

    public static void main(String[] args) {
        Heroe ironMan = new Heroe("IronMan", 100);
        Heroe hulk = new Heroe("Hulk", 95);
        Heroe thor = new Heroe("Thor", 100);
        Heroe spiderMan = new Heroe("SpiderMan", 120);

        System.out.println("--- Duelos de Héroes ---");
        realizarDuelo(ironMan, hulk);
        realizarDuelo(ironMan, thor);
        realizarDuelo(spiderMan, ironMan);
        realizarDuelo(hulk, thor);
    }

    private static void realizarDuelo(Heroe heroe1, Heroe heroe2) {
        System.out.println("\n" + heroe1.getNombre() + " (" + heroe1.getPoderCombate()
                + ") vs " + heroe2.getNombre() + " (" + heroe2.getPoderCombate() + ")");

        int resultado = heroe1.compareTo(heroe2);

        if (resultado > 0) {
            System.out.println(heroe1.getNombre() + " tiene ventaja sobre " + heroe2.getNombre() + ".");
        } else if (resultado < 0) {
            System.out.println(heroe1.getNombre() + " tiene desventaja frente a " + heroe2.getNombre() + ".");
        } else {
            System.out.println("¡Empate en poder entre " + heroe1.getNombre()
                    + " y " + heroe2.getNombre() + "!");
            if (heroe1.getNombre().equals(heroe2.getNombre())) {
                System.out.println("(¡Incluso tienen el mismo nombre!)");
            } else {
                System.out.println("(Se ordenarían alfabéticamente como: '"
                        + (heroe1.getNombre().compareTo(heroe2.getNombre()) < 0
                        ? heroe1.getNombre() : heroe2.getNombre()) + "' primero)");
            }
        }
    }
}
