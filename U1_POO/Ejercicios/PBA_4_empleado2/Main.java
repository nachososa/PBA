package PBA_4_empleado2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Empresa empresa = new Empresa("TechLogistics", 2005);

            boolean continuar = true;
            while (continuar) {
                System.out.print("Ingrese el nombre del empleado: ");
                String nombre = scanner.next();
                System.out.print("Ingrese el apellido del empleado: ");
                String apellido = scanner.next();
                System.out.print("Ingrese la edad del empleado: ");
                int edad = scanner.nextInt();
                System.out.print("Ingrese el salario del empleado: ");
                double salario = scanner.nextDouble();

                Empleado nuevoEmpleado = new Empleado(nombre, apellido, edad, salario);
                if (!empresa.agregarEmpleado(nuevoEmpleado)) {
                    System.out.println("No se pudo agregar a " + nombre + " " + apellido + ", empresa llena.");
                }

                System.out.print("¿Desea agregar otro empleado? (si/no): ");
                String respuesta = scanner.next();
                if (respuesta.equalsIgnoreCase("no")) {
                    continuar = false;
                }
            }

            System.out.print("Ingrese el monto de aumento a aplicar: ");
            double aumento = scanner.nextDouble();

            empresa.aplicarAumento(aumento);
        }
    }
}
