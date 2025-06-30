# Métodos Constructores

Un constructor es un método especial que se ejecuta automáticamente al crear un nuevo objeto, new Clase(). Su función principal es inicializar las propiedades del objeto con valores predeterminados o proporcionados al momento de la creación.

## Características principales

- Tiene el mismo nombre que la clase.
- No tiene tipo de retorno, ni siquiera void.
- Puede tener parámetros para inicializar atributos con valores específicos.
- Si no defines un constructor, Java crea uno por defecto sin parámetros.

Ejemplo 1. Con constructor

```java
public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre; 
        this.edad = edad;
    }
}

// Uso:
Persona p = new Persona("Ana", 25);  // Atributos inicializados directamente

```

Ejemplo 2. Sin constructor

```java
public class Persona {
    private String nombre;
    private int edad;

    // Métodos setters/getters...
}

// Uso:
Persona p = new Persona();
p.setNombre("Ana");  // Obligatorio llamar a setter después de crear el objeto.
p.setEdad(25);

// Problema: Es necesario llamar a setNombre() o setEdad(), sino el objeto queda en estado inconsistente
```

**Ventajas del Constructor:**

- Obliga a proporcionar datos esenciales al crear el objeto.
- Elimina pasos adicionales (no se depende de setters después de new).
- Centraliza la lógica de inicialización (ej: validar que edad > 0).

***Conclusión***
El constructor asegura que los objetos se creen en un estado válido, mientras que los setters permiten flexibilidad para cambios posteriores. Es una buena práctica usarlos juntos, pero el constructor es clave para la inicialización segura.
