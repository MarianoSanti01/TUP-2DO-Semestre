class Bicycle extends Vehicle {
    String type; // urban / sport

    public Bicycle(String color, String type) {
        super(color, 2);
        this.type = type;
    }
}