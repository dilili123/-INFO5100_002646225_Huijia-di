public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // 
        library.addBook(new Book("Crime and Punishment", "Fyodor Dostoevsky", "Psychological Fiction", "475856967858"));

        // 
        library.displayAvailableBooks();

        //
        try {
            library.checkOutBook("475856967858");
            System.out.println("Successfully viewed Crime and Punishment.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 
        try {
            library.returnBook("475856967858");
            System.out.println("Successfully returned The Crime and Punishment.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 
        try {
            library.checkOutBook("invalidISBN");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 
        try {
            library.checkOutBook("475856967858");
            System.out.println("Successfully checked out The Crime and Punishment again.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 
        library.displayAvailableBooks();
    }
}
