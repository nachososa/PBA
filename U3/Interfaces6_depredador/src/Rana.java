
public class Rana extends Anfibio implements IDepredador, IPresa {

    @Override
    public void cazar() {
        System.out.println("La rana caza insectos con su lengua.");
    }

    @Override
    public void perseguir() {
        System.out.println("La rana salta tras su presa.");
    }

    @Override
    public void huir() {
        System.out.println("La rana huye saltando al agua.");
    }

    @Override
    public void observar() {
        System.out.println("La rana observa su entorno con atención.");
    }
}
