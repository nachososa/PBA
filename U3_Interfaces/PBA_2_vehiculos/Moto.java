package PBA_2_vehiculos;

// Implementa de la IConducible
public class Moto implements IConducible {

    // Atributos
    private String marca;
    private boolean estaAndando;

    // Constructor
    public Moto(String marca) {
        this.marca = marca;
        this.estaAndando = false;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstaAndando() {
        return estaAndando;
    }

    public void setEstaAndando(boolean estaAndando) {
        this.estaAndando = estaAndando;
    }

    // Metodos
    @Override
    public void arrancar() {
        if (!estaAndando) {
            System.out.println("Arrancando la moto...");
            estaAndando = true;
        } else {
            System.out.println("La moto ya está andando.");
        }
    }

    @Override
    public void conducir(int distancia) {
        if (estaAndando) {
            System.out.println("Conduciendo la moto por " + distancia + " kilómetros.");
        } else {
            System.out.println("No se puede conducir. Primero debes arrancar la moto.");
        }
    }

    @Override
    public void detener() {
        if (estaAndando) {
            System.out.println("Deteniendo la moto.");
            estaAndando = false;
        } else {
            System.out.println("La moto ya está detenida.");
        }
    }
}
