# Punto 7

Patente 7

Es un setter para el atributo privado letrasFinPatente.
Permite que desde fuera de la clase podamos asignar un valor nuevo al atributo, respetando el principio de encapsulamiento.

```java

public class Patente_7 {
    // Atributos privados: Encapsulamiento
    private String letrasInicioPatente;
    private int numeroPatente;
    private String letrasFinPatente;

    public void setLetrasInicioPatente(String letrasInicioPatente) {
        this.letrasInicioPatente = letrasInicioPatente;
    }

    // Método mostrarPatente() como utilidad para imprimir el estado:
    public void mostrarPatente() {
        System.out.println(letrasInicioPatente + "-" + numeroPatente + "-" + letrasFinPatente);
    }
}
