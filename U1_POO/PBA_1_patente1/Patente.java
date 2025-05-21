package PBA_1_patente1;

public class Patente {

    private String letrasInicioPatente;
    private int numeroPatente;
    private String letrasFinPatente;

    // Constructor por defecto
    public Patente() {
        letrasInicioPatente = "";
        numeroPatente = 0;
        letrasFinPatente = "";
    }

    // Getter y Setter de numeroPatente
    public int getNumeroPatente() {
        return numeroPatente;
    }

    public void setNumeroPatente(int numeroPatente) {
        this.numeroPatente = numeroPatente;
    }

    // Getter y Setter de letrasInicioPatente
    public String getLetrasInicioPatente() {
        return letrasInicioPatente;
    }

    public void setLetrasInicioPatente(String letrasInicioPatente) {
        this.letrasInicioPatente = letrasInicioPatente;
    }

    // Getter y Setter de letrasFinPatente
    public String getLetrasFinPatente() {
        return letrasFinPatente;
    }

    public void setLetrasFinPatente(String letrasFinPatente) {
        this.letrasFinPatente = letrasFinPatente;
    }

    // Método para mostrar la patente completa
    public void mostrarPatente() {
        System.out.println(letrasInicioPatente + "-" + numeroPatente + "-" + letrasFinPatente);
    }
}
