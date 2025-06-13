package PBA_4_interfaces1;

public class ManejadorPaginas implements IMovible {

    // Atributos
    private int paginaActual;
    private int cantPaginas;

    // Constructor de la Clase ManejadorPaginas
    // Un constructor es un método especial que se ejecuta automáticamente cuando se crea un objeto.
    // Sirve para inicializar los valores de los atributos del objeto.
    public ManejadorPaginas(int paginaActual, int cantPaginas) {
        this.paginaActual = paginaActual;
        this.cantPaginas = cantPaginas;
    }

    // Getters y Setters
    // PaginaActual
    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }

    // CantPaginas
    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    // Sobreescritura del método toString que pertenece a la Clase Object
    @Override
    public String toString() {
        return "ManejadorPaginas{" + "paginaActual=" + paginaActual + ", cantPaginas=" + cantPaginas + '}';
    }

    // Sobreescritura de los métodos de IMovible
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
