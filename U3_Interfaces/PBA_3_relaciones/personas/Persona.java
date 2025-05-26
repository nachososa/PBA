package personas;

import relaciones.IRelacionable;

public class Persona implements IRelacionable {

    // Atributos
    private String nombre;
    private int edad;

    // Constructores
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /* Getters y Setters
    No participan en este momento. Solo serían útiles si después se quisiera consultar o modificar el nombre o la edad.
    
    Se usa solamente el constructor, que asigna directamente los valores: nombre y edad.

    Getters: métodos para consultar (leer) el valor de un atributo privado.
    Setters: métodos para modificar (escribir) el valor de un atributo privado.
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Sobreescritura de Métodos
    @Override
    public boolean esMayor(Object o) {

        // instanceof: operador que verifica si un objeto pertenece a una clase específica
        if (o instanceof Persona persona) {
            // return p1 > p2;
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

    // Sobreescritura de Métodos: Clase Object
    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}
