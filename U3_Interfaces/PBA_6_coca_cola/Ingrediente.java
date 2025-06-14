package PBA_6_coca_cola;

public class Ingrediente implements Cloneable {

    private String nombre;
    private int cantidadMl;

    public Ingrediente(String nombre, int cantidadMl) {
        this.nombre = nombre;
        this.cantidadMl = cantidadMl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadMl() {
        return cantidadMl;
    }

    public void setCantidadMl(int cantidadMl) {
        this.cantidadMl = cantidadMl;
    }

    @Override
    public String toString() {
        return "IngredienteCompuesto{" + "nombre=" + nombre + ", cantidadMl=" + cantidadMl + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

}
