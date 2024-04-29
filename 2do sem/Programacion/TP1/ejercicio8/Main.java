package TP1.ejercicio8;
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Gerente y Trabajador
        Manager manager1 = new Manager("Sabina", 20, 18000, "Recursos Humanos");
        Worker worker1 = new Worker("Marianela", 25, 3800, "Producción");

        // Utilizar métodos específicos de cada tipo de empleado
        manager1.organizeActivities();
        worker1.produce();
    }
}
