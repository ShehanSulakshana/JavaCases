public abstract class Product {

    private final String productID;
    private final String storeName;

    private String productName;
    private double price;

    public Product(String productID, String storeName, String productName, double price) {
        this.productID = productID;
        this.storeName = storeName;
        this.productName = productName;
        this.price = price;
    }


    public abstract void displayDetails();


    public double calculatePrice(){
        System.out.println("Price : " + price);
        return price;
    }

    public double calculatePrice(double discount){
        System.out.println("Price after discount : " + (price - discount) );
        return price - discount;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
