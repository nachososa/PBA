
public class EstadoAviso extends Estado {

    @Override
    public Estado cambiarEstado() {
        return (new EstadoNoHabilitado());
    }
}
