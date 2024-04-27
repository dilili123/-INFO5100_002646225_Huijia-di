import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // 
    public void addBook(Book book) {
        books.add(book);
    }

    // 
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    // 
    public List<Book> searchByTitle(String title) {
        return books.stream()
                    .filter(book -> book.getTitle().equalsIgnoreCase(title) && book.isAvailable())
                    .collect(Collectors.toList());
    }

    //
    public void displayAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    // 
    public void checkOutBook(String isbn) throws Exception {
        Book book = findBookByIsbn(isbn);
        if (book != null) {
            if (book.isAvailable()) {
                book.setIsAvailable(false);
            } else {
                throw new Exception("The book has already been borrowed.");
            }
        } else {
            throw new Exception("The book with ISBN " + isbn + " cannot be found.");
        }
    }
    // 
    public void returnBook(String isbn) throws Exception {
        Book book = findBookByIsbn(isbn);
        if (book != null) {
            if (!book.isAvailable()) {
                book.setIsAvailable(true);
            } else {
                throw new Exception("The book was not borrowed.");
            }
        } else {
            throw new Exception("The book with ISBN " + isbn + " cannot be found.");
        }
    }

    // 
    private Book findBookByIsbn(String isbn) {
        return books.stream()
                    .filter(book -> book.getIsbn().equals(isbn))
                    .findFirst()
                    .orElse(null);
    }
}
