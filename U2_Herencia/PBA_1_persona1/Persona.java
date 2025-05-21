package PBA_1_persona1;

public class Persona {

    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setter
    // Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método auxiliar: forma parte de la lógica del objeto Persona
    public void imprimirPersona() {
        System.out.println(nombre + " tiene " + edad + " años.");
    }

}
