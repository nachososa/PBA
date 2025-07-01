package PBA_1;

public class Main {

    public static void main(String[] args) {

        // *** INSTANCIA ALUMNO 1 ***
        Alumno alumno1 = new Alumno("Juan Manuel Peres", 1643, 7);

        // Imprimo los atributos individualmente mediante getters
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Legajo: " + alumno1.getLegajo());
        System.out.println("Legajo: " + alumno1.getLegajo());

        // Modifico los atributos mediante setters
        alumno1.setNombre("Carlos Rodríguez");
        alumno1.setLegajo(6547);

        // Imprimo la instancia: alumno1
        alumno1.imprimirAlumno();

        // *** INSTANCIA ALUMNO 2 ***
        Alumno alumno2 = new Alumno("Alejandra Martinez", 4333, 9);

        // Imprimo los atributos individualmente mediante getters
        System.out.println("Nombre: " + alumno2.getNombre());
        System.out.println("Legajo: " + alumno2.getLegajo());

        // Modifico los atributos mediante setters
        alumno2.setNombre("Paula Gutierrez");
        alumno2.setLegajo(9212);

        // Imprimo la instancia: alumno2
        alumno2.imprimirAlumno();

        // INSTANCIA ALUMNO 1 y 2: Existen en memoria de forma independiente
    }
}
