package PBA_4_empleado1;

public class Main {

    /*
     * Empleado 1: Fernando Ureña, 23 años, sueldo mensual: $1.300.000,00
     * Empleado 2: Adrián López, 50 años, sueldo mensual: $2.200.000,00
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Fernando", "Ureña", 23, 1300000);

        Empleado e2 = new Empleado();
        e2.setNombre("Adrián");
        e2.setApellido("López");
        e2.setEdad(50);
        e2.setSalario(2200000);

        /*
         * System.out.println("Nombre: " + e1.getNombre() + " - Apellido: " +
         * e1.getApellido() + " - Edad: " + e1.getEdad() + " - Salario: " +
         * e1.getSalario());
         * System.out.println("Nombre: " + e2.getNombre() + " - Apellido: " +
         * e2.getApellido() + " - Edad: " + e2.getEdad() + " - Salario: " +
         * e2.getSalario());
         */
        System.out.println(e1.toString());
        System.out.println(e2.toString());

        e1.ajustarSueldo(50000);
        e2.ajustarSueldo(50000);

        System.out.println(e1.getSalario());
        System.out.println(e2.getSalario());
    }
}
