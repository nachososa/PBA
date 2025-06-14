package PBA_5_depredador;

// Clases base (superclases): Mamifero, Felino y Anfibio.
// Es una clase pública y concreta, se puede instanciar directamente
public class Mamifero {

    public String tipo() {
        return "Mamífero";
    }
}
// Método público, se puede invocar desde otras clases
// Devuelve un String que representa el tipo de animal
// Siempre devuelve la palabra "Anfibio"
// Es útil para preguntar a un objeto qué tipo es?
