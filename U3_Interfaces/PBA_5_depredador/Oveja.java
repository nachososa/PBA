package PBA_5_depredador;

public class Oveja extends Mamifero implements IPresa {

    @Override
    public void huir() {
        System.out.println("La oveja corre campo adentro para escapar del depredador.");
    }

    @Override
    public void observar() {
        System.out.println("La oveja observa a su alrededor en busca de peligros para ella.");
    }
}
