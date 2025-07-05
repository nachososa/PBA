
public class Main {

    public static void main(String[] args) {
        // Crear un semáforo en la intersección de "Av. Corrientes" y "Florida"
        Semaforo semaforo = new Semaforo("Av. Corrientes", "Florida");

        // Mostrar estado inicial
        System.out.println("Estado inicial: " + semaforo.getEstadoActual());

        // Cambiar estado varias veces
        for (int i = 0; i < 5; i++) {
            semaforo.cambiarEstado();
            System.out.println("Estado después de cambio " + (i + 1) + ": " + semaforo.getEstadoActual());
        }
    }
}
