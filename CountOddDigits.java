package practice;

import java.util.Scanner;

public class CountOddDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mobile number:");
        long n = sc.nextLong();   // use long for 10-digit numbers

        int countOdd = 0;
        int rem;
        while (n > 0) {
            rem = (int)(n % 10);
            if (rem % 2 != 0) {   // odd digit
                countOdd++;
            }
            n = n / 10;
        }

        System.out.println("Count of odd digits: " + countOdd);
    }
}
