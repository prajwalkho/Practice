package practice;

import java.util.Scanner;

public class MobileNumberType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mobile number:");
        long n = sc.nextLong();

        int countOdd = 0, countEven = 0;
        int rem;

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

        if (countOdd > countEven) {
            System.out.println("Your number is Odd-type (more odd digits).");
        } else if (countEven > countOdd) {
            System.out.println("Your number is Even-type (more even digits).");
        } else {
            System.out.println("Your number is Balanced (equal odd and even digits).");
        }
    }
}
