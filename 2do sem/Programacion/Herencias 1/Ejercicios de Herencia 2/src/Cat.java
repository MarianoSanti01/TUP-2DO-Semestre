class Cat extends Animal {
    private String species;

    public Cat(String name, int age, String gender, String species) {
        super(name, age, gender);
        this.species = species;
    }

    @Override
    public void make_sound() {
        System.out.println("The cat meows.");
    }
}