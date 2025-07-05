
class Estudiante extends Persona {

    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
    }

    // Sobreescritura de métodos
    @Override
    public void mostrarRol() {
        System.out.println("Soy un estudiante");
    }
}
