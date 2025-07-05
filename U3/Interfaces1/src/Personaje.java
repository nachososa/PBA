
public class Personaje implements IMovible {

    private int fila, columna;

    public Personaje(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Personaje{" + "fila=" + fila + ", columna=" + columna + '}';
    }

    @Override
    public void moverAdelante() {
        this.fila++;
    }

    @Override
    public void moverAtras() {
        this.setFila(this.getFila() - 1);
    }

    @Override
    public void reiniciar() {
        this.fila = 0;
    }

}
