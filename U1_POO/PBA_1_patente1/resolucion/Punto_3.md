# Punto 3

Patente 3: Getters y Setters

```java
public class Patente_3 {
    // Atributos privados: Encapsulamiento
    private String letrasInicioPatente;
    private int numeroPatente;
    private String letrasFinPatente;

    /*
  * getNumeroPatente()
  * Es un getter que devuelve el valor actual del atributo privado numeroPatente.
  * El return es obligatorio porque el método declara que devuelve un int (public
  * int).
     */

    public int getNumeroPatente() {
        return numeroPatente;
    }

    /*
  * setNumeroPatente(int numeroPatente)
  * Es un setter: permite asignar un nuevo valor a numeroPatente desde fuera de
  * la clase.
  * Usa this.numeroPatente para dejar claro que se refiere al atributo, no al
  * parámetro.
  *
  * ¿Por qué usar getter y setter?
  * Encapsulamiento: el atributo sigue siendo privado, pero lo accedemos de forma
  * segura. Permite agregar validaciones en el futuro sin cambiar el uso externo.
     */

    public void setNumeroPatente(int numeroPatente) {
        this.numeroPatente = numeroPatente;
    }

    /*
  * ¿Por qué usar getter y setter?
  * Encapsulamiento: el atributo sigue siendo privado, pero lo accedemos de forma
  * segura. Permite agregar validaciones en el futuro sin cambiar el uso externo.
     */

    // Método mostrarPatente() como utilidad para imprimir el estado:
    public void mostrarPatente() {
        System.out.println(letrasInicioPatente + "-" + numeroPatente + "-" + letrasFinPatente);
    }
}
