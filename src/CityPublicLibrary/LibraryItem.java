package CityPublicLibrary;

public abstract class LibraryItem {

    protected String itemId;
    protected String title;
    protected int yearPublished;
    private boolean available;

    public LibraryItem(String itemId, String title, int yearPublished) {
        this.itemId = itemId;
        this.title = title;
        this.yearPublished = yearPublished;
        this.available = true;
    }

    abstract String getItemInfo();

    void checkOut(){
        available = false;
    };


    void returnItem(){
        available = true;
    };

    boolean isAvailable(){
        return available;
    }




}
