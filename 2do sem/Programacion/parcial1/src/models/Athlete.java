package models;

public class Athlete extends Person implements Contract {
    private double height;
    private int age;
    private double weight;

    public Athlete(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public double calculateBMI(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

    @Override
    public boolean isOverweight(double bmi) {
        return bmi >= 25;
    }

    @Override
    public double calculateHeartRate() {
        return 220 - age;
    }
}
