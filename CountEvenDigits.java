package practice;

import java.util.Scanner;

public class CountEvenDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mobile number:");
        long n = sc.nextLong();  

        int countEven = 0;
        int rem;

        while (n > 0) {
            rem = (int)(n % 10);
            if (rem % 2 == 0) {
                countEven++;
            }
            n = n / 10;
        }

        System.out.println("Count of even digits: " + countEven);
    }
}
