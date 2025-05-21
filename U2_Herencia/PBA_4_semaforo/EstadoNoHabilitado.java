package PBA_4_semaforo;

public class EstadoNoHabilitado extends Estado {

    @Override
    public Estado cambiarEstado() {
        return (new EstadoHabilitado());
    }
}
