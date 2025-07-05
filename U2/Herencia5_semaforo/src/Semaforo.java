
public class Semaforo {

    // Atributos privados
    private final String calle1;
    private final String calle2;
    private Estado estado;

    // Constructor
    public Semaforo(String calle1, String calle2) {
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.estado = new EstadoHabilitado();
    }

    public void cambiarEstado() {
        estado = estado.cambiarEstado();
    }

    // Getters
    public String getCalle1() {
        return calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public String getEstadoActual() {
        return estado.getClass().getSimpleName();
    }
}
