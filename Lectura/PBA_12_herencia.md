# Herencia

La herencia es un mecanismo que permite reutilizar y extender clases existentes, facilitando la creación de nuevos tipos de objetos basados en otros ya definidos. Por ejemplo, en una jerarquía de herencia, Insecto, Mamífero y Ave son subclases de Animal; Persona es subclase de Mamífero, y Hombre y Mujer derivan de Persona.

- Definición: Permite que una clase (subclase) herede atributos y métodos de otra clase (superclase).
- Sirve para reutilizar código y permite crear estructuras jerárquicas.

Ejemplo:

```java
class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {
    void moverCola() {
        System.out.println("El perro mueve la cola");
    }
}
```

Uso:

```java
Perro p = new Perro();
p.hacerSonido();  // Heredado de Animal
p.moverCola();
```

----

Una clase actúa como una **plantilla** que define atributos y funciones comunes para los objetos que se crean a partir de ella. A su vez, clases con características similares pueden organizarse en una **superclase**, de la cual derivan **subclases**. Esta estructura forma una **jerarquía**, donde las subclases heredan características de sus superclases gracias al mecanismo de **herencia**.

La herencia permite **reutilizar y extender** clases existentes, facilitando la creación de nuevos tipos de objetos basados en otros ya definidos. Por ejemplo, en una jerarquía de herencia, **Insecto**, **Mamífero** y **Ave** son subclases de **Animal**; **Persona** es subclase de **Mamífero**, y **Hombre** y **Mujer** derivan de **Persona**.

## Ejercicio básico

Implementá en el lenguaje de tu preferencia las siguientes clases:

1. Una clase `Animal` con un atributo `nombre` y un método `hacer_sonido()` que imprima "Sonido genérico".
2. Una subclase `Perro` que herede de `Animal` y sobrescriba el método `hacer_sonido()` para que imprima "Guau".
3. Una subclase `Gato` que también herede de `Animal` y sobrescriba el método para que imprima "Miau".

**Objetivo:** Practicar la creación de clases, la herencia y la sobreescritura de métodos.
