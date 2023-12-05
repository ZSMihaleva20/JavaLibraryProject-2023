import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<Book> borrowedBooks;

    public Reader(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Library library, Book book) {
        borrowedBooks.add(book);
        library.removeBook(book);
        System.out.println(name + " borrowed " + book.getTitle());
    }

    public void returnBook(Library library, Book book) {
        borrowedBooks.remove(book);
        library.addBook(book);
        System.out.println(name + " returned " + book.getTitle());
    }

    public void printBorrowedBooks() {
        System.out.println(name + "\'s borrowed books:");
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle());
        }
    }
}