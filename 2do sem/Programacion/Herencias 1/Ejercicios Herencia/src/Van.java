class Van extends Vehicle {
    int capacity; // Passenger or cargo capacity

    public Van(String color, int capacity) {
        super(color, 4);
        this.capacity = capacity;
    }
}