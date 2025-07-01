# Ejercicio 2

## Consigna

Escribir un programa que reciba una lista de objetos de clase Figura (con subclases Círculo,Rectángulo,Triángulo) y devuelva la suma de las áreas de todas las figuras.

---

## Ejercicio 2 | Resolución

### PBA_1

## Descripción general

El ejercicio modela un sistema simple de gestión de figuras geométricas usando programación orientada a objetos en Java.

+ El usuario puede:
+ Cargar diferentes tipos de figuras: Círculo, Rectángulo y Triángulo, asignándoles nombre y dimensiones.
+ Visualizar todas las figuras cargadas, junto con su tipo, nombre, dimensiones y área calculada.
+ Interactuar con un menú interactivo por consola.

### El programa aplica

+ Herencia mediante una clase abstracta Figuras.
+ Polimorfismo al sobrescribir el método calcularArea() en cada figura.
+ Encapsulamiento con getters y setters.

## Clases

+ ***Circulo (subclase de Figuras)***
+ Representa un círculo con un atributo radio y una constante Pi.
+ Implementa el cálculo del área: π * radio².
+ Su método toString() muestra tipo, nombre y radio.
+ Demuestra especialización de la clase base.

+ ***Figuras (abstracta)***
+ Es la superclase de todas las figuras geométricas.
+ Define el atributo común nombre.
+ Contiene los métodos:
+ getNombre()
+ setNombre()
+ calcularArea() [abstracto] que obliga a las subclases a implementarlo.

+ ***Main***
+ Controla la interfaz por consola para que el usuario interactúe con el programa.
+ Mantiene un arreglo de hasta 100 figuras (Figuras[] figura).
+ Administra:
+ Carga de figuras (cargarFiguras()).
+ Muestra de figuras (mostrarFiguas()).
+ Menú principal con opciones.
+ Maneja la creación dinámica de objetos según la opción del usuario.
+ Demuestra el uso del polimorfismo al llamar calcularArea() desde la referencia Figuras.

+ Rectangulo (subclase de Figuras)
+ Modela un rectángulo con base y altura.
+ Tiene métodos para acceder y modificar sus dimensiones.
+ Su toString() muestra tipo, nombre, base y altura.

+ Triangulo (subclase de Figuras)
+ Representa un triángulo, con atributos base y altura.
+ Igual que las otras figuras, redefine toString().

### PBA_2

Estructura del ejercicio

+ ***Colecciones***
+ Se usa un ArrayList<Figuras> para almacenar las figuras en el gestor.
+ Esto permite:
+ Agregar figuras sin límite fijo
+ Iterar fácilmente
+ Consultar cantidad de elementos (.size())
+ private ArrayList<Figuras> figuras = new ArrayList<>();

+ Circulo.java
+ Figuras.java
+ Main.java
+ MenuConsola.java
+ GestorFiguras.java
+ FiguraFactory.java
+ Rectangulo.java
+ Triangulo.java

<p align="center">
  <img src="https://www.animatedimages.org/data/media/562/animated-line-image-0184.gif" width="100%" />
</p>

## Run

```bash
# PBA_1
cd U4_Colecciones_2
javac -d bin PBA_1/*.java
java -cp bin PBA_1.Main

cd U4_Colecciones_2
javac -d bin PBA_2/*.java
java -cp bin PBA_2.Main

```
