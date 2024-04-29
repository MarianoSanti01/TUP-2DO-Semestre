package Clases;

public class Cat extends Animal{
    private String race;
    private String sterilized;


    public Cat(String race, String sterilized) {
        this.race = race;
        this.sterilized = sterilized;
    }

    public Cat(String name, int age, String animalType, double price, String race, String sterilized) {
        super(name, age, animalType, price);
        this.race = race;
        this.sterilized = sterilized;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSterilized() {
        return sterilized;
    }

    public void setSterilized(String sterilized) {
        this.sterilized = sterilized;
    }
}
