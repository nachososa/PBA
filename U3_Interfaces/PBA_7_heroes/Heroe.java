package PBA_7_heroes;

class Heroe implements Comparable<Heroe> {

    private final String nombre;
    private final int poderCombate;

    public Heroe(String nombre, int poderCombate) {
        this.nombre = nombre;
        this.poderCombate = poderCombate;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoderCombate() {
        return poderCombate;
    }

    @Override
    public int compareTo(Heroe otroHeroe) {

        if (this.poderCombate != otroHeroe.poderCombate) {
            return Integer.compare(otroHeroe.poderCombate, this.poderCombate);
        } else {
            return this.nombre.compareTo(otroHeroe.nombre);
        }
    }

    @Override
    public String toString() {
        return nombre + " (Poder: " + poderCombate + ")";
    }
}
