# Clases Wrapper en Java

- Las **clases wrapper** (envoltorio) permiten tratar a los **tipos primitivos como objetos**.
- Son útiles cuando se necesita usar objetos en lugar de tipos primitivos, por ejemplo, en estructuras como colecciones (`ArrayList`, `HashMap`, etc.).

---

## Tipos primitivos y sus Wrappers

| Tipo primitivo | Clase Wrapper  |
|----------------|----------------|
| `byte`         | `Byte`         |
| `short`        | `Short`        |
| `int`          | `Integer`      |
| `long`         | `Long`         |
| `float`        | `Float`        |
| `double`       | `Double`       |
| `char`         | `Character`    |
| `boolean`      | `Boolean`      |

---

## ¿Para qué se usan?

- Usar tipos primitivos donde se requieren **objetos** (colecciones, genéricos).
- Convertir entre **strings y números booleanos**, etc.
- Acceder a **métodos utilitarios** para manipular valores (por ejemplo, `compare`, `isNaN`, `toString`, etc.).

---

## Autoboxing y Unboxing

- **Autoboxing**: conversión automática de tipo primitivo a wrapper.

  ```java
  Integer num = 5; // int → Integer
  ```

- **Unboxing:** conversión automática de wrapper a tipo primitivo.

    ```java
    int x = num; // Integer → int
    ```

## Métodos útiles

```java
Integer.parseInt("123");     // String → int
Double.valueOf("3.14");      // String → Double
Boolean.TRUE.equals(false);  // Comparación segura
String s = Integer.toString(42); // int → String
```
