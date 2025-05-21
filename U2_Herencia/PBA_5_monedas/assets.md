# Tipos de Cambio

- Se quiere realizar un sistema para representar distintos tipos de cambios.
- Todo tipo de cambio es una Moneda pudiendo ser las mismas Dolar, PesoArgentino, PesoPeruano, Euro, etc.
- Se le pide que defina una jerarquía para poder representar distintos tipos de cambio.
- Cada objeto deberá responder a los siguientes mensajes:

  - ***✓toString() : String***
    - Retorna una cadena con el valor numérico más el tipo de moneda.
    - Por ejemplo : 185 – Pesos Argentinos.
  
  - ***✓suma(Moneda unaMoneda) : Moneda***
    - Retorna la suma del objeto receptor y la moneda argumento.
    - Siempre se retorna una instancia del tipo del objeto receptor.
    - Por ejemplo:
      - Peso Argentino + Euro = Peso Argentino; Euro + Dolar = Euro.
  
  - ***✓asDolar() : Dólar***
  - Retorna una instancia de Dólar con el valor correspondiente según la cotización del dólar para el tipo de moneda del receptor.

- Además defina los constructores que considere convenientes.
- Importante: cada moneda deberá saber su cotización con respecto al Dólar.
  - Por ejemplo: 185 pesos Argentinos equivale a 1 dólar Americano.

## Resolución

- ***Jerarquía de clases***
  - Clase base abstracta Moneda
  - Subclases concretas para cada tipo (Dolar, PesoArgentino, Euro, etc.)

- ***Comportamientos comunes***
  - Todos deben implementar toString(), suma() y asDolar()
  - Cada moneda conoce su cotización respecto al dólar

- ***Reglas de conversión***
  - Las sumas siempre devuelven el tipo del objeto receptor
  - Las conversiones a dólar usan la cotización específica
