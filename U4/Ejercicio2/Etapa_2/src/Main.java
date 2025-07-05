
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GestionFiguras gestor = new GestionFiguras();
        MenuConsola menu = new MenuConsola(entrada, gestor);
        menu.mostrar();
    }
}
