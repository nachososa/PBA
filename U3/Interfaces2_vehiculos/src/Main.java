
public class Main {

    public static void main(String[] args) {

        IConducible miAuto = new Auto("Toyota", "Corolla");
        IConducible miMoto = new Moto("Honda");

        // Uso del Auto
        miAuto.arrancar();
        miAuto.conducir(20);
        miAuto.detener();

        System.out.println();

        // Uso de la Moto
        miMoto.arrancar();
        miMoto.conducir(15);
        miMoto.detener();
    }
}
