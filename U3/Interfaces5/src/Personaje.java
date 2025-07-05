
public class Personaje implements IMovible {
// Personaje implements IMovible: significa que la clase Personaje "se compromete" a implementar todos los métodos definidos en IMovible.

    // Atributos
    private int fila, columna;

    // Constructor
    public Personaje(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        // Constructor: es un método especial que se ejecuta automáticamente cuando se crea un objeto.
        // sirve para inicializar los valores de los atributos del objeto.
        // el nombre del Constructor debe ser igual al de la clase.
        // this hace referencia al atributo del objeto actual, para diferenciarlo del parámetro.
        // Ejemplo (ver Main): Personaje miPersonaje = new Personaje(0, 0);
    }

    // Getters y Setters: sirven para acceder a los Atributos/Métodos, ya que el modificador de acceso se declara como Private, lo que significa que sólo son accesibles desde dentro de la misma clase.
    // Fila
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    // Columna
    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    // Sobreescritura del método toString que pertenece a la Clase Object
    @Override
    public String toString() {
        return "Personaje{" + "fila=" + fila + ", columna=" + columna + '}';
    }

    // Sobreescritura de los métodos de IMovible
    // sumar 1 a fila
    @Override
    public void moverAdelante() {
        this.fila++;
    }

    @Override
    // restar 1 a fila
    public void moverAtras() {
        this.setFila(this.getFila() - 1);
    }

    // volver a cero
    @Override
    public void reiniciar() {
        this.fila = 0;
    }

}
