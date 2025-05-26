# Reglas Básicas de Movimiento

## Objetivo

Definir la posición inicial, la visibilidad y las reglas de movimiento para los personajes del juego.

---

## Clase `Personaje`

- **Clase Abstracta:** `Personaje`
- **Subclases:** `Snake`, `Guardia`, `MetalGear`
- **Atributo básico:** `Posicion (x, y)`
- **Método básico:** Los personajes se mueven una celda por turno, solo **vertical** u **horizontal** (nunca en diagonal).

---

## Posición Inicial

- La posición inicial de todos los personajes se genera **aleatoriamente (Random)**.
- Si bien, pudieran ser predefinida, las definimos todas de manera dinámica.
- Se debe implementar un método para verificar que **los enemigos no estén a menos de 2 celdas** de Snake en ningún eje `(x, y)` al iniciar.
- Primero se calcula la posición de Snake, luego la de los elementos como llaves y puertas y, por último la del/los enemigo/s considerando esta restricción.

---

## Visibilidad

- Todos los personajes son **visibles permanentemente** para el jugador.

---

## Reglas de Movimiento

- Los personajes se mueven **una celda por turno**, solo en dirección **vertical** u **horizontal**.
- No está permitido moverse en diagonal.

### Direcciones válidas

El punto `(0,0)` se ubica en la **esquina inferior izquierda del mapa**.

| Dirección    | Método asociado     | Coordenadas nuevas   |
|--------------|---------------------|-----------------------|
| 🔼 Arriba    | `moverArriba()`     | `(x + 1, y)`          |
| 🔽 Abajo     | `moverAbajo()`      | `(x - 1, y)`          |
| ◀️ Izquierda | `moverIzquierda()`  | `(x, y - 1)`          |
| ▶️ Derecha   | `moverDerecha()`    | `(x, y + 1)`          |

---

## Consideraciones

### 1.- Límites del Mapa

- Un personaje **no puede salir del mapa**.
- Ejemplos:
  - Si está en `(0,0)`, solo puede ir **derecha** o **arriba**.
  - Si está en `(0,1)`, puede ir **izquierda**, **derecha** o **arriba**.

### 2.- Celdas Ocupadas

- Si una celda está ocupada por un enemigo (`*`) o está bloqueada, **Snake no puede moverse allí**.
- Snake **puede ingresar** a una celda con un objeto (ej. la llave `L` o el explosivo `C4`) y lo **recoge automáticamente**.

---

## Cantidad de enemigos por partida

- La cantidad de enemigos se determina dinámicamente según el tamaño del mapa:

```java
int cantidadGuardias = (mapa.getFilas() + mapa.getColumnas()) / 4;
```
