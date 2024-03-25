public class Main {
    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee(1, "Cinthia", 1500, 700);
        System.out.println("El salario del empleado "+e1.getName()+" es "+e1.calculateSalary());

        FullTimeEmployee e2 = new FullTimeEmployee(1, "Cinthia", 1500, 700);
        System.out.println("El salario del empleado "+e2.getName()+" es "+e2.calculateSalary());

    }
}