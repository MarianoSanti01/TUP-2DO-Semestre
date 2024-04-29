package TP1.ejercicio8;
public class Employe {
    //Declaración de atributos generales
    protected String name;
    protected int age;
    protected double salary;

    // Constructor sobrecargado no ponemos uno vacío porque no vamos a crear empelados sin nombre, edad o salario
    public Employe(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Metodo comun para todos los empleados
    public void work() {
        System.out.println(name + " está trabajando");
    }
}
