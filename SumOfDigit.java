package practice;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int sumOdd = 0;
        int sumEven = 0;
        int rem;

        while (n > 0) {
            rem = n % 10;
            if (rem % 2 == 0) {   // even digit
                sumEven += rem;
            } else {              // odd digit
                sumOdd += rem;
            }
            n = n / 10;
        }

        System.out.println("Sum of odd digits is " + sumOdd);
        System.out.println("Sum of even digits is " + sumEven);

    }
}
