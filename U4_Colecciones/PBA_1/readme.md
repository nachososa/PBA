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

Etapa 1

+ Clase Alumno
+ Atributos: nombre (String) legajo (int) notaTP1 (float)
+ Constructor
+ Métodos get y set para los atributos
+ Método auxiliar imprimirAlumno() que imprime la información del alumno con salto de línea
+ Implementación en Main
