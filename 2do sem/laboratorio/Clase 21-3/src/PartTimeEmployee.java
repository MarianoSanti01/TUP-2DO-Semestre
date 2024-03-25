public class PartTimeEmployee extends Employee{
    private int hoursworked;
    private float hourlyRate;

    public PartTimeEmployee(int id, String name, float salary, int hoursworked, float hourlyRate) {
        super(id, name, salary);
        this.hoursworked = hoursworked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursworked() {
        return hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    @Overrride
    public float calculateSalary(){
        return super.calculateSalary() + (hoursworked + hourlyRate);
    }
}
