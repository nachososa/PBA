package personas;

import relaciones.IRelacionable;

public class Persona implements IRelacionable {

    private final String nombre;
    private final int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public boolean esMayor(Object o) {
        if (o instanceof Persona persona) {
            return this.edad > persona.edad;
        }
        return false;
    }

    @Override
    public boolean esMenor(Object o) {
        if (o instanceof Persona persona) {
            return this.edad < persona.edad;
        }
        return false;
    }

    @Override
    public boolean esIgual(Object o) {
        if (o instanceof Persona persona) {
            return this.edad == persona.edad;
        }
        return false;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}
