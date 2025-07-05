
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        CocaCola original = new CocaCola("Original: ", 300, new Ingrediente("esencia clasica", 100));
        System.out.println("Coca original" + original);

        CocaCola clon = original.copiaProfunda();
        System.out.println("Coca clonada: " + clon);

        clon.setTipo("modificada");
        clon.getEsenciaSecreta().setNombre("esencia ligera");
        clon.getEsenciaSecreta().setCantidadMl(50);

        System.out.println("Luego de modificar esencia");
        System.out.println("Coca original" + original);
        System.out.println("Coca clonada: " + clon);

    }

}
