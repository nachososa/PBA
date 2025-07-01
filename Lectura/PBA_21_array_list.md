# ArrayList

ArrayList es una clase en Java que implementa la interfaz List y forma parte del Java Collections Framework.

- Es una estructura de datos dinámica que:
- Almacena elementos en un array redimensionable (crece automáticamente cuando se llena).
- Mantiene el orden de inserción (los elementos se guardan en el orden en que se agregan).
- Permite elementos duplicados.
- Permite acceso rápido por índice (similar a un arreglo normal, pero con tamaño flexible).

## Características

Característica Descripción
***Tamaño dinámico:*** Aumenta o reduce su capacidad según se agregan o eliminan elementos.
***Acceso rápido por índice:*** Obtener un elemento por su posición (get(index)) es muy eficiente (tiempo constante O(1)).
***Inserción/Eliminación costosa:*** Si se agrega o elimina un elemento en medio del ArrayList, los elementos posteriores deben desplazarse (O(n)).
***No es sincronizado:*** No es seguro para hilos (thread-safe). Si se necesita concurrencia, se puede usar Collections.synchronizedList().
***Permite null y duplicados:*** Puede almacenar valores null y elementos repetidos.

## Declaración

```java
// Importar la clase
import java.util.ArrayList; 

// Sintaxis básica
ArrayList<TipoDato> nombreLista = new ArrayList<>();

// Ejemplo con la clase Alumno (del ejercicio)
ArrayList<Alumno> listaAlumnos = new ArrayList<>();
Métodos Más Usados
```

Permite:

1. Agregar elementos
2. Obtener elementos
3. Eliminar elementos
4. Verificar existencia y tamaño
5. Recorrer un ArrayList

***Ventajas***
Acceso rápido por índice (get(index) es O(1)).
Óptimo para búsquedas si se conoce la posición.
Más fácil de usar que arrays tradicionales (no hay que manejar tamaño fijo).

***Desventajas***
Inserción/eliminación lentas en posiciones intermedias (requiere desplazar elementos).
Mayor consumo de memoria que un array normal (por el crecimiento dinámico).
Ejemplo Práctico con la Clase Alumno

***Usar ArrayList cuando:***
✔ Listas donde el acceso por índice es frecuente (ej: catálogos, registros ordenados).
✔ Cuando no hay muchas inserciones/eliminaciones en medio de la lista.
✔ Reemplazo de arrays tradicionales cuando se necesita flexibilidad en el tamaño.

***No usar ArrayList cuando:***
✔ Hay muchas inserciones/eliminaciones en medio (mejor usar LinkedList).
✔ Se necesitan elementos únicos (mejor usar HashSet).

Conclusión
ArrayList es la estructura de datos más usada en Java por su simplicidad y eficiencia en acceso aleatorio.
