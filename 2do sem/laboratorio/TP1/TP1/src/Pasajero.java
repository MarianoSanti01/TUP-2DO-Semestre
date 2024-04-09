package SistReserva;

public class  Pasajero extends Persona {
    private double equipaje;

    private int numAsiento;


    public Pasajero() {
    }

    public Pasajero(String nombre, String apellido, int edad, int dni, double equipaje, int numAsiento) {
        super(nombre, apellido, edad, dni);
        this.equipaje = equipaje;
        this.numAsiento = numAsiento;
    }

    public double getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(double equipaje) {
        this.equipaje = equipaje;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }
}
