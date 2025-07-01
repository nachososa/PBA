# Interfaces

## ¿Qué es una interfaz?

Una **interfaz** es un conjunto de métodos (solo sus signaturas) que una clase se compromete a implementar. Representa un **contrato funcional** que debe ser respetado por cualquier clase que la implemente.

***signatura (o firma) de un método:*** es la combinación del su nombre y los tipos y número de sus parámetros. Es lo que permite distinguir un método de otro, especialmente cuando hay sobrecarga de métodos (métodos con el mismo nombre pero diferentes parámetros).

- Permite construir programas más **flexibles, escalables y mantenibles**.
- Favorece el **bajo acoplamiento** y la **alta cohesión**, dos principios esenciales del buen diseño de software.
- No debe confundirse con la "interfaz de usuario", que se refiere a la parte visual del programa.

## Cohesión y Acoplamiento

### Cohesión

La **cohesión** indica qué tan enfocado está el propósito de una clase.

- Alta cohesión:
  - La clase tiene una única responsabilidad clara.
  - Es más fácil de entender, mantener y reutilizar.

### Acoplamiento

El **acoplamiento** mide la dependencia entre clases.

- Bajo acoplamiento:
  - Las clases son independientes entre sí.
  - Se pueden modificar sin afectar otras partes del sistema.
  - Se logra ocultando la implementación interna mediante getters y setters, y conociendo solo lo necesario de otras clases.

## Declaración e Implementación de Interfaces

### Declaración

Una interfaz se declara con la palabra clave `interface`:

```java
public interface Figura {
    double area(int base, int altura);
}
```

- No contiene implementación, solo las signaturas de los métodos.
- Puede contener constantes (public static final).

### Implementación

Para implementar una interfaz en una clase se usa implements. La clase debe sobrescribir todos los métodos de la interfaz:

```java
public class Rectangulo implements Figura {
    public double area(int base, int altura) {
        return base * altura;
    }
}
```

Si una clase no implementa todos los métodos, se genera un error de compilación.
