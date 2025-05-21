package PBA_4_empleado2;

public class Empleado {

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado(String nombre, String apellido, int edad) {
        this(nombre, apellido, edad, 750000);
    }

    public Empleado() {
        this("", "", 0, 0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "El empleado se llama " + nombre + " " + apellido
                + " con " + edad + " años y un salario de " + salario;
    }

    public void ajustarSueldo(double sueldoPlus) {
        if (edad >= 40) {
            salario += sueldoPlus;
        }
    }
}
