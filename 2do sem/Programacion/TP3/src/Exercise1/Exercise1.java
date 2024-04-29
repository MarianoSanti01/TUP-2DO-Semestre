package Exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Create objects for each class
        Teacher teacher = new Teacher(12345678, "John Doe", "Computer Science");
        Course course2 = new Course(102, "10:00", "Database");
        teacher.addCourse(new Course(101, "8:00", "Programming"));
        teacher.addCourse(course2);
        teacher.addCourse(new Course(103, "12:00", "English"));

        Student student = new Student(98765432, "Mary Smith");

        Group group1 = new Group("1A", 'A');
        group1.addStudent(student);
        group1.addCourse(new Course(201, "8:00", "Mathematics"));
        group1.addCourse(new Course(202, "10:00", "History"));

        course2.addGroup(group1);

        group1.courses.get(1).addTeacher(teacher);

        student.addGroups(group1);
        student.addGroups(new Group("1B", 'B'));
        student.addGroups(new Group("1C", 'C'));

        // a - Aula de la tercer asignatura del profesor
        System.out.println("\nClassroom of the 3rd course: " + teacher.courses.get(2).classroom);

        // b - Nombre de las asignaturas dictadas por el profesor
        System.out.println("\nCourses taught by the teacher:");
        for (Course course : teacher.courses) {
            System.out.println(course.name);
        }

        // c - Nombre y DNI de alumnos de una asignatura
        Course course = group1.courses.get(0);
        System.out.println("\nStudents in the group receiving the course " + course.name + ":");
        for (Student s : group1.students) {
            System.out.println("Name: " + s.name + ", DNI: " + s.dni);
        }

        // d - Tercer letra del grupo al que pertenece un alumno
        System.out.println("\nLetter of the 3rd group to which the student belongs: " + student.groups.get(2).letter);

        // e - Cursos del primer grupo de un alumno
        System.out.println("\nCourses received by the 1st group to which the student belongs:");
        for (Course c : student.groups.get(0).courses) {
            System.out.println(c.name);
        }

        // f - Profesores asignados al curso de un grupo de un estudiante
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the name of a course:");
        String courseName = scanner.nextLine();
        for (Group g : student.groups) {
            for (Course c : g.courses) {
                if (c.name.equals(courseName)) {
                    System.out.println("Teachers related to a course of a student:");
                    for (Teacher t : c.teachers) {
                        System.out.println(t.name);
                    }
                }
            }
        }

        // g - Estudiantes relacionados a un grupo que esta relacionado a la segunda asignatura de un profesor
        System.out.println("\nStudents related to a group related to the 2nd Course of a teacher");
        for (Group g : teacher.courses.get(1).groups) {
            for (Student s : g.students) {
                System.out.println(s.name);
            }
        }

        // h -
        // Asociación: Es una relación básica entre dos clases, no implica una dependencia fuerte entre los objetos y puede ser bidireccional o unidireccional.
        //Composición: Es una asociación fuerte donde una clase (compuesta) es parte de otra clase (compuesta). La clase compuesta no puede existir sin la clase que la contiene y la clase contenedora es responsable de crear y destruir la clase compuesta.
        //Agregación: Es similar a la composición pero menos restrictiva. La clase agregada puede existir independientemente de la clase que la contiene y la clase contenedora no es responsable de crear o destruir la clase agregada.
    }
}
