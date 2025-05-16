# Métodos Constructores

Un constructor es un método especial que se ejecuta automáticamente al crear un nuevo objeto, new Clase(). Su función principal es inicializar las propiedades del objeto con valores predeterminados o proporcionados al momento de la creación.

Ejemplo 1. Sin constructor

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
```

Problema: Es necesario llamar a setNombre() o setEdad(), sino el objeto queda en estado inconsistente.

Ejemplo 2. Con constructor

```java
public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;  // Asigna valores AL CREAR el objeto
        this.edad = edad;
    }
}

// Uso:
Persona p = new Persona("Ana", 25);  // Atributos inicializados directamente
```

**Ventajas del Constructor:**

- Obliga a proporcionar datos esenciales al crear el objeto.
- Elimina pasos adicionales (no se depende de setters después de new).
- Centraliza la lógica de inicialización (ej: validar que edad > 0).

Conclusión
El constructor asegura que los objetos se creen en un estado válido, mientras que los setters permiten flexibilidad para cambios posteriores. Es una buena práctica usarlos juntos, pero el constructor es clave para la inicialización segura.
