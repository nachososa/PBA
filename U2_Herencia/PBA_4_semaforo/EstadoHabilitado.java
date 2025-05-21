package PBA_4_semaforo;

public class EstadoHabilitado extends Estado {

    @Override
    public Estado cambiarEstado() {
        return (new EstadoAviso());
    }
}
