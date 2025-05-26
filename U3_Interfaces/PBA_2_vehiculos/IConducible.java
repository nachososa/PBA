package PBA_2_vehiculos;

public interface IConducible {

    void arrancar();

    void conducir(int distancia);

    void detener();
}

/*
Resultado Esperado

Arrancando el auto...
Conduciendo el auto por 20 kilómetros.
Deteniendo el auto.

Arrancando la moto...
Conduciendo la moto por 15 kilómetros.
Deteniendo la moto.
 */
