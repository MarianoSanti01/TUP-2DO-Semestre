class Car extends Vehicle {
    double speed;
    int displacement;

    public Car(String color, double speed, int displacement) {
        super(color, 4);
        this.speed = speed;
        this.displacement = displacement;
    }
}