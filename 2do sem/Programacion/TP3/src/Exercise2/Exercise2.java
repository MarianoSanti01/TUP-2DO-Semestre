package Exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John");
        Employee employee2 = new Employee("Mary");

        employee1.assignSupervisor(employee2);

        System.out.println("El supervisor de " + employee1.name + " es: " + employee1.getSupervisorName());
    }
}
