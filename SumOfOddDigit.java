package practice;

import java.util.Scanner;

public class SumOfOddDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int sum = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            if (rem % 2 != 0) {
                sum = sum + rem;
            }
            n = n / 10;
        }

        System.out.println("Sum of odd digits is " + sum);
    }
}
