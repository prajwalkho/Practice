package practice;
import java.util.Scanner;
public class interact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal:");
        int p = sc.nextInt();

        System.out.println("Enter Number of years:");
        int n = sc.nextInt();

        System.out.println("Enter Rate of Interest:");
        double r = sc.nextDouble();

        double si = (p * n * r) / 100;
        System.out.println("Simple Interest is " + si);

        double f = si + p;
        System.out.println("Final Amount is " + f);

    }
}
