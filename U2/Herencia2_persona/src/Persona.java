
abstract class Persona {

    // ATRIBUTOS
    private String nombre;
    private int edad;

    // MÉTODOS
    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters
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

    // Método concreto
    public void saludar() {
        System.out.println("Hola, soy " + nombre + "y tengo " + edad + " años.");
    }

    // Método abstracto 
    public abstract void mostrarRol();
}
