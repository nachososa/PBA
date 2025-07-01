# Modificadores de Acceso

- 🔓 Public
  - Propiedades y métodos accesibles desde cualquier parte del programa, tanto desde dentro como fuera de la clase, sin restricciones de paquete o herencia.

- 🔒 Private
  - Propiedades y métodos accesibles sólo desde dentro de la misma clase.
  - No pueden ser accedidos ni por clases del mismo paquete, ni por subclases.

- 🔐 Protected
  - El atributo o método es accesible desde:
  - La misma clase
  - Cualquier clase del mismo paquete (herede o no)
  - Cualquier subclase, aunque esté en otro paquete
  - No es accesible desde clases que no estén en el mismo paquete y no sean subclases

| Modificador  | Misma clase | Mismo paquete | Subclases (otro paquete) | Otras clases |
|--------------|-------------|----------------|---------------------------|---------------|
| `public`     | ✔️          | ✔️             | ✔️                        | ✔️            |
| `protected`  | ✔️          | ✔️             | ✔️                        | ❌            |
| *(default)*  | ✔️          | ✔️             | ❌                        | ❌            |
| `private`    | ✔️          | ❌             | ❌                        | ❌            |

***Nota***
Con protected, el acceso es posible desde cualquier subclase (herencia) y también desde cualquier clase del mismo paquete, aunque no haya herencia.

- ***Protected en la clase abstracta***
- Las clases abstractas están pensadas para ser extendidas, no usadas directamente. Usar protected permite que las subclases accedan directamente a los atributos heredados. Esto facilita la implementación en las subclases sin necesidad de usar getters/setters. Las subclases pueden acceder sin restricciones molestas al atributo nombre. Desventaja: se expone más de lo ideal. Si hay muchas subclases o si se trabaja en un equipo grande, puede ser más difícil mantener la encapsulación.

- ***Private en las clases concretas***
- En las clases concretas, se aplica una mayor encapsulación, ocultando los atributos internos incluso de otras clases del mismo paquete. Se accede a ellos exclusivamente mediante métodos públicos (getters/setters). Se protege la integridad de los datos. Nadie puede modificar directamente los atributos desde afuera.
