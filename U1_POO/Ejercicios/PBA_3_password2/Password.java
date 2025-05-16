package PBA_3_password2;

public class Password {

    private String texto;

    public Password() {
        this.texto = "";
    }

    public Password(String texto) {
        this.texto = texto;
    }

    public boolean esFuerte() {
        int mayus = 0, minus = 0, numeros = 0;

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

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getLongitud() {
        return texto.length();
    }
}
