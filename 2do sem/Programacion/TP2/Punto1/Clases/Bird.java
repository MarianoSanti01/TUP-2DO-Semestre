package Clases;

public class Bird extends Animal{
    private String specie;
    private boolean talks;

    public Bird(String specie, boolean talks) {
        this.specie = specie;
        this.talks = talks;
    }

    public Bird(String name, int age, String animalType, double price, String specie, boolean talks) {
        super(name, age, animalType, price);
        this.specie = specie;
        this.talks = talks;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public boolean isTalks() {
        return talks;
    }

    public void setTalks(boolean talks) {
        this.talks = talks;
    }
}
