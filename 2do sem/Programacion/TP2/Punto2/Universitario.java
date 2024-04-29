package TP2;

public class Universitario extends Libro {
    private String carrera;
        //Constructor

    public Universitario() {
    }

    public Universitario(String titulo, String autor, int anioDePublicacion, boolean prestado, String carrera) {
        super(titulo, autor, anioDePublicacion, prestado);
        this.carrera = carrera;
    }

        //Getter and Setter
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
