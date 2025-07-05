
public class Password {

    private int longitud;
    private String texto;

    // Constructor por defecto
    public Password() {
        this.longitud = 8;
        this.texto = "";
    }

    // Constructor con texto de contraseña
    public Password(String texto) {
        this.texto = texto;
        this.longitud = texto.length();
    }

    // Getter para longitud
    public int getLongitud() {
        return longitud;
    }

    // Getter para texto
    public String getTexto() {
        return texto;
    }

    // Setter para texto
    public void setTexto(String texto) {
        this.texto = texto;
        this.longitud = texto.length();
    }

    // Método que verifica si la contraseña es fuerte
    public boolean esFuerte() {
        int mayus = 0;
        int minus = 0;
        int numeros = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isUpperCase(c)) {
                mayus++;
            } else if (Character.isLowerCase(c)) {
                minus++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        return mayus > 2 && minus > 1 && numeros > 5;
    }
}
