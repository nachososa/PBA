
public class EstadoHabilitado extends Estado {

    @Override
    public Estado cambiarEstado() {
        return (new EstadoAviso());
    }
}
