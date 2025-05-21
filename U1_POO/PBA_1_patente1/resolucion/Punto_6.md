# Punto 6

Patente 6

setLetrasInicioPatente(): Es un setter. Permite asignar un nuevo valor al atributo privado letrasInicioPatente.
This: lo uso porque el parámetro del método se llama igual que el atributo, y se necesita distinguirlos.

```java
public class Patente_6 {
    
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
