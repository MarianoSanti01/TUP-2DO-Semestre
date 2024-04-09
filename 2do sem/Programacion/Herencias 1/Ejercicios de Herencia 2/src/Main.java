
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Firulais", 3, "Male", "Labrador");
        Cat myCat = new Cat("Fluffy", 2, "Female", "Siamese");
        Bird myBird = new Bird("Tweety", 1, "Male", "Canary");

        myDog.make_sound();
        myDog.information();

        myCat.make_sound();
        myCat.information();

        myBird.make_sound();
        myBird.information();
    }
}
