import java.util.LinkedList;

public class Book {
    private final String title;
    private final Author author;
    private final int isbn;
    private static int numberOfAllCopies = 0;
    private LinkedList<Copy> listOfAllCopies;

    public Book(String title, int isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        listOfAllCopies = new LinkedList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public static int getNumberOfAllCopies() {
        return numberOfAllCopies;
    }

    public void addCopy() {
        numberOfAllCopies++;
        listOfAllCopies.add(new Copy(author, title, isbn, numberOfAllCopies, CopyStatus.AVAILABLE));
    }
    public Author getAuthor() {
        return author;
    }
    public LinkedList<Copy> getListOfAllCopies(){
        return listOfAllCopies;
    }
}
