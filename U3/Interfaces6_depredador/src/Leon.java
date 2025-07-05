
public class Leon extends Felino implements IDepredador {

    @Override
    public void cazar() {
        System.out.println("El león está cazando.");
    }

    @Override
    public void perseguir() {
        System.out.println("El león persigue a su presa.");
    }
}
