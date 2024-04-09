class Motorcycle extends Vehicle {
    String style; // Cruiser, sport, touring, etc.

    public Motorcycle(String color, String style) {
        super(color, 2);
        this.style = style;
    }
}