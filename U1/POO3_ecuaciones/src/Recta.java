
public class Recta {

    private final Punto p1;
    private final Punto p2;

    public Recta(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Recta() {
        // y = x pasa por (0,0) y (1,1)
        this.p1 = new Punto(0, 0);
        this.p2 = new Punto(1, 1);
    }

    public float pendiente() {
        float dx = p2.getX() - p1.getX();
        float dy = p2.getY() - p1.getY();
        if (dx == 0) {
            throw new ArithmeticException("Pendiente indefinida (recta vertical)");
        }
        return dy / dx;
    }

    public boolean paralelas(Recta otraRecta) {
        try {
            return this.pendiente() == otraRecta.pendiente();
        } catch (ArithmeticException e1) {
            try {
                otraRecta.pendiente(); // solo para ver si lanza error también
                return false;
            } catch (ArithmeticException e2) {
                return true; // ambas son verticales
            }
        }
    }
}
