
import java.util.Objects;

class Persona {

    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters
    // Nombre
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Edad
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // compara referencias
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Persona otra = (Persona) obj;
        return edad == otra.edad && Objects.equals(nombre, otra.nombre);
    }

    // toString
    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}
