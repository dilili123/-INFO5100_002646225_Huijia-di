public class Book {
    private String title;
    private String author;
    private int publishYear;
    private String language;
    private int pageCount;
    private double width;
    private double height;
    private double price;

    public Book(String title, String author, int year, String language, int pages, double width, double height,  double price) {
        this.title = title;
        this.author = author;
        this.publishYear = year;
        this.language = language;
        this.pageCount = pages;
        this.width = width;
        this.height = height;
        this.price = price;
        System.out.println("This is a Book: " + title);
    }

    //methods
    public void bookPrice() {
        System.out.println("The price of this book is: " + price);
    }

    public void openBook() {
        System.out.println("open this book: " + title);
    }

    public void closeBook() {
        System.out.println("Close this book:" + title);
    }

    //
    public static class Chapter {
        private int chapterNumber;
        private String title;
        private String summary;
        
        public Chapter(int chapterNumber, String title,String summary) {
            this.chapterNumber = chapterNumber;
            this.title = title;
            System.out.println("This is Chapter: " + chapterNumber);
        }

        public void Title() {
            System.out.println("This is chapter title:" + title);
        }

        public void summary() {
            System.out.println("This is summary:" + summary);
        }
    }

    //2
    public static class Cover {
        private String color;
        private String font;
        
        public Cover(String color, String font) {
            this.color = color;
            this.font = font;
            System.out.println("The cover color of this book is: " + color);
        }

        public void font() {
            System.out.println("The font of this book is:" + font);
        }
    }
    
}
