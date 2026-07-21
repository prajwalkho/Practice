package practice;

import java.util.Scanner;

public class policy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Applicant Name:");
        String name = sc.nextLine();

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        System.out.println("Enter Gender (Male/Female):");
        String gender = sc.next();

        System.out.println("Enter Qualification (Graduation/Masters/PostGraduation):");
        String qualification = sc.next();

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();

        System.out.println("Do you have an accompanying policy? (1-Yes, 0-No):");
        int hasPolicy = sc.nextInt();

        boolean eligible = false;

        if (hasPolicy == 1) {
            if (gender.equalsIgnoreCase("Female")) {
                // Female: at least Graduation
                if (qualification.equalsIgnoreCase("Graduation") ||
                        qualification.equalsIgnoreCase("Masters") ||
                        qualification.equalsIgnoreCase("PostGraduation")) {
                    eligible = true;
                }
            } else if (gender.equalsIgnoreCase("Male")) {
                // Male: Post-graduation or higher
                if (qualification.equalsIgnoreCase("Masters") ||
                        qualification.equalsIgnoreCase("PostGraduation")) {
                    eligible = true;
                }
            }
        }

        System.out.println("\nApplicant: " + name);
        System.out.println("Age: " + age + ", Gender: " + gender + ", Qualification: " + qualification + ", Salary: ₹" + salary);

        if (eligible) {
            System.out.println("✅ Eligible for Insurance Policy");
        } else {
            System.out.println("❌ Not Eligible for Insurance Policy");
        }

        sc.close();
    }
}
