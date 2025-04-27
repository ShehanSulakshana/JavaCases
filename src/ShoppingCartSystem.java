import java.util.Scanner;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("\n#### Online Shopping Cart ####\n\n");

        System.out.print("[#] How many items to add? : ");
        int numOfitems = Scan.nextInt();

        String[] productNames = new String[numOfitems];
        double[] prices = new double[numOfitems];
        int[] quantities = new int[numOfitems];
        double[] totalPrices = new double[numOfitems];
        double totalCost = 0;

        for(int i = 0; i < numOfitems; i++) {
            System.out.println("\n[Item " + (i+1) + "]");
            System.out.print("~ Product Name : ");
            productNames[i] = Scan.next();

            System.out.print("~ Price : ");
            prices[i] = Scan.nextDouble();

            System.out.print("~ Quantity : ");
            quantities[i] = Scan.nextInt();

            totalPrices[i] = prices[i] * quantities[i];
            totalCost += totalPrices[i];
        }

        System.out.println("\n\n[*] SHOPPING CART SUMMARY");
        for(int i = 0; i < numOfitems; i++) {
            System.out.println("\n# Item " + (i+1));
            System.out.println("~ Product\t: " + productNames[i]);
            System.out.println("~ Quantity\t: " + quantities[i]);
            System.out.println("~ Total Price\t: " + totalPrices[i]);
        }
        System.out.println("\n[#] TOTAL COST\t: " + totalCost);

        System.out.print("\n[?] Remove item (y/n)? : ");
        String choice = Scan.next();

        if(choice.equalsIgnoreCase("y")) {
            System.out.print("[#] Enter product name : ");
            String target = Scan.next();

            boolean found = false;
            for(int i = 0; i < numOfitems; i++) {
                if(productNames[i].equals(target)) {
                    totalCost -= totalPrices[i];
                    productNames[i] = null;
                    quantities[i] = Integer.parseInt(null);
                    prices[i] = Double.parseDouble(null);
                    totalPrices[i] = Double.parseDouble(null);
                    found = true;
                    break;
                }
            }

            if(found) {
                System.out.println("[+] Item removed!");
                System.out.println("[#] UPDATED TOTAL\t: " + totalCost);
            } else {
                System.out.println("[!] Item not found!");
            }
        }
    }
}