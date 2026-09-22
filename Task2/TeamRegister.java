package Task2;

import java.util.*;

class Player {
    int jerseyNo;
    String name;
    int matches;
    int runs;

    Player(int jerseyNo, String name, int matches, int runs) {
        this.jerseyNo = jerseyNo;
        this.name = name;
        this.matches = matches;
        this.runs = runs;
    }

    public String toString() {
        return jerseyNo + " - " + name + " | Matches: " + matches + " | Runs: " + runs;
    }
}

public class TeamRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Player> squad = new ArrayList<>();

        int cont;
        do {
            System.out.print("Enter Jersey No: ");
            int jno = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Number of Matches: ");
            int matches = sc.nextInt();
            System.out.print("Enter Runs: ");
            int runs = sc.nextInt();

            squad.add(new Player(jno, name, matches, runs));

            System.out.print("Enter 0 to stop, 1 to continue: ");
            cont = sc.nextInt();
        } while (cont != 0);

        System.out.println("\nFull Squad:");
        for (Player p : squad) {
            System.out.println(p);
        }
    }
}
