
public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 30);

        // Imprimo los atributos individualmente mediante getters
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());

        // Modifico los atributos mediante setters
        persona1.setNombre("Carlos");
        persona1.setEdad(35);

        // Imprimo la instancia
        persona1.imprimirPersona();

        Persona persona2 = new Persona("María", 40);

        // Imprimo los atributos individualmente mediante getters
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());

        // Modifico los atributos mediante setters
        persona2.setNombre("Alejandra");
        persona2.setEdad(30);

        // Imprimo la instancia
        persona2.imprimirPersona();
    }
}
