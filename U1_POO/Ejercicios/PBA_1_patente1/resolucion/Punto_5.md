# Punto 5

Patente 5

Es un getter que permite obtener el valor actual del atributo privado letrasFinPatente.

Encapsulamiento: recordar que como el atributo es privado, este método lo expone de forma controlada y segura.

```java

public class Patente_5 {
    
    // Atributos privados: Encapsulamiento
    private String letrasInicioPatente;
    private int numeroPatente;
    private String letrasFinPatente;
    
    public String getLetrasFinPatente() {
        return letrasFinPatente;
    }

    // Método mostrarPatente() como utilidad para imprimir el estado:
    public void mostrarPatente() {
        System.out.println(letrasInicioPatente + "-" + numeroPatente + "-" + letrasFinPatente);
    }
}
