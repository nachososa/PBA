# Relaciones entre Clases

- **1. Asociación**
- Una clase se relaciona con otra, pero sin que una pertenezca a la otra.
- Ejemplo: Un Profesor puede estar asociado con una Materia.

- **2. Agregación**
- Una forma especial de asociación: una clase contiene a otra, pero ambas pueden vivir por separado.
- Ejemplo:Una Universidad tiene muchos Estudiantes, pero si la universidad desaparece, los estudiantes pueden seguir existiendo.

- **3. Composición**
- Una forma más fuerte de agregación: una clase es dueña de otra, y si se destruye, la otra también.
- Ejemplo: Una Casa tiene Habitaciones. Si se destruye la casa, las habitaciones también.

- **Multiplicidad (en POO y UML)**
- Especifica cuántas instancias de una clase pueden estar asociadas con una instancia de otra clase en una relación.

**Ejemplo 1:** Un Pasaporte está asociado a una única Persona. Uno a uno (1 — 1)
**Ejemplo 2:** Un Profesor puede dictar muchas Materias. Uno a muchos (1 — 0..*)
**Ejemplo 3:** Un Estudiante puede cursar muchas Materias y cada Materia puede tener muchos Estudiantes Muchos a muchos (0.. — 0..)**
**Ejemplo: 4** Un Empleado puede tener o no un Auto de empresa asignado. Uno a cero o uno (1 — 0..1)
**Ejemplo: 5** Un Triángulo tiene exactamente 3 vértices. 5. Uno a número fijo (1 — 3)
**Ejemplo: 6** Un Equipo debe tener entre 2 y 4 jugadores. 6. Rango específico (1 — 2..4)
