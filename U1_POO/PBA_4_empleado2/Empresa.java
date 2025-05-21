package PBA_4_empleado2;

public class Empresa {

    private final String nombre;
    private final int aFundacion;
    private Empleado[] empleados;
    private static final int MAX_EMPLEADOS = 100;
    private int cantidadEmpleados;

    public Empresa(String nombre, int aFundacion) {
        this.nombre = nombre;
        this.aFundacion = aFundacion;
        this.empleados = new Empleado[MAX_EMPLEADOS];
        this.cantidadEmpleados = 0;
    }

    public boolean agregarEmpleado(Empleado empleado) {
        if (cantidadEmpleados < MAX_EMPLEADOS) {
            empleados[cantidadEmpleados] = empleado;
            cantidadEmpleados++;
            return true;
        }
        return false;
    }

    public void aplicarAumento(double aumento) {
        System.out.println("Empleados que recibieron aumento:");
        for (int i = 0; i < cantidadEmpleados; i++) {
            double salarioAnterior = empleados[i].getSalario();
            empleados[i].ajustarSueldo(aumento);
            if (empleados[i].getSalario() > salarioAnterior) {
                System.out.println(empleados[i].getApellido() + ", " + empleados[i].getNombre()
                        + " - Edad: " + empleados[i].getEdad());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getaFundacion() {
        return aFundacion;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }
}
