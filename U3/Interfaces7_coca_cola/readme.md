# Coca Cola

## Copia superficial (shallow copy) y Copia profunda (deep copy)

- ***Dos formas de Duplicar un Objeto***

  - ***Copia superficial (shallow copy)***
    - Crea una nueva instancia del objeto.
    - Copia el objeto en sí, pero no copia los objetos a los que referencia.
    - Copia todos los atributos primitivos (int, double, boolean…).
    - Copia referencias a objetos, pero no crea nuevos objetos internos.
    - Si se modifica un atributo compuesto el cambio se verá reflejado en ambas copias.
  
  - ***Copia profunda (deep copy)***
    - Crea una nueva instancia del objeto.
    - Copia el objeto y todo su contenido recursivamente, incluyendo los objetos referenciados.
    - Crea nuevas instancias de todos los objetos referenciados.
    - Usa clone() de forma recursiva.
    - El objeto clonado es totalmente independiente del original.
    - Pueden modificarse por separado sin interferencia.

## Conclusión

Usar shallow copy cuando los objetos internos no van a modificarse o no importa que se compartan.
Usar deep copy cuando se necesita independencia total entre copias, especialmente si el objeto tiene una estructura compleja (composición).

---

## Clases Compuestas

- Una clase compuesta es una clase que contiene como atributos a otros objetos.
- Es decir, una clase “tiene” otra clase como parte de su definición.

## Interfaz Cloneable

Cloneable es una interfaz de marcador en Java (no tiene métodos), que indica que una clase permite que sus objetos se clonen mediante el método clone().

## Método clone()

Este método crea una copia del objeto (una instancia nueva, con los mismos valores en sus atributos).
