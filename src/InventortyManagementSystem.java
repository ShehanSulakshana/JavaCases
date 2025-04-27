import java.util.Arrays;
import java.util.Scanner;

public class InventortyManagementSystem {
    public static void main (String[] args){

        System.out.println("\n#### Mini Inventory Management System ####\n\n");

        Scanner Scan = new Scanner(System.in);

        System.out.print("[#] How many items should be added into the system ? :");
        int itemCount = Scan.nextInt();

        String[][] products = new String[itemCount][];
        //String[] item = new String[3];

        double Highest = 0 ;
        double Total = 0 ;

        for (int i=0 ; i<itemCount; i++){
            double Ptotal = 0;

            System.out.println("\n[Product "+ (i+1) +"]");
            System.out.print("~ Product Name : ");
            String Pname = Scan.next();

            System.out.print("~ Quantity : ");
            double Pquantity = Scan.nextDouble();

            System.out.print("~ Price Per Unit : ");
            int Price = Scan.nextInt();

            Ptotal = Pquantity*Price;

            //Store in single array
            String[] item = {Pname, String.valueOf(Pquantity), String.valueOf(Price) , String.valueOf(Ptotal)};

            // Store in multi array
            products[i] = item;

            //Calc Total of inventory
            Total += (Ptotal);

            // Set Highest value
            if (Ptotal>Highest){
                Highest = Ptotal;
            }
        }


        System.out.println("\n\n[*] ALL PRODUCTS IN THE INVENTORY SYSTEM....... ");
        for (int i = 0; i <products.length ; i++) {
            System.out.println("\n# PRODUCT ["+(i+1)+"]");
            System.out.println("~ Product Name          : "+products[i][0]);
            System.out.println("~ Product Quantity      : "+products[i][1]);
            System.out.println("~ Product Unit Price    : "+products[i][2]);
            System.out.println("~ Total Price ("+products[i][1] + "*" + products[i][2] + ")  : "+products[i][3]);
        }

        System.out.println("\n\n[#] Highest Value Of All Products : " + String.valueOf(Highest));
        System.out.println("[#] Total Value Of All Products : " + String.valueOf(Total));

    }
}
