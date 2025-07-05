
public class CocaCola implements Cloneable {

    private String tipo;
    private double volumenMl;
    private Ingrediente esenciaSecreta;

    public CocaCola(String tipo, double volumenMl, Ingrediente esenciaSecreta) {
        this.tipo = tipo;
        this.volumenMl = volumenMl;
        this.esenciaSecreta = esenciaSecreta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVolumenMl() {
        return volumenMl;
    }

    public void setVolumenMl(double volumenMl) {
        this.volumenMl = volumenMl;
    }

    public Ingrediente getEsenciaSecreta() {
        return esenciaSecreta;
    }

    public void setEsenciaSecreta(Ingrediente esenciaSecreta) {
        this.esenciaSecreta = esenciaSecreta;
    }

    @Override
    public String toString() {
        return "CocaCola{" + "tipo=" + tipo + ", volumenMl=" + volumenMl + ", esenciaSecreta=" + esenciaSecreta + '}';
    }

    public CocaCola copiaSuperficial() throws CloneNotSupportedException {
        return (CocaCola) super.clone();
    }

    public CocaCola copiaProfunda() throws CloneNotSupportedException {
        CocaCola clonada = (CocaCola) super.clone();
        clonada.esenciaSecreta = (Ingrediente) esenciaSecreta.clone();
        return clonada;
    }
}
