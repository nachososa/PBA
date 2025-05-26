package personas;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 30);
        Persona p2 = new Persona("Luis", 25);
        /*
        ¿Por que funcionan los println, si los atributos son privados?
        Los println funcionan porque al imprimir un objeto, Java llama automáticamente al método toString().
        Aunque los atributos sean privados, toString() devuelve una representación en texto usando esos atributos, permitiendo mostrar información sin acceder directamente a ellos. El toString, esta en la misma clase que los atributos privados.
         */
        System.out.println(p1 + " es mayor que " + p2 + "? " + p1.esMayor(p2));
        System.out.println(p1 + " es menor que " + p2 + "? " + p1.esMenor(p2));
        System.out.println(p1 + " es igual que " + p2 + "? " + p1.esIgual(p2));
    }
}
