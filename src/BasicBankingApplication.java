import java.util.Scanner;

public class BasicBankingApplication {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("\n#### Basic Banking Application ####\n\n");

        // Input number of accounts
        System.out.print("[#] How many accounts to create? : ");
        int AccountCount = Scan.nextInt();

        String[][] Accounts = new String[AccountCount][2];

        // Input account details
        for(int i = 0; i < AccountCount; i++) {
            System.out.println("\n[Account " + (i+1) + "]");
            System.out.print("~ Account Number : ");
            String AccNumber = Scan.next();

            System.out.print("~ Initial Balance : ");
            double InitialBalance = Scan.nextDouble();

            Accounts[i] = new String[] {AccNumber, String.valueOf(InitialBalance)};
        }

        // Operations loop
        boolean Running = true;
        while(Running) {
            System.out.println("\n\n[*] Choose operation:");
            System.out.println("\t1. Deposit");
            System.out.println("\t2. Withdraw");
            System.out.println("\t3. Check Balance");
            System.out.println("\t4. Exit");
            System.out.print("~ Enter choice: ");
            int Choice = Scan.nextInt();

            if(Choice == 4) {
                Running = false;
                continue;
            }

            // Account selection
            System.out.print("[#] Enter account index (1-" + AccountCount + "): ");
            int AccIndex = Scan.nextInt() - 1;

            if(AccIndex < 0 || AccIndex >= AccountCount) {
                System.out.println("[!] Invalid account index!");
                continue;
            }

            String[] CurrentAccount = Accounts[AccIndex];
            String AccNumber = CurrentAccount[0];
            double Balance = Double.parseDouble(CurrentAccount[1]);

            switch(Choice) {
                case 1: // Deposit
                    System.out.print("[#] Enter deposit amount: ");
                    double Deposit = Scan.nextDouble();
                    Balance += Deposit;
                    CurrentAccount[1] = String.valueOf(Balance);
                    System.out.println("[+] Deposit successful!");
                    break;

                case 2: // Withdraw
                    System.out.print("[#] Enter withdrawal amount: ");
                    double Withdraw = Scan.nextDouble();
                    if(Withdraw > Balance) {
                        System.out.println("[!] Insufficient funds!");
                    } else {
                        Balance -= Withdraw;
                        CurrentAccount[1] = String.valueOf(Balance);
                        System.out.println("[+] Withdrawal successful!");
                    }
                    break;

                case 3: // Check Balance
                    System.out.println("[*] Account Number\t: " + AccNumber);
                    System.out.println("[*] Current Balance\t: " + Balance);
                    break;

                default:
                    System.out.println("[!] Invalid choice!");
            }

            // Display updated balance
            if(Choice != 3) {
                System.out.println("[*] Updated Balance\t: " + Balance);
            }
        }

        System.out.println("\n\n[#] Thank you!");
    }
}
