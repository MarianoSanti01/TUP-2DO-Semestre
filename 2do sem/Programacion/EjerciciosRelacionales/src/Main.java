public class Main {
    public static void main(String[] args) {
        // Crear universidades
        Universidad universidad1 = new Universidad("Universidad A");
        Universidad universidad2 = new Universidad("Universidad B");

        // Crear estudiantes asociados a universidades
        Estudiante estudiante1 = new Estudiante("Juan", universidad1);
        Estudiante estudiante2 = new Estudiante("María", universidad2);

        // Mostrar la universidad a la que pertenece cada estudiante
        System.out.println(estudiante1.getNombre() + " pertenece a la universidad " + estudiante1.getUniversidad().getNombre());
        System.out.println(estudiante2.getNombre() + " pertenece a la universidad " + estudiante2.getUniversidad().getNombre());

        // Cambiar la universidad a la que asiste un estudiante
        estudiante1.cambiarUniversidad(universidad2);
        System.out.println("Ahora " + estudiante1.getNombre() + " asiste a la universidad " + estudiante1.getUniversidad().getNombre());
    }
}