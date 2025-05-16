# Punto 2

Patentes 2: Constructor con parámetros

Constructor con parámetros
Sirve para crear un objeto Patente indicando valores iniciales específicos al momento de la creación.

This: La palabra clave this se usa para diferenciar el atributo de la clase del parámetro recibido. Si no se usa, se puede prestar a a confucíon ya que los nombres son iguales.

El primer letrasInicioPatente (a la izq del =) es el atributo de la clase.
El segundo (a la derecha) es el parámetro recibido por el constructor.

```java
public class Patente_2 {

// Atributos privados: Encapsulamiento
    private String letrasInicioPatente;
    private int numeroPatente;
    private String letrasFinPatente;

    public Patente_2(String letrasInicioPatente, int numeroPatente, String letrasFinPatente) {
        this.letrasInicioPatente = letrasInicioPatente;
        this.numeroPatente = numeroPatente;
        this.letrasFinPatente = letrasFinPatente;
    }

    public void mostrarPatente() {
        System.out.println(letrasInicioPatente + "-" + numeroPatente + "-" + letrasFinPatente);
    }
}
