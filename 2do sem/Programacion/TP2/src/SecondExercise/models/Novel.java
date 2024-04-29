package SecondExercise.models;

public class Novel extends Book {
    private String genre;

    public Novel(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }
}