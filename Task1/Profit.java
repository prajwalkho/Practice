package Task1;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        double profit = sp - cp;
        if(profit<0) {
        	System.out.println("Loss = " + profit);
        }
        else {
        	System.out.println("Profit = " + profit); 
        	}
    }
}
