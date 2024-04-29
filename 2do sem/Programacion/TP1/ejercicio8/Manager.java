package TP1.ejercicio8;

import TP1.ejercicio8.Employe;

class Manager extends Employe {
    // Atributo adicional para el departamento/area de trabajo
    private String area;

    // Constructor sobrecargado
    public Manager(String name, int age, double salary, String area) {
        super(name, age, salary);
        this.area = area;
    }

    // Metodo específico para los gerentes
    public void organizeActivities() {
        System.out.println(name + " está organizando actividades en el departamento de " + area);
    }
}
