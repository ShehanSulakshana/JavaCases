package ShopEasy;

public class Main {

    public static void main(String[] args) {

// Q1 ---------------------------------
        Product product1 = new Product();
        Product product2 = new Product(
                101,
                "Wireless HeadPhone",
                49.99 ,
                150,
                "Electronics"
        );

        System.out.println("\n==== Default Product ====");
        product1.displayProduct();

        System.out.println("\n==== Parameterized Product ====");
        product2.displayProduct();


// Q2 ---------------------------------
        Product product3 = new Product(
                102,
                "Wi-Fi Router",
                100.00 ,
                80,
                "Electronics"
        );

        product3.applyDiscount();
        product3.applyDiscount(15);
        product3.applyDiscount(20,50);
        product3.applyDiscount(20,90);



// Q3 ---------------------------------
        DigitalProduct digitalProduct = new DigitalProduct(
                301,
                "Java Programming eBook",
                24.99,
                9999,
                "Books",
                "https://shopEasy.com/downloads/java-ebook ",
                8.5
        );

        System.out.println();
        digitalProduct.displayProduct();



    }

}
