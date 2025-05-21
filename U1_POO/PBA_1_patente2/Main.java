package PBA_1_patente2;

public class Main {

    public static void main(String[] args) {
        Patente p = new Patente();

        // Probamos valores válidos
        p.setNumeroPatente(123);
        p.setLetrasInicioPatente("AB");

        // Probamos valores inválidos
        p.setNumeroPatente(9999); // Inválido
        p.setLetrasInicioPatente("ABC"); // Inválido

        // Mostramos datos actuales
        System.out.println("Inicio: " + p.getLetrasInicioPatente());
        System.out.println("Número: " + p.getNumeroPatente());
        System.out.println("Fin: " + p.getLetrasFinPatente());
    }
}
