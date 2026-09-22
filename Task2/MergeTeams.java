package Task2;

import java.util.*;

public class MergeTeams {
    public static void main(String[] args) {
        ArrayList<String> india = new ArrayList<>(Arrays.asList("Virat", "Rohit", "Dhoni"));
        ArrayList<String> australia = new ArrayList<>(Arrays.asList("Smith", "Warner", "Maxwell"));
        ArrayList<String> england = new ArrayList<>(Arrays.asList("Stokes", "Root", "Buttler"));

        ArrayList<String> rcb = new ArrayList<>();
        rcb.addAll(india);
        rcb.addAll(australia);
        rcb.addAll(england);

        System.out.println("RCB Combined Squad: " + rcb);
        System.out.println("Total Players: " + rcb.size());
    }
}
