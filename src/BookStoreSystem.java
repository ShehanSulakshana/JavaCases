import java.util.Scanner;

public class BookStoreSystem {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("\n#### Bookstore Inventory ####\n\n");

        System.out.print("[#] Number of books? : ");
        int bookCount = Scan.nextInt();

        String[] titles = new String[bookCount];
        int[] quantities = new int[bookCount];
        double[] prices = new double[bookCount];
        double[] totalValues = new double[bookCount];
        double inventoryTotal = 0;

        for(int i = 0; i < bookCount; i++) {
            System.out.println("\n[Book " + (i+1) + "]");
            System.out.print("~ Title : ");
            titles[i] = Scan.next();

            System.out.print("~ Quantity : ");
            quantities[i] = Scan.nextInt();

            System.out.print("~ Price : ");
            prices[i] = Scan.nextDouble();

            totalValues[i] = quantities[i] * prices[i];
            inventoryTotal += totalValues[i];
        }

        System.out.println("\n\n[*] INVENTORY REPORT");
        for(int i = 0; i < bookCount; i++) {
            System.out.println("\n# Book " + (i+1));
            System.out.println("~ Title\t\t: " + titles[i]);
            System.out.println("~ Quantity\t: " + quantities[i]);
            System.out.println("~ Price\t\t: " + prices[i]);
            System.out.println("~ Total Value\t: " + totalValues[i]);
        }
        System.out.println("\n[#] INVENTORY TOTAL\t: " + inventoryTotal);

        System.out.print("\n[?] Search book (yes/no)? : ");
        if(Scan.next().equalsIgnoreCase("yes")) {
            System.out.print("[#] Enter title : ");
            String target = Scan.next();

            boolean found = false;
            for(int i = 0; i < bookCount; i++) {
                if(titles[i].equals(target)) {
                    System.out.println("\n[*] BOOK DETAILS");
                    System.out.println("~ Title\t: " + titles[i]);
                    System.out.println("~ Stock\t: " + quantities[i]);
                    System.out.println("~ Price\t: " + prices[i]);
                    found = true;
                    break;
                }
            }

            if(!found) System.out.println("[!] Book not found!");
        }
    }
}