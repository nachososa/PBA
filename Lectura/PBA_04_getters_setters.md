# Getters y Setters

Los getters y setters son métodos especiales usados para obtener (get) o modificar (set) el valor de las propiedades de un objeto.

Permiten controlar el acceso a los atributos, protegiendo la integridad de los datos y aplicando reglas si es necesario.

**Getters:** Son métodos que permiten obtener el valor de un atributo privado.
**Setters:** Son métodos que permiten modificar el valor de un atributo privado.

## This

En los setters, se usa **this** para referirnos a los atributos de la clase, ya que el parámetro del setter tiene el mismo nombre que el atributo.

Esto diferencia el atributo de la clase del parámetro recibido.

```java
this.inicio = inicio;
this.fin = fin;
```
