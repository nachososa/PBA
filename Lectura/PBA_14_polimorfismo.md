# Polimorfismo

- Definición: Significa "muchas formas". Es la capacidad de una referencia de tipo padre de comportarse diferente según el objeto al que apunta.
- Tipos:
  - Polimorfismo en tiempo de compilación: sobrecarga de métodos (method overloading)
  - Polimorfismo en tiempo de ejecución: sobreescritura de métodos (method overriding)
  - Permite enviar mensajes que son sintácticamente iguales a objetos de tipos disintos.
- Ejemplo (Sobreescritura):

```java
class Animal {
    void hacerSonido() {
        System.out.println("Sonido de animal");
    }
}

class Gato extends Animal {
    void hacerSonido() {
        System.out.println("Miau");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("Guau");
    }
}
```

Uso:

```java
Animal a1 = new Gato();
Animal a2 = new Perro();

a1.hacerSonido();  // Miau
a2.hacerSonido();  // Guau
```

Aunque ambas variables son del tipo Animal, se comportan según su tipo real (Gato o Perro).
