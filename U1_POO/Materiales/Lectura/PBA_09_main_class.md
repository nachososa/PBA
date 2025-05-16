# Tipos de Clases

- ☕ Java Class
  - Es cualquier clase en Java.
  - Puede tener propiedades, métodos, constructores, etc.
  - No necesita tener un método main().
  - Sirve para representar entidades, lógica de negocio, estructuras de datos, etc.

- 🏁 Java Main Class
  - Es el punto de entrada del programa. Java empieza la ejecución desde ese método.
  - Es una clase especial que contiene el método public static void main(String[] args).

## Proyecto real

En un proyecto grande (por ejemplo, una app web, de escritorio o backend), es común tener:

- Una sola clase **main “principal”** que inicia la aplicación completa y
- Varias otras clases con main para pruebas o utilidades, pero que no se usan en producción.
- En producción suele usarse solo uno (ej: public static void main(String[] args) en App.java).

```bash
src/
├── App.java               // main oficial
├── pruebas/
│   └── TestValidaciones.java  // main de pruebas
└── utils/
    └── GeneradorDatos.java    // main auxiliar
```
