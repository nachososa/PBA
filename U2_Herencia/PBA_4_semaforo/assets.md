# Semáforo

## Enunciado

- Se desea modelar la clase Semáforo para modelar semáforos de tránsito vehicular.
- Cada semáforo tiene los nombres de las calles en la cual esta ubicado: calle1 y calle2 (intersección) y, además, un estado. El siguiente es un diagrama parcial de la jerarquía de clases:

Estado
CambiarEstado() : Estado

Semáforo
String calle1;
String calle2;
Estado estado;

Estados Clases
Habilitado EnAviso NoHabilitado

- ***Clase Estado***
- Es una clase abstracta, la cual tiene definido el método abstracto: cambiarEstado(): Estado, el cual debe ser redefinido en las subclases correspondientes.

- ***Nueva instancia***
- Cuando se crea una instancia de semáforo se inicializa con las dos calles que determinan la intersección donde dicho semáforo esta ubicado, y el estado es Habilitado.

- ***Clase Semáforo***
- En la clase Semáforo se deberá definir el método cambiarEstado():void, que cambia el estado del semáforo. Para este método no podrá utilizar ningún tipo de estructura condicional.

## Resolución

- ***Clase abstracta Estado:***
- Define el método abstracto cambiarEstado() que todas las subclases deben implementar.

- ***Estados concretos:***
- Habilitado: Al cambiar estado, pasa a EnAviso
- EnAviso: Al cambiar estado, pasa a NoHabilitado
- NoHabilitado: Al cambiar estado, vuelve a Habilitado (ciclo completo)

- ***Clase Semáforo:***
- Tiene atributos para las calles y el estado actual
- El constructor inicializa el estado como Habilitado
- El método cambiarEstado() delega la responsabilidad al objeto estado actual, usando polimorfismo para evitar condicionales
