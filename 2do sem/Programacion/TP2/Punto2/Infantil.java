package TP2;

public class Infantil extends Libro{
    private int edadRecomendada;
        //Constructor
    public Infantil(){
    }

    public Infantil(String titulo, String autor, int añoDePublicacion, boolean prestado, int edadRecomendada) {
        super(titulo, autor, añoDePublicacion, prestado);
        this.edadRecomendada = edadRecomendada;
    }

        //Getter ans Setter
    public int getEdadRecomendada() {
        return edadRecomendada;
    }
    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

}
