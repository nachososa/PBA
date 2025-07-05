
public class ManejadorPaginas implements IMovible {

    private int paginaActual;
    private int cantPaginas;

    public ManejadorPaginas(int paginaActual, int cantPaginas) {
        this.paginaActual = paginaActual;
        this.cantPaginas = cantPaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    @Override
    public String toString() {
        return "ManejadorPaginas{" + "paginaActual=" + paginaActual + ", cantPaginas=" + cantPaginas + '}';
    }

    @Override
    public void moverAdelante() {
        if (this.paginaActual < this.cantPaginas) {
            this.paginaActual++;
        }
    }

    @Override
    public void moverAtras() {
        if (this.cantPaginas > 1) {
            this.paginaActual--;
        }
    }

    @Override
    public void reiniciar() {
        this.paginaActual = 1;
    }

}
