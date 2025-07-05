
public class Main {

    public static void main(String[] args) {

        //
        Persona persona1 = new Estudiante("Juan", 20);
        persona1.saludar();
        persona1.mostrarRol();

        // 
        Persona persona2 = new Estudiante("Juan", 20);
        persona2.saludar();
        persona2.mostrarRol();

        // Profesor
        Persona profesor1 = new Profesor("Carlos", 45, "Matemáticas");
        profesor1.saludar();
        profesor1.mostrarRol();
    }
}
