//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FoodItem foodItem = new FoodItem(
                "P101",
                "Cargills",
                "Bread",
                150
        );

        Product electronicItem =  new ElectronicItem(
                "P202",
                "Singer",
                "Electric Kettle",
                5000
        );




        System.out.println("---- Food Item ----");
        foodItem.calculatePrice();
        foodItem.calculatePrice(50.0);
        foodItem.displayDetails();
        foodItem.printBill();



        System.out.println("\n\n---- Electronic Item ----");
        electronicItem.calculatePrice();
        electronicItem.calculatePrice(50.0);
        electronicItem.displayDetails();



    }
}