# Metal Gear: Misiones

El juego se divide en **3 misiones secuenciales** con distintos objetivos y desafíos. Las misiones 1 y 2 se desarrollan sobre una grilla, y Snake se mueve una celda por turno, de forma **vertical u horizontal** (nunca en diagonal). La interfaz de la misión 3 cambia a primera personsa, estilo RPG (Role-Playing Game).

---

## Misión 1 – Hangar de Entrada

- **Objetivo:** Buscar la llave `"L"` y escapar por la puerta `"H"`, sin ser detectado por los guardias.
- **Mapa:** Matriz 7x7.
- **Obstáculos:** Guardias (`*`) que patrullan.
- **Reglas especiales:**
  - Si un guardia está a **1 celda** de Snake (vertical u horizontal), Snake es **capturado**.
  - Al comenzar, los enemigos deben estar a **más de 2 celdas** de Snake.

---

## Misión 2 – Almacén de Armas

- **Objetivo:** Recoger el explosivo `C4` y dirigirse a la puerta `"P"` para escapar.
- **Mapa:** Matriz 9x9.
- **Obstáculos:** Guardias (`*`), igual que en Misión 1.
- **Condiciones especiales:**
  - Si Snake está a **1 celda** de un enemigo, es **capturado**.
  - Al llegar a la puerta `"P"`, debe estar a **más de 3 celdas** de cualquier enemigo (el C4 hace ruido).
  - Si no se cumple, Snake puede quedar atrapado.

---

### Diferencias entre Misión 1 y Misión 2

| Diferencia            | Misión 1                         | Misión 2                                                |
|-----------------------|----------------------------------|---------------------------------------------------------|
| Mapa                  | 7x7                              | 9x9                                                     |
| Objeto a recoger      | Llave (`"L"`)                    | Explosivo (`"C4"`)                                      |
| Puerta                | `"H"`                            | `"P"`                                                   |
| Restricción al escapar| Solo llegar a la puerta          | Estar a más de 3 celdas de los enemigos                |
| Riesgo final          | Ninguno adicional                | El ruido del C4 alerta enemigos cercanos               |
| Guardias recomendados | ~3                               | ~4–5                                                    |
| Final                 | Llegar a `"H"`                   | Puede quedar atrapado cerca de `"P"`                   |

---

## Misión 3 – Hangar de Metal Gear (Batalla Final)

Esta misión cambia la mecánica de juego a **combate por turnos estilo RPG**.

### Dinámica general

- **Objetivo:** Derrotar a **Metal Gear REX** bajando su HP (Health Points) a 0.
- **Mapa:** No hay grilla, es una batalla directa.
- **Turnos:** Snake y REX se alternan.
- **Vida inicial:** Ambos comienzan con **100 HP**.

### Sistema de combate

- **Snake puede:**
  - `Disparar misil`: Daño aleatorio entre 10 y 30.
  - `Esquivar`: Reduce el daño enemigo entre 50% y 100%.

- **Metal Gear REX puede:**
  - Atacar con `láser` o `misil`: Daño entre 15 y 40.

- **Victoria:** El primero en reducir al oponente a **0 HP** gana.

---

### Opciones para el jugador

```plaintext
Bienvenido a la batalla final.
Snake y Metal Gear REX tienen 100 HP.
Cada turno, podés:
(1) Disparar misil
(2) Esquivar
```

Objetivo: Reducí al enemigo a 0 HP. ¡Comienza la batalla!

---

**Barra de energía**
Representación visual de la vida (HP) con barras:

```java
public static String barraEnergia(int hp) {
    int barras = hp / 10;
    return "|".repeat(barras) + " ".repeat(10 - barras);
}
```

## Sistema de Progreso

```plaintext
Snake: 80/100 HP  ||||||||
REX:   40/100 HP  ||||
```

- El juego genera un código de guardado que permite retomar la partida más adelante.
- El código registra cuántas misiones fueron completadas.
- El jugador puede guardar y cargar su estado en cualquier momento.
