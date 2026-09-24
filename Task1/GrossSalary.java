package Task1;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double da = 0.20 * basic;
        double hra = 0.30 * basic;
        double gross = basic + da + hra;

        System.out.println("Gross Salary = " + gross);
    }
}

