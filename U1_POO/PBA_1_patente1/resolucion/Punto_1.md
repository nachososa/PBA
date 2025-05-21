# Punto 1

Patentes 1: Constructor vacío o sin parámetros

Este constructor sirve para crear un objeto de tipo Patente sin necesidad de pasarle valores iniciales. Los constructores no tienen tipo de retorno (ni siquiera void) y deben llamarse exactamente igual que la clase.

```java
public class Patente_1 {
    
// Atributos privados: Encapsulamiento
    private String letrasInicioPatente;
    private int numeroPatente;
    private String letrasFinPatente;

public Patente_1() {
        letrasInicioPatente = "";
        numeroPatente = 0;
        letrasFinPatente = "";
    }

public void mostrarPatente() {
        System.out.println(letrasInicioPatente + "-" + numeroPatente + "-" + letrasFinPatente);
    }
}
