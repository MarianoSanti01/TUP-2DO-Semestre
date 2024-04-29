package TP2;

public class Main {
    public static void main(String[] args) {
        //Crear una biblioteca
        Biblioteca sanMartin = new Biblioteca("Biblioteca José de San Martín");

        //Crear los libros
        Libro l1 = new Universitario("Física I","Sears",1990,false,"Ingenieria");
        Libro l2 = new Universitario("Calculo Vectorial","Claudio, Pita",1985,false,"Ingenieria");
        Libro l3 = new Universitario("Química Organica","Monica, Gutierrez y Leticia, Lopez",2000,false,"Profesorado en Química");
                                //Terminar de llenar la info de los libros
        Libro l4 = new Novela("Orgullo y prejuicio", "Jean Austen", 1813, false, "novela");
        Libro l5 = new Novela("Frankenstein", "Mary Shane", 1818, false, "novela");
        Libro l6 = new Novela("Cumbres Borroscosas", "Emily Brotë", 1847, false, "novela");

        Libro l7 = new Infantil("El libro de la selva", "Rudyard Kipling", 1894, false, 8);
        Libro l8 = new Infantil("El principito", "Antoine de Saint-Exupéry", 1943, false, 12);
        Libro l9 = new Infantil("Las aventuras de Alicia en el país de Las Maravillas", "Lewis Carrol", 1865, false, 11);

        //Agregar Estos libros a la biblioteca
        sanMartin.agregarLibro(l1);
        sanMartin.agregarLibro(l2);
        sanMartin.agregarLibro(l3);
        sanMartin.agregarLibro(l4);
        sanMartin.agregarLibro(l5);
        sanMartin.agregarLibro(l6);
        sanMartin.agregarLibro(l7);
        sanMartin.agregarLibro(l8);
        sanMartin.agregarLibro(l9);

        //Iniciamos los libros en false así que en el metodo ListarDisponibles tiene que salir todos
        sanMartin.librosDisponibles();

        //Uriel necesita el libro de física, pide prestado "Física I"
        sanMartin.prestarLibro("Física I");

        //Uriel pide prestado un libro para su amigo, "Química Organica"
        sanMartin.prestarLibro("Química Organica");

        //Rodrigo Pide prestado de la biblioteca una novela, "Orgullo y prejuicio"
        //tambien pide un libro infantil para su hermanito
        sanMartin.prestarLibro("Orgullo y prejuicio");
        sanMartin.prestarLibro("El principito");

        //Listamos los libros disponibles(En este caso tenemos 4 libros menos
        sanMartin.librosDisponibles();

        //Rodrigo volvio a los dias a devolver el libro del principito y se llevo otros dos libros
        sanMartin.devolverLibro("El principito");
        sanMartin.prestarLibro("El libro de la selva");
        sanMartin.prestarLibro("Frankenstein");


        sanMartin.librosDisponibles();
    }
}
