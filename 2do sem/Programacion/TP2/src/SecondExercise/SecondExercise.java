package SecondExercise;
import SecondExercise.models.*;

public class SecondExercise {
    public static void secondExercise(String[] args) {
        Library library = new Library();

        // Create books
        Novel novel = new Novel("One Hundred Years of Solitude", "Gabriel García Márquez", 1967, "Magic realism");
        UniversityBook universityBook = new UniversityBook("Introduction to Programming", "John Doe", 2020, "Computer Science");
        ChildrenBook childrenBook = new ChildrenBook("The Little Prince", "Antoine de Saint-Exupéry", 1943, "Antoine de Saint-Exupéry");

        // Add books to the library
        library.addBook(novel);
        library.addBook(universityBook);
        library.addBook(childrenBook);

        // List available books
        library.listAvailableBooks();

        // Borrow a book
        library.borrowBook("One Hundred Years of Solitude");

        // Return a book
        library.returnBook("Introduction to Programming");
    }
}