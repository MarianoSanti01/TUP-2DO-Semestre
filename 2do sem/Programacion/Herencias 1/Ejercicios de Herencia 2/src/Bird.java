class Bird extends Animal {
    private String type;

    public Bird(String name, int age, String gender, String type) {
        super(name, age, gender);
        this.type = type;
    }

    @Override
    public void make_sound() {
        System.out.println("The bird sings.");
    }
}
