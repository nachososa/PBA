# Introducción

La Programación Orientada a Objetos (POO) es un paradigma de programación que organiza el código en objetos, los cuales representan entidades del mundo real con propiedades (atributos) y comportamientos (métodos).

## Clases y Objetos (ó instancia de una clase)

### Clase

Una clase es una plantilla o modelo que define las propiedades (atributos) y comportamientos (métodos) que tendrán los objetos creados a partir de ella.

### Tipos de clases

- **Concreta:**
- Es posible crear objetos (instancias) a partir de ella.
- Define todos sus métodos, y se puede usar para crear objetos.
- Es decir, que desde una Main Class puedo hacer un New y crear un objeto a partir de esa Clase.

- **Abstracta:**
- Es una clase que no puede ser instanciada directamente.
- Sirve como base para otras clases y puede incluir métodos sin implementar (abstractos).
- Las subclases deben completar esos métodos para poder ser utilizadas.
- Puede poseer atributos, métodos y constructores.
- Solo forman parte de una relación de herencia como superclases.
- Solo pueden ser heredadas.

- **Class**
  - Puede tener propiedades, métodos, constructores, etc.
  - No necesita tener un método main().
  - Sirve para representar entidades, lógica de negocio, estructuras de datos, etc.

- **Main Class**
  - Es el punto de entrada del programa. Java empieza la ejecución desde ese método.
  - Es una clase especial que contiene el método public static void main(String[] args).
--

## Objeto

Un objeto, o instancia de una clase, es una entidad concreta que tiene valores específicos para esos atributos y puede ejecutar los métodos definidos en la clase.

### Estado de un objeto

El estado de un objeto es el conjunto de valores actuales de sus propiedades (atributos).

Representa cómo es ese objeto en un momento dado y puede cambiar a lo largo del tiempo mediante métodos o interacciones.
