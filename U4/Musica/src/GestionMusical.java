
public class GestionMusical {

    public static void main(String[] args) {

        // Creación de 5 solistas
        Solista abel = new Solista("Pintos", "Abel", "Argentino", new Bajo(), "Pop", "Sony Music", 1997);
        Solista gloria = new Solista("Estefan", "Gloria", "Cubana", null, "Pop", "EMI", 1973);
        @SuppressWarnings("unused")
        Solista juan = new Solista("Villamil Cortés", "Juan Pablo", "Colombiano", null, "Pop", "Sony Music", 1990);
        @SuppressWarnings("unused")
        Solista simon = new Solista("Vargas Morales", "Simón", "Colombiano", new Guitarra(), "Pop", "Sony Music", 1991);
        @SuppressWarnings("unused")
        Solista martin = new Solista("Vargas Morales", "Martín", "Colombiano", new Teclado(), "Pop", "Sony Music", 1992);

        // Creación de una banda
        Banda morat = new Banda("Morat", "Pop", "Sony Music", 1994);

        // Creación de tres discos
        Disco elamor = new Disco("El amor en mi vida", 2021, abel);
        Disco miTierra = new Disco("Mi Tierra", 1993, gloria);
        Disco vamos = new Disco("A donde vamos?", 2021, morat);

        // Canciones disco "El amor en mi vida"
        elamor.agregarCancion(new Cancion("Piedra Libre", 220));
        elamor.agregarCancion(new Cancion("De Mí, Contigo", 220));
        elamor.agregarCancion(new Cancion("Tiene Tu Amor", 220));
        elamor.agregarCancion(new Cancion("Espejos", 220));
        elamor.agregarCancion(new Cancion("Salto al vacío", 220));
        elamor.agregarCancion(new Cancion("Quiero Cantar", 220));
        elamor.agregarCancion(new Cancion("Cambalache", 220));
        elamor.agregarCancion(new Cancion("El Hechizo", 220));
        elamor.agregarCancion(new Cancion("Vivir sin tí", 220));
        elamor.agregarCancion(new Cancion("El amor en mi vida", 220));

        // Canciones disco "Mi Tierra"
        miTierra.agregarCancion(new Cancion("Ayer", 320));
        miTierra.agregarCancion(new Cancion("Mi buen amor", 120));
        miTierra.agregarCancion(new Cancion("Tus ojos", 300));
        miTierra.agregarCancion(new Cancion("No hay mal que por bien no venga", 220));
        miTierra.agregarCancion(new Cancion("Si señor!", 220));
        miTierra.agregarCancion(new Cancion("Volverás", 220));
        miTierra.agregarCancion(new Cancion("Hablemos el mismo idioma", 220));
        miTierra.agregarCancion(new Cancion("Hablas de mi", 220));
        miTierra.agregarCancion(new Cancion("Traición", 220));
        miTierra.agregarCancion(new Cancion("Montuno", 220));

        // Canciones disco "A donde vamos?"
        vamos.agregarCancion(new Cancion("No termino", 330));
        vamos.agregarCancion(new Cancion("En coma", 420));
        vamos.agregarCancion(new Cancion("La luna enamorada", 400));
        vamos.agregarCancion(new Cancion("Bajo la mesa", 220));

        // Mostrar discos con sus canciones
        System.out.println(elamor);
        System.out.println(miTierra);
        System.out.println(vamos);
    }
}
