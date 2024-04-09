import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void catalog(List<Vehicle> vehicles) {
        catalog(vehicles, -1);
    }

    public static void catalog(List<Vehicle> vehicles, int wheels) {

        if (wheels != -1) {
            System.out.println("Found " + vehicles.stream().filter(v -> v.wheels == wheels).count() +
                    " vehicles with " + wheels + " wheels:");
        }

        for (Vehicle v : vehicles) {

            if (wheels == -1 || v.wheels == wheels) {

                System.out.println("Class: " + v.getClass().getSimpleName());
                System.out.println("Color: " + v.color);
                System.out.println("Wheels: " + v.wheels);

                if (v instanceof Car)
                    System.out.println("Displacement: " + ((Car)v).displacement);
                else if (v instanceof Van)
                    System.out.println("Capacity: " + ((Van)v).capacity);
                else if (v instanceof Motorcycle)
                    System.out.println("Style: " + ((Motorcycle)v).style);

                // ... Similar checks and prints for other subclasses
            }
        }
    }

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Red", 120.0, 2000));
        vehicles.add(new Bicycle("Blue", "Urban"));
        vehicles.add(new Van("White", 12)); // Example van
        vehicles.add(new Motorcycle("Black", "Sport")); // Example motorcycle
        // ... Add more objects of subclasses here

        catalog(vehicles); // Show all vehicles
        catalog(vehicles, 0); // Show vehicles with 0 wheels
        catalog(vehicles, 2); // Show vehicles with 2 wheels
        catalog(vehicles, 4); // Show vehicles with 4 wheels
    }
}