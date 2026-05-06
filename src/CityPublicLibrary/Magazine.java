package CityPublicLibrary;

public class Magazine extends LibraryItem{

    private int issueNumber;
    private String publisher;

    public Magazine(String itemId, String title, int yearPublished, int issueNumber, String publisher) {
        super(itemId, title, yearPublished);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    @Override
    String getItemInfo() {
        return "[MAGAZINE]     | ID:" + this.itemId + " | " + this.title + " Issue #" + this.issueNumber + " | Publisher: " + this.publisher + " | Availability: " + this.isAvailable() ;
    }
}


