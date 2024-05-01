import models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creacion de 6 atletas
        Athlete athlete1 = new Athlete(123456789, "John", 1.80, 25, 75.5);
        Athlete athlete2 = new Athlete(987654321, "Emily", 1.65, 30, 60.2);
        Athlete athlete3 = new Athlete(456789123, "Michael", 1.90, 28, 85.3);
        Athlete athlete4 = new Athlete(654321987, "Sophia", 1.75, 22, 70.8);
        Athlete athlete5 = new Athlete(321987654, "David", 1.82, 27, 88.5);
        Athlete athlete6 = new Athlete(789123456, "Emma", 1.70, 26, 63.4);

        // Creacion de 2 equipos nacionales y agregacion de 3 atletas a cada uno
        NationalTeam nationalTeam1 = new NationalTeam("Red", "USA");
        nationalTeam1.addBelongingAthlete(athlete1);
        nationalTeam1.addBelongingAthlete(athlete2);
        nationalTeam1.addBelongingAthlete(athlete3);

        NationalTeam nationalTeam2 = new NationalTeam("Blue", "France");
        nationalTeam2.addBelongingAthlete(athlete4);
        nationalTeam2.addBelongingAthlete(athlete5);
        nationalTeam2.addBelongingAthlete(athlete6);

        // Creacion de una instalacion
        Site site1 = new Site("Deportive", "Second Area", "Californian Site", "Medium");

        // Creacion de 2 pruebas con una lista de 3 atletas y una instalacion cada una
        List<Athlete> firstTestAthletes = new ArrayList<>();
        firstTestAthletes.add(athlete1);
        firstTestAthletes.add(athlete3);
        firstTestAthletes.add(athlete5);

        List<Site> firstTestSite = new ArrayList<>();
        firstTestSite.add(site1);
        Test test1 = new Test(500, "Jumping Test", firstTestAthletes, firstTestSite);


        List<Athlete> secondTestAthletes = new ArrayList<>();
        secondTestAthletes.add(athlete2);
        secondTestAthletes.add(athlete4);
        secondTestAthletes.add(athlete6);

        List<Site> secondTestSite = new ArrayList<>();
        secondTestSite.add(site1);
        Test test2 = new Test(600, "Weightlifting Test", secondTestAthletes, secondTestSite);

        // Agregacion de las dos pruebas a la instalacion creada
        site1.addTest(test1);
        site1.addTest(test2);

        // Creacion de las sedes con su horario, fecha, prueba e instalacion correspondiente
        Campus campus1 = new Campus(1, "28/07/2024", "19:00:00", site1, test1);
        Campus campus2 = new Campus(2, "30/07/2024", "12:00:00", site1, test2);


        System.out.println("=== Desde un objeto Instalacion ===");
        System.out.println("Nombre del 3er atleta de la 2da prueba:");
        System.out.println(site1.getTests().get(1).getParticipatingAthletes().get(2).getName());

        System.out.println("\nCodigo de la 2da prueba:");
        System.out.println(site1.getTests().get(1).getCode());


        System.out.println("\n=== Desde un objeto EquipoNacional ===");
        System.out.println("Altura de todos los atletas:");
        for (Athlete athlete : nationalTeam2.getBelongingAthletes()) {
            System.out.println("Altura de " + athlete.getName() + ": " + athlete.getHeight() + "m");
        }

        System.out.println("\nPeso extra de cada atleta");
        for (Athlete athlete : nationalTeam2.getBelongingAthletes()) {
            double bmi = athlete.calculateBMI(athlete.getWeight(), athlete.getHeight());
            if (athlete.isOverweight(bmi)) {
                System.out.println(athlete.getName() + " tiene peso extra.");
            } else {
                System.out.println(athlete.getName() + " no tiene sobrepeso.");
            }
        }
    }
}