package models;

public class Campus {
    private int phase;
    private String date;
    private String time;
    private Site site;
    private Test test;

    public Campus(int phase, String date, String time, Site site, Test test) {
        this.phase = phase;
        this.date = date;
        this.time = time;
        this.site = site;
        this.test = test;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
