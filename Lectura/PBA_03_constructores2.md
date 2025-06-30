# Tipos de Constructores

## Constructor por Defecto, "vacío"

El constructor por defecto es un constructor sin parámetros que se utiliza para inicializar los atributos de un objeto con valores predeterminados.

En tu caso, el constructor por defecto de la clase Patente_3 inicializa los atributos a valores vacíos o cero:

```java
public FOO() {
    miVar1 = "";
    miVar2 = 0;
    miVar3 = "";
}
```

## Constructores con parámetros

El constructor con parámetros permite inicializar un objeto con valores específicos al momento de su creación. Esto brinda mayor flexibilidad, ya que se pueden asignar directamente los valores deseados a los atributos del objeto.

```java
public FOO (String inicio, int numero, String fin) {

    miVar1 = inicio;
    miVar2 = numero;
    miVar3 = fin;
}
```

Con este constructor, se puede crear un objeto así:

```java
FOO miObjeto = new FOO("AB", 123, "CD");
```
