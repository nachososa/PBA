# Ejercicio 1

Escribir las clases que implementen el siguiente modelo de datos, utilizando Colecciones.

## Clase: Curso

+ Métodos:
+ matricularAlumno(Alumno a)
+ desmatricularAlumno(Alumno a)
+ consultarAlumno(int legajo)
+ listarAprobados()
+ listadoAlfabetico()

## Clase: Alumno

+ Atributos:
+ nombre: String
+ legajo: int
+ notaTP1: float

## Consigna

+ Escribir un programa que:
+ (a) Cree el curso PBA
+ (b) Matricule alumnos
+ (c) Invoque a los métodos de consulta implementados en la clase Curso.
+ (d) Armar un menú de opciones para el diseño de la interfaz de usuario.

---

## Ejercicio 1 | Resolución

### Etapa_1

#### Clase Alumno

+ Se crea la Clase Alumno con:
  + Atributos: nombre (String) legajo (int) notaTP1 (float)
  + Constructor
  + Métodos get y set para los atributos
  + Método auxiliar imprimirAlumno() que imprime la información del alumno con salto de línea
  + Implementación en Main

### Etapa_2

#### Clase Menu

Creación de la clase Menu para que el usuario pueda Matricular y Listar Alumnos desde la consola.

```java
// ArrayList
private final ArrayList<Alumno> alumnos;
```

### Etapa_3

#### Serializacion de Alumnos a CSV en Java

+ La serialización permite persistir los datos de los alumnos en un archivo CSV.
+ No se pide en el enunciado pero se implementa con fines prácticos.
+ Simularía una db: data/alumnos.csv

### Etapa_4

#### Clase Curso: matricularAlumno

+ Se crea la clase Curso en un archivo nuevo
+ Se trasladan a ella los metodos agregarAlumno() y mostrarAlumnos()
+ Se cambia el nombre agregarAlumno() por matricularAlumno
+ Los alumnos se agregan en la db data/alumnos.csv

### Etapa_5

#### Clase Search

Se agrega la Clase Search, en un documento nuevo, para buscar Alumnos por Nombre o Legajo.

#### Clase Curso

Se agrega la funcionalidad desmatricularAlumno que consite en la capacidad de eliminar Alumnos de la db data/alumnos.csv

+ Métodos
  + matricularAlumno(),
  + desmatricularAlumno(), se agrega la funcionalidad
  + mostrarAlumnos(), devuelve todos los matriculados en orden alfabetico
  + mostrarAprobados(), devuelve a los aprobados, esto es, a todos los que tienen nota >= 7
  + consultarAlumno(),

<p align="center">
  <img src="https://www.animatedimages.org/data/media/562/animated-line-image-0184.gif" width="100%" />
</p>
