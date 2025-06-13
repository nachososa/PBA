package PBA_4_interfaces1;

/*
Síntesis conceptual del ejercicio

Objetivo del ejercicio
Implementar una estructura orientada a objetos, donde las clases Personaje y ManejadorPaginas compartan comportamientos comunes definidos por una interfaz (IMovible). 

Interfaz IMovible
Define un conjunto de métodos comunes moverAdelante(), moverAtras() y reiniciar()) por lo que cada Clase que la implemente deba proporcionar su propia versión de estos comportamientos.

Clase Personaje
Representa un personaje que se mueve en una grilla, mediante coordenadas de fila y columna. Implementa los métodos de movimiento con lógica específica a su contexto.

Clase ManejadorPaginas
Simula el paso de páginas en un libro o documento. Implementa los mismos métodos de IMovible pero adaptados a un contexto completamente diferente.

Polimorfismo
Se demuestra cómo una misma Interfaz puede ser aplicada a situaciones conceptualmente distintas.

Clase Main
Contiene el método main() que crea instancias de Personaje y ManejadorPaginas, y las pasa a un método genérico simularMovimientos(IMovible)

Este método utiliza polimorfismo: al recibir un objeto IMovible, puede operar con cualquier clase que implemente esa interfaz, sin importar su tipo específico.

Resultado
El programa muestra cómo distintos objetos, Personaje y ManejadorPaginas se comportan de forma diferente ante las mismas instrucciones de movimiento, destacando la flexibilidad del diseño al utilizar interfaces.
 */
