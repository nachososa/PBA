# Almacenamiento de datos

Los tamaños lógico y físico son dos conceptos distintos que a menudo se confunden.

## Tamaño lógico

- Es el tamaño "visible" o útil de los datos desde el punto de vista del usuario o del software.
- Representa cuánto ocupan los datos realmente (por ejemplo, un archivo de texto de 2 KB).
- Es lo que se ve en el explorador de archivos o al consultar el tamaño de una base de datos.
- No incluye espacio desperdiciado, estructura física ni sobrecargas del sistema de archivos.

Ejemplo:
Un archivo .txt que contiene solo una palabra. Lógicamente puede pesar 10 bytes.

## Tamaño físico

- Es el espacio que realmente ocupa un archivo o conjunto de datos en el disco o dispositivo de almacenamiento.
- Depende del sistema de archivos (como FAT32, NTFS, ext4, etc.).
- Se almacena en bloques o sectores (por ejemplo, bloques de 4 KB).
- Aunque el archivo pese 10 bytes lógicos, si el bloque mínimo es de 4 KB, usará 4 KB físicos.

Ejemplo:
Ese mismo archivo de 10 bytes puede ocupar 4.096 bytes (4 KB) físicamente si ese es el tamaño mínimo de bloque.

## Conjunto de elementos

🔹 Tamaño lógico

- Es la cantidad real de elementos almacenados en una estructura de datos.
- Se refiere a cuántos elementos hay actualmente en la colección.
- Es lo que tú (programador) usas o manipulas.

Por ejemplo: un array de 10 posiciones donde solo has puesto 3 elementos → tamaño lógico = 3.

🔹 Tamaño físico

- Es la capacidad total reservada en memoria para esa colección.
- Representa el espacio total disponible para almacenar elementos, aunque estén vacíos.
- Suele ser mayor o igual al tamaño lógico, para evitar realocar memoria constantemente.

En el mismo ejemplo anterior: si el array fue creado con capacidad para 10 elementos → tamaño físico = 10.
