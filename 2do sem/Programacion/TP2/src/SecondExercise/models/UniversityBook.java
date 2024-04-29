package SecondExercise.models;

public class UniversityBook extends Book {
    private String field;

    public UniversityBook(String title, String author, int publicationYear, String field) {
        super(title, author, publicationYear);
        this.field = field;
    }
}
