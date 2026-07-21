package practice;
import java.util.Scanner;
public class SumAndCountDigits {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number:");
                int n = sc.nextInt();

                int sumOdd = 0, sumEven = 0;
                int countOdd = 0, countEven = 0;
                int rem;

                while (n > 0) {
                    rem = n % 10;
                    if (rem % 2 == 0) {   // even digit
                        sumEven += rem;
                        countEven++;
                    } else {              // odd digit
                        sumOdd += rem;
                        countOdd++;
                    }
                    n = n / 10;
                }

                System.out.println("Sum of odd digits is " + sumOdd);
                System.out.println("Sum of even digits is " + sumEven);
                System.out.println("Count of odd digits is " + countOdd);
                System.out.println("Count of even digits is " + countEven);
            }
        }

