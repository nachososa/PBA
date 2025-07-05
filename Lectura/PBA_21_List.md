# List

Es una interfaz que forma parte del framework de colecciones (java.util) y representa una colección ordenada de elementos en la que pueden existir elementos duplicados.

## Características principales

***Mantiene el orden de inserción***
los elementos se almacenan en el orden en el que se los agrega.

***Permite duplicados***
Se puede agregar el mismo valor varias veces.

***Permite acceso por índice***
Se puede acceder, modificar o eliminar elementos por su posición (get(int index), set(), remove()).

***Genérica***
Se puede usar con cualquier tipo de dato, usando tipos genéricos (List<Integer>, List<String>, etc).

## Es una interfaz

***No se puede instanciar directamente.***

- Se necesita usar una clase concreta que la implemente, como:
  - ArrayList: basada en un array dinámico (rápida para acceder por índice).
  - LinkedList: basada en nodos enlazados (mejor para inserciones/eliminaciones frecuentes en el medio).
  - Vector: como ArrayList, pero sincronizado (raro de usar hoy).

## Métodos básicos

| Método                | Descripción                              |
|------------------------|------------------------------------------|
| `add(E e)`             | Agrega un elemento al final de la lista. |
| `get(int index)`       | Obtiene el elemento en la posición dada. |
| `set(int index, E e)`  | Reemplaza el elemento en la posición dada por otro. |
| `remove(int index)`    | Elimina el elemento en la posición dada. |
| `size()`               | Devuelve la cantidad de elementos en la lista. |
| `contains(Object o)`   | Verifica si la lista contiene el elemento dado. |
| `clear()`              | Elimina todos los elementos de la lista. |
| `isEmpty()`            | Retorna `true` si la lista está vacía. |
