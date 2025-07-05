
public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 30);
        Persona p2 = new Persona("Ana", 30);
        Persona p3 = new Persona("Juan", 25);

        System.out.println("¿Persona1 es igual a Persona2? " + p1.equals(p2)); // true
        System.out.println("¿Persona1 es igual a Persona3? " + p1.equals(p3)); // false
    }
}
