package TP2;

public class Libro implements Prestable {
    private String titulo;
    private String autor;
    private int anioDePublicacion;
    private boolean prestado;

    //Cinstructor
    public Libro() {
    }

    public Libro(String titulo, String autor, int añoDePublicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioDePublicacion = añoDePublicacion;
        this.prestado = prestado;
    }

    //GETTER ans SETTER
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoDePublicacion() {
        return anioDePublicacion;
    }

    public void setAñoDePublicacion(int añoDePublicacion) {
        this.anioDePublicacion = añoDePublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

        //Method
    @Override
    public void prestar() {
        if(prestado){
            System.out.println(titulo+" ya está prestado.");
        }else{
            System.out.println(titulo+" ha sido prestado.");
            prestado=true;
        }
    }

    @Override
    public void devolver() {
        if (prestado) { //Si el libro estaba prestado entonces
            prestado = false; //Cambia a false porque lo devolvio, ya no está prestado
            System.out.println("El libro ha sido devuelto");
        } else { // si el libro no estaba prestado... ¿Qué está devolviendo?
            System.out.println("No estaba prestado ese libro.");
        }
    }
}
