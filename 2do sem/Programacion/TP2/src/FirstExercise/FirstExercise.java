package FirstExercise;
import FirstExercise.models.*;

public class FirstExercise {
    public static void firstExercise(String[] args) {
        PetStore store = new PetStore();

        // Create animals
        Dog dog = new Dog("Buddy", 3, 500.0, "Labrador", true);
        Cat cat = new Cat("Whiskers", 2, 300.0, "Siamese", false);
        Bird bird = new Bird("Polly", 1, 200.0, "Parrot", true);
        Fish fish = new Fish("Nemo", 1, 50.0);

        // Add animals to the store
        store.addAnimal(dog);
        store.addAnimal(cat);
        store.addAnimal(bird);
        store.addAnimal(fish);

        // Sell an animal
        store.sellAnimal("Whiskers");

        // Feed an animal
        store.feedAnimal("Buddy");

        // List all animals in the store
        store.listAnimals();
    }
}
