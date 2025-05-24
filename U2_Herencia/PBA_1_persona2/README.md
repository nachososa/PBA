# 📘 Listado de Temas: POO y Herencia (Básico)

## 🔹 Fundamentos de POO

- **Clase**: Es una plantilla o modelo que define cómo serán los objetos (atributos + métodos).
- **Objeto**: Es una instancia concreta de una clase, creada mediante la palabra clave `new`.
- **Modificadores de Acceso**: Palabras clave que definen el nivel de visibilidad de clases, atributos y métodos (`public`, `private`, `protected`).
- **Atributos**: Variables que definen el estado de un objeto. Se recomienda **encapsularlos** (declararlos `private`).
- **Constructores**: Métodos especiales que se ejecutan al crear un objeto. Se utilizan para **inicializar atributos**.
- **Getters y Setters**: Métodos públicos que permiten **acceder y modificar atributos privados** de forma controlada.
- **Métodos Auxiliares**: Métodos adicionales que definen el **comportamiento o funcionalidades** del objeto.
- **Clase Principal (`main`)**: Contiene el método `main(String[] args)` que es el **punto de entrada** del programa.

---

## 🧬 Herencia y Abstracción

- **Herencia**: Mecanismo que permite crear nuevas clases a partir de otras ya existentes, reutilizando y extendiendo su funcionalidad.
- **Clase Abstracta**: Clase que no se puede instanciar. Sirve como base para otras clases. Puede tener:
  - **Métodos abstractos** (sin cuerpo, obligan a implementar).
  - **Métodos concretos** (con cuerpo, ya implementados).
- **Clase Concreta**: Clase que **extiende** de una clase abstracta y **debe implementar** sus métodos abstractos.
- **Métodos Abstractos**: Se declaran en la clase abstracta **sin implementación**. Las subclases deben **sobrescribirlos** usando `@Override`.
- **Palabra clave `super`**:
  - Se usa para **invocar al constructor o métodos** de la clase padre.
  - Permite reutilizar comportamiento del padre en la subclase.

---

## 🧱 Base de Java

- **Clase `Object`**: Es la **superclase base de todas las clases en Java**. Todas las clases heredan implícitamente de `Object` y pueden sobrescribir sus métodos, como `toString()`, `equals()`, `hashCode()`, etc.
