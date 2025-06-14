package PBA_5_depredador;

/*
Depredador vs Presa: síntesis conceptual
El objetivo del ejercicio es simular un entorno de interacción entre animales depredadores y presas, se modelan comportamientos típicos de ambos roles (como cazar, huir, observar, perseguir).
Se busca ejercitar cómo diferentes clases pueden heredar comportamientos y cumplir "Contratos predefinidos" por interfaces.

IDepredador
- Define el comportamiento esperado de un animal que actúa como depredador.

IPresa
- Define el comportamiento de un animal que actúa como presa.

Clases base (superclases)
- Mamifero, Felino y Anfibio: Son clases que representan tipos de animales. Funcionan como base para ser heredadas y, si bien, sirven paa clasificar tipos de animalesción, no contienen comportamiento de depredación o huida.

Clases concretas

Leon
 - Implementa IDepredador
 - Hereda de Felino

Oveja
 - Implementa IPresa.
 - Hereda de Mamifero.

Rana
Es el único animal que cumple ambos roles, puede cazar y también huir lo que ejemplifica el polimorfismo.
- Implementa tanto IDepredador como IPresa.
- Hereda de Anfibio.

Clase principal: Depredador_Presa
- Contiene el método main () que instancia objetos de Leon, Rana y Oveja.

Conceptos aplicados
- Herencia: Las clases Leon, Oveja y Rana heredan de clases base (como Felino, Mamifero, Anfibio).
- Interfaces: Se implementan IDepredador e IPresa que definen comportamientos comunes de diferentes clases.
- Polimorfismo: Rana actúa como depredador y como presa. Permite reutilizar interfaces en distintos contextos.
- Encapsulamiento y responsabilidad única: Cada clase cumple con una función específica y bien definida.

 */
