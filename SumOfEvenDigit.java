package practice;

import  java.util.Scanner;
public class SumOfEvenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mobile number:");
        int n = sc.nextInt();
        int sum = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            if (rem % 2 == 0) {   // check if digit is even
                sum += rem;
            }
            n = n / 10;
        }

        System.out.println("Sum of even digits is " + sum);
        }

    }



