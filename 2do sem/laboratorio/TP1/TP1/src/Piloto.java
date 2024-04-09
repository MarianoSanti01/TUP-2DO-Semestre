package SistReserva;

public class Piloto extends Persona {

    private String carnetPiloto;

    public Piloto() {
        super(); // Call to the constructor of the superclass (Persona)
    }

    public Piloto(String nombre, String apellido, int edad, int dni, String carnetPiloto) {
        super(nombre, apellido, edad, dni); // Call to the constructor of the superclass (Persona) to set common attributes
        this.carnetPiloto = carnetPiloto;
    }

    public String getCarnetPiloto() {
        return carnetPiloto;
    }

    public void setCarnetPiloto(String carnetPiloto) {
        this.carnetPiloto = carnetPiloto;
    }
}
