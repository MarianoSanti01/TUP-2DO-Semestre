package TP1.ejercicio8;

import TP1.ejercicio8.Employe;

// Subclase Trabajador
class Worker extends Employe {
    // Atributo adicional para el area de trabajo
    private String area;

    // Constructor sobrecargado
    public Worker(String name, int age, double salary, String area) {
        super(name, age, salary);
        this.area = area;
    }

    // Metodo específico para los trabajadores
    public void produce() {
        System.out.println(name + " está produciendo en el área de " + area);
    }
}

