public class FulTimeEmployee extends Employee{
    private float yearlyBonus;

    public FulTimeEmployee(int id, String name, float salary, float yearlyBonus) {
        super(id, name, salary);
        this.yearlyBonus = yearlyBonus;
    }

    public float getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(float yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }
    @Override
    public float calculateSalary(){
        return super.calculateSalary() + yearlyBonus;
    }

}
