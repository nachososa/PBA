# Clases abstractas

- No pueden ser instanciadas directamente.
- Sirven como base para otras clases.
- Solo pueden ser heredadas (son superclases en relaciones de herencia).
- Definen una estructura común para sus subclases.
- Fuerzan a que las subclases concretas implementen ciertos métodos.

- Métodos
  - Pueden incluir métodos abstractos (sin implementación)
  - Pueden incluir métodos concretos (con implementación)
  - Las subclases concretas deben implementar todos los métodos abstractos

## @Override o sobrescritura

- Es cuando una subclase redefine un método que ya existía en la superclase.
- La versión de la subclase reemplaza la original.
- El método sobrescrito debe tener exactamente la misma firma que el original.
- Se usa para personalizar el comportamiento de un método en una subclase.
- Es cuando una subclase redefine un método ya definido en su superclase.  
- La nueva versión en la subclase reemplaza el comportamiento original.  
- El método sobrescrito debe tener exactamente la misma firma (nombre y parámetros) que el original.  
- Se utiliza para personalizar o especializar el comportamiento heredado.

Ejemplo:

```java
class Animal {
    void hablar() {
        System.out.println("Hace un sonido");
    }
}

class Gato extends Animal {
    @Override
    void hablar() {
        System.out.println("Miau");
    }
}
```

## Sobrecarga o Overloading

- La sobrecarga ocurre cuando se definen varios métodos con el mismo nombre, pero con diferente cantidad o tipo de parámetros dentro de una misma clase. Lo que los diferencia es la firma del método: el número y/o tipo de parámetros.
- Esto permite que un mismo método se adapte a diferentes contextos o necesidades.

Ejemplo:

```java
void mostrar(String mensaje) { ... }
void mostrar(String mensaje, int veces) { ... }
```

## Ligadura dinámica (Dynamic Binding)

La ligadura dinámica (también llamada late binding) es cuando el método a ejecutar se determina en tiempo de ejecución y no en compilación.
