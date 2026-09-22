package Task2;

import java.util.*;

public class IPLTeams {
    public static void main(String[] args) {
        ArrayList<String> mi = new ArrayList<>(Arrays.asList("Rohit", "Bumrah", "Pollard"));
        ArrayList<String> csk = new ArrayList<>(Arrays.asList("Dhoni", "Raina", "Jadeja"));

        ArrayList<ArrayList<String>> ipl = new ArrayList<>();
        ipl.add(mi);
        ipl.add(csk);

        System.out.println("IPL Teams:");
        for (ArrayList<String> team : ipl) {
            System.out.println(team);
        }
    }
}

