package PBA_2;

import java.util.ArrayList;

public class GestionFiguras {

    private final ArrayList<Figuras> figuras;

    public GestionFiguras() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(Figuras figura) {
        figuras.add(figura);
    }

    public ArrayList<Figuras> getFiguras() {
        return figuras;
    }

    public int getCantidad() {
        return figuras.size();
    }

    public double calcularSumaAreas() {
        double suma = 0;
        for (Figuras f : figuras) {
            suma += f.calcularArea();
        }
        return suma;
    }
}
