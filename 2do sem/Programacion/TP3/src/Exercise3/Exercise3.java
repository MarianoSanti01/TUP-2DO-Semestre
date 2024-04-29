package Exercise3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        // Crear lista de días de la semana
        List<String> weekDays = new ArrayList<>();
        weekDays.add("Lunes");
        weekDays.add("Martes");
        weekDays.add("Miércoles");
        weekDays.add("Jueves");
        weekDays.add("Viernes");
        weekDays.add("Sábado");
        weekDays.add("Domingo");

        // Insertar "Juernes" en la posición 4
        weekDays.add(4, "Juernes");
        System.out.println("Se ha insertado 'Juernes' en la posición 4.");

        // Mostrar contenido de las posiciones 3 y 4
        System.out.println("Elemento en la posición 3: " + weekDays.get(3));
        System.out.println("Elemento en la posición 4: " + weekDays.get(4));

        // Mostrar primer y último elemento
        System.out.println("Primer elemento: " + weekDays.get(0));
        System.out.println("Último elemento: " + weekDays.get(weekDays.size() - 1));

        // Eliminar "Juernes" y comprobar que ha sido eliminado
        if (weekDays.remove("Juernes")) {
            System.out.println("'Juernes' ha sido eliminado de la lista.");
        } else {
            System.out.println("'Juernes' no estaba en la lista.");
        }

        // Crear iterador y mostrar valores uno a uno
        System.out.println("Mostrando elementos con iterador:");
        Iterator<String> iterator = weekDays.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Buscar si existe "Lunes" en la lista (sin importar mayúsculas o minúsculas)
        boolean found = false;
        for (String dia : weekDays) {
            if (dia.equalsIgnoreCase("Lunes")) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Se ha encontrado 'Lunes' en la lista.");
        } else {
            System.out.println("No se ha encontrado 'Lunes' en la lista.");
        }

        // Borrar todos los elementos de la lista
        weekDays.clear();
        System.out.println("Todos los elementos han sido eliminados de la lista.");
    }
}

