package models;
import java.util.ArrayList;
import java.util.List;

public class NationalTeam {
    private String color;
    private String country;
    private List<Athlete> belongingAthletes;

    public NationalTeam(String color, String country) {
        this.color = color;
        this.country = country;
        this.belongingAthletes = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Athlete> getBelongingAthletes() {
        return belongingAthletes;
    }

    public void addBelongingAthlete(Athlete athlete) {
        belongingAthletes.add(athlete);
    }
}
