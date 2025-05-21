package PBA_1_persona2;

class Profesor extends Persona {

    // Atributos privados
    private String materia;

    // Constructor
    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    // Getters y setters
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    // Sobreescritura de métodos
    @Override
    public void mostrarRol() {
        System.out.println(getNombre() + " soy un profesor de " + materia);
    }
}
