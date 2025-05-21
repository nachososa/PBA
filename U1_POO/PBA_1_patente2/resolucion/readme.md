# Patente validaciones

## Punto 1

Se está validando que el valor del atributo numeroPatente esté dentro del rango permitido: desde 0 hasta 999 inclusive.

```java
if (numeroPatente >= 0 && numeroPatente < 1000)
```

## Punto 2

This, diferencia entre el parámetro del método y el atributo de la clase.

```java
this.numeroPatente = numeroPatente;
```

## Punto 3

Aquí se invoca al método auxiliar validarLongitudPatente, que verifica si la cadena de texto (por ejemplo, "AB") tiene una longitud válida (en este caso, 2 caracteres). Esto centraliza la lógica de validación en un solo método.

```java
if (validarLongitudPatente(letrasPatente))
```

## Punto 4

Se está indicando que debe imprimirse un mensaje de error si la longitud no es válida. El objeto estático System se usa para acceder al método System.out.println(...).

```java
System
```

## Punto 5

Este método devuelve true si la longitud de la cadena recibida como argumento es exactamente 2. Es una forma muy directa y clara de validar este tipo de restricción de longitud.

```java
return unasletrasPatente.length() == 2;
```
