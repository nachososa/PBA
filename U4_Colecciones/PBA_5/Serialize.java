package PBA_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialize {

    // private static final String CSV_FILE = "data/alumnos.csv";
    private static final String CSV_FILE = "data/alumnos.csv";
    private static final String CSV_HEADER = "nombre,legajo,nota";

    public void guardarAlumnos(List<Alumno> alumnos) {
        File dataDir = new File("data");
        if (!dataDir.exists()) {
            dataDir.mkdir();
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter(CSV_FILE))) {
            pw.println(CSV_HEADER);
            alumnos.forEach(alumno -> pw.println(
                    "\"" + alumno.getNombre().replace("\"", "\"\"") + "\","
                    + alumno.getLegajo() + ","
                    + alumno.getnotaTP1()
            ));
            System.out.println("✅ Datos guardados en " + CSV_FILE);
        } catch (IOException e) {
            System.err.println("❌ Error al guardar CSV: " + e.getMessage());
        }
    }

    public List<Alumno> cargarAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        File file = new File(CSV_FILE);

        if (!file.exists()) {
            return alumnos;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); // Saltar cabecera
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                if (datos.length == 3) {
                    alumnos.add(new Alumno(
                            datos[0].replace("\"", "").trim(),
                            Integer.parseInt(datos[1].trim()),
                            Float.parseFloat(datos[2].trim())
                    ));
                }
            }
        } catch (IOException e) {
            System.err.println("❌ Error al leer CSV: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("❌ Error en formato de datos: " + e.getMessage());
        }
        return alumnos;
    }
}
