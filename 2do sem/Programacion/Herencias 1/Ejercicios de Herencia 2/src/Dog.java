class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String gender, String breed) {
        super(name, age, gender);
        this.breed = breed;
    }

    @Override
    public void make_sound() {
        System.out.println("The dog barks.");
    }
}