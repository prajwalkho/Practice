package Task1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (years): ");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
        
        double f = (si+p);
        System.out.println("Final Amounts = " + f);
    }
}
