# Abstracción

- Definición:
Es el proceso de identificar y definir las características esenciales de un objeto, ignorando los detalles que no son relevantes para el contexto del problema.

- Ejemplo:
Un vehículo puede representarse con atributos como marca, modelo y velocidad, sin preocuparse por cómo funciona internamente el motor.

```java
class Vehículo {

    // Definición de atributos
    String marca;
    String modelo;
    int velocidad;

    // Capacidades o métodos
    void acelerar() {
        velocidad += 10;
    }
}
```
