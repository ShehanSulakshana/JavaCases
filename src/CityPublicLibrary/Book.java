package CityPublicLibrary;

public class Book extends LibraryItem{

    private String author;
    private String isbn;
    private int numberOfPages;

    public Book(String itemId, String title, int yearPublished, String author, String isbn, int numberOfPages) {
        super(itemId, title, yearPublished);
        this.author = author;
        this.isbn = isbn;
        this.numberOfPages = numberOfPages;
    }

    @Override
    String getItemInfo() {
        return "[BOOK]     | ID:" + this.itemId + " | " + this.title + " by " + this.author + " | ISBN: " + this.isbn + " | Pages: " + this.numberOfPages + " | Availability: " + this.isAvailable() ;
    }
}




