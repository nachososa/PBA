package utils;

import java.io.*;
import java.util.Random;

public class Guardado {

    private static final String NOMBRE_ARCHIVO = "src/saves/guardado.mg";

    public static void guardarEstado(int misionesCompletadas) {
        String idUnico = generarCodigoUnico();

        try {
            File carpeta = new File("src/saves");
            if (!carpeta.exists()) {
                carpeta.mkdirs();
            }

            try (FileWriter writer = new FileWriter(NOMBRE_ARCHIVO)) {
                writer.write(idUnico + "\n");
                writer.write(misionesCompletadas + "\n");
                System.out.println("Estado guardado correctamente.");
                System.out.println("Codigo de partida: " + idUnico);
            }

        } catch (IOException e) {
            System.out.println("Error al guardar el estado: " + e.getMessage());
        }
    }

    public static int cargarEstadoPorCodigo(String codigoIngresado) {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("No se encontro el archivo de guardado.");
            return -1;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String codigoGuardado = reader.readLine();
            String progresoStr = reader.readLine();

            if (codigoGuardado != null && codigoGuardado.equals(codigoIngresado)) {
                int misionesCompletadas = Integer.parseInt(progresoStr);
                System.out.println("Partida cargada correctamente.");
                return misionesCompletadas;
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer el archivo de guardado.");
        }

        System.out.println("Codigo invalido o partida no encontrada.");
        return -1;
    }

    public static void mostrarCodigoGuardado() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("No hay partida guardada.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea = reader.readLine();
            if (linea != null && !linea.isBlank()) {
                System.out.println("Ultimo codigo guardado: " + linea);
                return;
            }
            System.out.println("No se encontro un codigo valido en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer el estado guardado.");
        }
    }

    private static String generarCodigoUnico() {
        Random random = new Random();
        int numeros = 100 + random.nextInt(900);
        char letra1 = (char) ('A' + random.nextInt(26));
        char letra2 = (char) ('A' + random.nextInt(26));
        char letra3 = (char) ('A' + random.nextInt(26));
        return numeros + "" + letra1 + letra2 + letra3;
    }
}
