# Punto 4

Patente 4

getLetrasInicioPatente(): Es un getter para el atributo privado letrasInicioPatente.
Devuelve un valor de tipo String, que es el tipo del atributo correspondiente.
Es necesario porque el atributo es privado (private), y este método permite acceder a su valor desde fuera de la clase respetando el principio de encapsulamiento.
/

```java
public class Patente_4 {

    // Atributos privados: Encapsulamiento
    private String letrasInicioPatente;
    private int numeroPatente;
    private String letrasFinPatente;

    public String getLetrasInicioPatente() {
        return letrasInicioPatente;
    }

    // Método mostrarPatente() es una utilidad, que imprime el estado:
    public void mostrarPatente() {
        System.out.println(letrasInicioPatente + "-" + numeroPatente + "-" + letrasFinPatente);
    }
}
