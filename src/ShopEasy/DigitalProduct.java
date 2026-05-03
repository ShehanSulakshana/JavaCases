package ShopEasy;

public class DigitalProduct extends Product{

    private String downloadUrl;
    private double SizeMB;

    public DigitalProduct(int productId, String name, double price, int stockQuantity, String category, String downloadUrl, double sizeMB) {
        super(productId, name, price, stockQuantity, category);
        this.downloadUrl = downloadUrl;
        this.SizeMB = sizeMB;
    }


    @Override
    public void displayProduct(){
        super.displayProduct();

        System.out.println("--- Digital Details ---");
        System.out.println("Download Url    : " + downloadUrl);
        System.out.println("File Size       : " + SizeMB + " MB");
    }


}


