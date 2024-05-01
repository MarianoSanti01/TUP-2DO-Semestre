package models;

import java.util.List;

public class Test {
    private int code;
    private String title;
    private List<Athlete> participatingAthletes;
    private List<Site> sites;

    public Test(int code, String title, List<Athlete> participatingAthletes, List<Site> sites) {
        this.code = code;
        this.title = title;
        this.participatingAthletes = participatingAthletes;
        this.sites = sites;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Athlete> getParticipatingAthletes() {
        return participatingAthletes;
    }

    public void addParticipatingAthlete(Athlete athlete) {
        participatingAthletes.add(athlete);
    }

    public List<Site> getSites() {
        return sites;
    }

    public void addSite(Site site) {
        sites.add(site);
    }
}
