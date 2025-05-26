package PBA_2_vehiculos;

// Implementa de IConducible
public class Auto implements IConducible {

    // Atributos
    private String marca;
    private String modelo;
    private boolean estaAndando;

    // Constructor
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.estaAndando = false;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
            System.out.println("Arrancando el auto...");
            estaAndando = true;
        } else {
            System.out.println("El auto ya está andando.");
        }
    }

    @Override
    public void conducir(int distancia) {
        if (estaAndando) {
            System.out.println("Conduciendo el auto por " + distancia + " kilómetros.");
        } else {
            System.out.println("No se puede conducir. Primero debes arrancar el auto.");
        }
    }

    @Override
    public void detener() {
        if (estaAndando) {
            System.out.println("Deteniendo el auto.");
            estaAndando = false;
        } else {
            System.out.println("El auto ya está detenido.");
        }
    }
}
