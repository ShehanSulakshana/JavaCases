public class FoodItem extends Product implements Billable{

    public FoodItem(String productID, String storeName, String productName, double price) {
        super(productID, storeName, productName, price);
    }

    @Override
    public void displayDetails(){
        System.out.println("Food Item Details : ");
        System.out.println("Product Name : " + getProductName());
    }

    @Override
    public void printBill() {
        System.out.println("Bill Printed Successfully.");
    }
}
