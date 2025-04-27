import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("\n#### Election System ####\n\n");

        String[] candidates = {"Anura", "Sajith", "Namal"};
        int[] votes = new int[3];
        int maxVote = 0;
        String winner = "";

        System.out.print("[#] Number of voters? : ");
        int numOfVoters = Scan.nextInt();

        for(int i = 0; i < numOfVoters; i++) {
            System.out.println("\n[Voter " + (i+1) + "]");
            System.out.println("1. Anura\n2. Sajith\n3. Namal");
            System.out.print("~ Choose candidate (1-3) : ");
            int choice = Scan.nextInt();

            if(choice >= 1 && choice <= 3) {
                votes[choice-1]++;
            } else {
                System.out.println("[!] Invalid vote!");
            }
        }

        System.out.println("\n\n[*] ELECTION RESULTS");
        for(int i = 0; i < 3; i++) {
            System.out.println(candidates[i] + " : " + votes[i] + " votes");
            if(votes[i] > maxVote) {
                maxVote = votes[i];
                winner = candidates[i];
            }
        }

        System.out.println("\n[#] WINNER\t: " + winner);
    }
}