package TP2;

public class Novela extends Libro{
    private String genero;

        //Constructor
    public Novela(){
    }

    public Novela(String titulo, String autor, int anioDePublicacion, boolean prestado, String genero) {
        super(titulo, autor, anioDePublicacion, prestado);
        this.genero = genero;
    }

        //Getter and setter
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
