package Task3;

import java.util.ArrayList;
import java.util.Scanner;

class Student {

    private int rollNo;
    private String name;
    private String course;
    private double marks;

    public Student(int rollNo, String name, String course, double marks) {
        setRollNo(rollNo);
        setName(name);
        setCourse(course);
        setMarks(marks);
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        if (rollNo > 0) {
            this.rollNo = rollNo;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        if (course != null && !course.trim().isEmpty()) {
            this.course = course;
        }
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo
                + ", Name: " + name
                + ", Course: " + course
                + ", Marks: " + marks;
    }
}

public class StudentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Student Registration =====");

            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            Student student = new Student(
                    rollNo,
                    name,
                    course,
                    marks
            );

            students.add(student);

            System.out.println("Student added successfully!");

            System.out.print("\nEnter 0 to stop, 1 to continue: ");
            choice = sc.nextInt();

        } while (choice != 0);

        System.out.println("\n===== Registered Students =====");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nTotal Students: " + students.size());

        sc.close();
    }
}
