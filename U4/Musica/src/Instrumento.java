
public abstract class Instrumento {

    public abstract String getNombre();

    @Override
    public String toString() {
        return getNombre();
    }
}
