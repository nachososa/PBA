# Set

Es una interfaz del framework de colecciones (java.util) que representa una colección de elementos únicos sin un orden garantizado (salvo en algunas implementaciones).

## Características principales

***No permite elementos duplicados***
Cada elemento solo puede estar una vez en la colección. Si intentás agregar un duplicado, simplemente no se añade.

***No garantiza orden (en general)***

- El orden de los elementos depende de la implementación:
  - ***HashSet:*** sin orden específico.
  - ***LinkedHashSet:*** mantiene el orden de inserción.
  - ***TreeSet:*** mantiene los elementos ordenados según su valor o comparador.

***No permite acceso por índice***
No se puede obtener un elemento por posición numérica (no hay métodos como get(int index)).

***Genérica***
Puede contener cualquier tipo de dato usando tipos genéricos, por ejemplo Set<Integer>, Set<String>, etc.

## Es una interfaz

***No se puede instanciar directamente.***

- Se usan clases concretas que la implementan:
  - HashSet: rápida para inserciones y búsquedas, sin orden.
  - LinkedHashSet: mantiene orden de inserción.
  - TreeSet: mantiene orden natural o definido por comparador.

## Métodos básicos

| Método                      | Descripción                                                      |
|-----------------------------|-----------------------------------------------------------------|
| `add(E e)`                  | Agrega un elemento si no existe ya en el set.                   |
| `remove(Object o)`          | Elimina el elemento dado si está presente.                      |
| `contains(Object o)`        | Verifica si el set contiene el elemento.                        |
| `size()`                    | Devuelve la cantidad de elementos únicos.                       |
| `clear()`                   | Elimina todos los elementos del set.                            |
| `isEmpty()`                 | Retorna `true` si el set está vacío.                            |
| `retainAll(Collection c)`   | Conserva solo los elementos que están en esta colección y en la dada (intersección). |
| `addAll(Collection c)`      | Agrega todos los elementos de la colección dada (unión).       |
