package ShopEasy;

public class Product {

    private int productId;
    private String name;
    private double price;
    private int stockQuantity;
    private String category;

    public Product(){
        this.productId = 0;
        this.name = "Unknown";
        this.price = 0.0;
        this.stockQuantity = 0;
        this.category = "Uncategorized";
    }

    public Product(int productId, String name, double price, int stockQuantity, String category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.category = category;
    }


    public void displayProduct(){
        System.out.println("Product ID      : " + this.productId);
        System.out.println("Name            : " + this.name );
        System.out.println("Price           : " + "$" + this.price);
        System.out.println("Stock Quantity  : " + this.stockQuantity + " units");
        System.out.println("Category        : " + this.category);
    }

    public void applyDiscount(){
        double discountPercent = 10.0;
        double discountedPrice = price*(discountPercent /100);
        this.price = price - discountedPrice ;
        System.out.println("Default 10% applied.  New Price: " + "$" +price);

    }

    public void applyDiscount(double discountPercent){
        if ( discountPercent>= 0 && discountPercent<=99) {
            double discountedPrice = price*(discountPercent /100);
            this.price = price - discountedPrice ;
            System.out.println("Custom " + (int)  discountPercent +"% applied.  New Price: " + "$" + price);
        }else {
            System.out.println("Invalid discount percentage");
        }


    }

    public void applyDiscount(double discountPercent , int minStock){
        if ( discountPercent>= 0 && discountPercent<=99) {
            if (  this.stockQuantity>=minStock){
                double discountedPrice = price*(discountPercent /100);
                this.price = price - discountedPrice ;
                System.out.println("Stock OK. "+ (int) discountPercent +"% applied.  New Price: " + "$" +price);
            }else {
                System.out.println("Stock too low for this discount.");
            }
        }else {
            System.out.println("Invalid discount percentage");
        }
    }


}





