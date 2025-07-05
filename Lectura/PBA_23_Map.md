# Map

Es una interfaz del framework de colecciones (java.util) que representa una colección de pares clave-valor, donde cada clave es única y se asocia a un valor.

## Características principales

***Almacena pares clave-valor***
Cada elemento es una asociación entre una clave única y un valor.

***No permite claves duplicadas***
Cada clave solo puede existir una vez. Si se inserta una clave repetida, el valor anterior se reemplaza.

***No es una colección de elementos individuales***
No extiende la interfaz Collection, sino que define su propia estructura para trabajar con entradas (pares).

***Permite acceso rápido al valor mediante la clave***
Se puede obtener, agregar o eliminar valores usando la clave como índice.

***Genérica***
Se puede usar con cualquier tipo de dato para claves y valores, por ejemplo Map<Integer, String>, Map<String, Object>, etc.

## Es una interfaz

- No se puede instanciar directamente.
  - Se usan clases concretas que la implementan:
  - HashMap: sin orden específico, acceso rápido.
  - LinkedHashMap: mantiene orden de inserción.
  - TreeMap: mantiene las claves ordenadas según su orden natural o comparador.

## Métodos básicos

| Método                   | Descripción                                              |
|--------------------------|----------------------------------------------------------|
| `put(K key, V value)`     | Inserta o reemplaza el valor asociado a la clave.        |
| `get(Object key)`         | Obtiene el valor asociado a la clave, o `null` si no existe. |
| `remove(Object key)`      | Elimina la entrada con la clave dada.                     |
| `containsKey(Object key)` | Verifica si existe una entrada con la clave dada.         |
| `containsValue(Object value)` | Verifica si existe una entrada con el valor dado.      |
| `size()`                  | Devuelve la cantidad de pares clave-valor almacenados.    |
| `clear()`                 | Elimina todas las entradas del mapa.                       |
| `keySet()`                | Devuelve un `Set` con todas las claves.                    |
| `values()`                | Devuelve una colección con todos los valores.              |
| `entrySet()`              | Devuelve un `Set` de pares clave-valor (`Map.Entry<K,V>`). |
