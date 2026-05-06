public class ElectronicItem extends Product{

    public ElectronicItem(String productID, String storeName, String productName, double price) {
        super(productID, storeName, productName, price);
    }


    @Override
    public void displayDetails() {
        System.out.println("Electronic Item Details : ");
        System.out.println("Product Name : " + getProductName());
    }
}
