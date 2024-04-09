package Clases;

public abstract class Persona {
    private int age;
    private String name;
    private double pennisLong;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPennisLong() {
        return pennisLong;
    }

    public void setPennisLong(double pennisLong) {
        this.pennisLong = pennisLong;
    }

    public Persona() {
    }

    public Persona(int age, String name, double pennisLong) {
        this.age = age;
        this.name = name;
        this.pennisLong = pennisLong;
    }

    public void comer(){
        System.out.println("Comiendo");
    }

}
