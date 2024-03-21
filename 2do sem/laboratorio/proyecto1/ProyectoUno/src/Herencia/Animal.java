package Herencia;

public abstract class Animal {
    protected String Raza;
    protected int edad;
    public Animal(){

    }

    public Animal(String raza, int edad) {
        Raza = raza;
        this.edad = edad;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
