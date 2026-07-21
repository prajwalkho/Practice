package practice;

import java.util.Scanner;

public class MobileNumberAnalysis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mobile number:");
        long mobile = sc.nextLong();   // use long for 10-digit numbers

        int countOdd = 0, countEven = 0;
        int rem;

        long n = mobile;
        while (n > 0) {
            rem = (int)(n % 10);
            if (rem % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            n = n / 10;
        }

        System.out.println("Count of odd digits: " + countOdd);
        System.out.println("Count of even digits: " + countEven);

        // Decide which type of number it is
        if (countOdd > countEven) {
            System.out.println("Your number has more odd digits.");
        } else if (countEven > countOdd) {
            System.out.println("Your number has more even digits.");
        } else {
            System.out.println("Your number has equal odd and even digits.");
        }
    }
}
