import java.util.LinkedList;

public class Catalog {
    private LinkedList<Book> listOfAllBooks;

    Catalog(){
        this.listOfAllBooks = new LinkedList<>();
    }

    public void addBook(String title, int isbn, Author author) {
        listOfAllBooks.add(new Book(title, isbn, author));
    }

    public LinkedList<Book> getListOfAllBooks(){
        return listOfAllBooks;
    }
}
