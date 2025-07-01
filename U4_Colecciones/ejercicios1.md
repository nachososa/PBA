# Ejercicio 1

Escribir las clases que implementen el siguiente modelo de datos, utilizando Colecciones.

Clase: Curso

***Métodos:***

+ matricularAlumno(Alumno a)
+ desmatricularAlumno(Alumno a)
+ consultarAlumno(int legajo)
+ listarAprobados()
+ listadoAlfabetico()

Clase: Alumno

***Atributos:***

nombre: String
legajo: int
notaTP1: float

Luego, escribir un programa que

(a) Cree el curso PBA
(b) Matricule alumnos
(c) Invoque a los métodos de consulta implementados en la clase Curso.
(d) Armar un menú de opciones para el diseño de la interfaz de usuario.

---

## Resolución

PBA_1

+ Clase Alumno
Atributos: nombre (String) legajo (int) notaTP1 (float)
Constructor
Métodos get y set para los atributos
Método auxiliar imprimirAlumno() que imprime la información del alumno con salto de línea
Implementación en Main

PBA_2

+ Clase Menu
Creación de la clase Menu para que el usuario pueda Matricular y Listar Alumnos desde la consola.

```java
// ArrayList
private final ArrayList<Alumno> alumnos;
```

PBA_3

+ Serializacion de Alumnos a CSV en Java
La serialización permoye persistir los datos de los alumnos en un archivo CSV.

## Run

```bash

# PBA_1
cd U4_Colecciones
javac -d bin PBA_1/*.java
java -cp bin PBA_1.Main

# PBA_2
cd U4_Colecciones
javac -d bin PBA_2/*.java
java -cp bin PBA_2.Main

# PBA_3
cd U4_Colecciones
javac -d bin PBA_3/*.java
java -cp bin PBA_3.Main

# alumnos.csv
cd U4_Colecciones && cat data/alumnos.csv
cd U4_Colecciones && rm -v data/alumnos.csv

```
