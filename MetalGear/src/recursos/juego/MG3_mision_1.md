# Misión 1

## Introducción

La Misión se gestiona dentro de la clase `Hangar`. El objetivo de esta misión es que Snake recoja un ítem (la llave) y escape por una puerta sin ser capturado por los enemigos.

---

## Clases

- Mision (abstracta): Gestiona objetivos y desbloqueo de zonas.
- Hangar: Implementa la Misión 1.
- Item (concreta) ya que representa objetos recolectables como la llave o C4.
- Celda: Representa cada espacio del mapa, puede contener un personaje, item o estar vacía.
- Mapa: Matriz de Celdas 7x7 en Misión 1.
- Snake: Jugador, instancia de clase concreta que extiende de Personaje.
- Guardia: Enemigo, instancia concreta, implementa la interfaz Enemigo.

---

## Jugador

- Debe recoger la llave (Item) representada como "L".
- Llegar a la puerta de salida "H" sin ser capturado por enemigos.

## Tablero

- Mapa de tamaño 7x7 (matriz Celda[][]).

- ***Elementos fijos:***
  - Llave (L) → posición aleatoria
  - Puerta (H) → posición aleatoria

- ***Elementos móviles:***
  - Snake (S)
  - Guardias (*)

## Posicionamientos

(1) Snake: Se ubica en una posición aleatoria dentro del mapa.
(2) Guardias:
    (a) Cantidad:
    int cantidadGuardias = (mapa.getFilas() + mapa.getColumnas()) / 4;
    (b) Se colocan aleatoriamente, manteniendo al menos 2 celdas de distancia de Snake.
(3) Llave (L): Posición aleatoria, que no este ocupada.
(4) Puerta de escape (H): Posición aleatoria, no ocupada.

## Turnos

- (1) Snake elige una dirección (WASD).
- (2) Guardias se mueven aleatoriamente.

## Movimientos

- Se permite solo vertical u horizontal (no diagonal).
- El punto (0,0) es la esquina inferior izquierda.
- No se permite salir del tablero.

| Dirección    | Método asociado     | Coordenadas nuevas          |
|--------------|---------------------|-----------------------------|
| 🔼 Arriba    | `moverArriba()`     | `(x, y + 1) Sube eje Y`     |
| 🔽 Abajo     | `moverAbajo()`      | `(x, y - 1) Baja eje Y`     |
| ◀️ Izquierda | `moverIzquierda()`  | `(x - 1, y) X, negativo`    |
| ▶️ Derecha   | `moverDerecha()`    | `(x + 1, y) eje X, positivo`|

***Ejemplo***

```plaintext
Y↑
6  . . . . . . .
5  . . . * . . .
4  . . . . . . .
3  . . . . . . .
2  . S . . * . .
1  . . . . . . .
0  L . . . . H .
└────────────────
X→ 0 1 2 3 4 5 6

L:  (0,0)
H:  (5,0)
G1: (3,5)
S:  (1,2)
```

## Juego

- Snake recoge la llave automáticamente si pisa la celda.
- Abrir la puerta (H) solo si ya tiene la llave.
- Si un guardia queda a 1 celda (horizontal o vertical) de Snake, lo captura.

***Ejemplo***

```plaintext
Y↑
6  . . . . . . .
5  . . . * . . .
4  . . . . . . .
3  . * . . . . .
2  . S . . . . .
1  . . . . . . .
0  L . . . . H .
└────────────────
X→ 0 1 2 3 4 5 6

L:  (0,0)
H:  (5,0)
G1: (3,5)
S:  (1,2)
```

- Resultado: ¡Snake fue capturado!
