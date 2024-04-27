public class Book {
    private String title;
    private String author;
    private String genre;
    private String isbn;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String genre, String isbn) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // 
    @Override
    public String toString() {
        return title + " by " + author + " [" + (isAvailable ? "Available" : "Checked out") + "]";
    }
}
