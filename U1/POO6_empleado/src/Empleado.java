
public class Empleado {

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    public String getNombre() {
        return this.nombre;
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

    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = 750000;
    }

    public Empleado() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.salario = 0;
    }

    @Override
    public String toString() {
        String mensaje = "El empleado se llama " + this.nombre + " " + this.apellido
                + " con " + this.edad + " años y un salario de " + this.salario;
        return mensaje;
    }

    public void ajustarSueldo(double sueldoPlus) {
        if (this.edad >= 40) {
            this.salario += sueldoPlus;
        }
    }

}
