class Animal {
    protected String name;
    protected int age;
    protected String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void make_sound() {
        System.out.println("The animal makes a generic sound.");
    }

    public void information() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Gender: " + gender);
    }
}