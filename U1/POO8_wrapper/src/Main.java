
public class Main {

    public static void main(String[] args) {

        int a = 123; // se asigna 123 a la variable a
        Integer i = a; // Autoboxing: de primitivo a objeto
        int v = i; // Unboxing: de objeto a primitivo

        String edadTexto = "25";

        // Convertir de String a Integer (wrapper object)
        Integer edadWrapper = Integer.valueOf(edadTexto);

        // Unboxing implícito: el objeto Integer se convierte automáticamente en int
        int edad = edadWrapper;

        // Autoboxing: el int se convierte automáticamente en Integer
        Integer nuevaEdad = edad + 5;

        System.out.println("i: " + i + " (es objeto: " + (i instanceof Integer) + ")");
        System.out.println("v: " + v + " (es primitivo: no se puede usar instanceof)");

        System.out.println("Edad original: " + edadWrapper);
        System.out.println("Edad después de 5 años (usando wrapper): " + nuevaEdad);
    }
}
