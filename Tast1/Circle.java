package Tast1;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
