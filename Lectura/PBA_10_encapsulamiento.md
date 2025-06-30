# Encapsulamiento

***Definición***
Consiste en ocultar los detalles internos de una clase y permitir el acceso solo a través de métodos públicos. Esto se logra mediante atributos privados y métodos públicos para acceder y modificar esos atributos,

Ejemplo:

```java

// 
class Persona {

    // Atributos privados: solo accesibles desde dentro de la clase
    private String nombre;
    private int edad;

    // Getter para el atributo 'nombre'
    // Permite obtener el valor de 'nombre' desde fuera de la clase
    public String getNombre() {
        return nombre;
    }

    // Setter para el atributo 'nombre'
    // Permite modificar el valor de 'nombre' desde fuera de la clase
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el atributo 'edad'
    // Permite obtener el valor de 'edad' desde fuera de la clase
    public int getEdad() {
        return edad;
    }

    // Setter para el atributo 'edad'
    // Valida que la edad sea mayor o igual a 0 antes de asignarla
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
}
