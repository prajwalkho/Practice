package Task3;

import java.util.ArrayList;

class Employee {

    private int empId;
    private String name;
    private String role;
    private int experience;

    public Employee(int empId, String name, String role, int experience) {
        setEmpId(empId);
        setName(name);
        setRole(role);
        setExperience(experience);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        if (empId > 0) {
            this.empId = empId;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if (role != null && !role.trim().isEmpty()) {
            this.role = role;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience >= 0) {
            this.experience = experience;
        }
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId
                + ", Name: " + name
                + ", Role: " + role
                + ", Experience: " + experience + " years";
    }
}

public class EmployeeApp {

    public static void main(String[] args) {

        ArrayList<Employee> developers = new ArrayList<>();

        developers.add(
                new Employee(101, "Alice", "Developer", 3)
        );

        developers.add(
                new Employee(102, "Bob", "Developer", 1)
        );

        developers.add(
                new Employee(103, "Charlie", "Developer", 4)
        );

        ArrayList<Employee> testers = new ArrayList<>();

        testers.add(
                new Employee(201, "David", "Tester", 2)
        );

        testers.add(
                new Employee(202, "Eva", "Tester", 5)
        );

        testers.add(
                new Employee(203, "Frank", "Tester", 1)
        );

        ArrayList<Employee> designers = new ArrayList<>();

        designers.add(
                new Employee(301, "Grace", "Designer", 3)
        );

        designers.add(
                new Employee(302, "Hank", "Designer", 2)
        );

        designers.add(
                new Employee(303, "Ivy", "Designer", 4)
        );

        ArrayList<Employee> projectTeam = new ArrayList<>();

        projectTeam.addAll(developers);
        projectTeam.addAll(testers);
        projectTeam.addAll(designers);

        System.out.println("===== PROJECT TEAM =====");

        for (Employee employee : projectTeam) {
            System.out.println(employee);
        }

        System.out.println(
                "\nTotal Team Members: " + projectTeam.size()
        );

        System.out.println("\n===== TEAM MEMBER NAMES =====");

        for (Employee employee : projectTeam) {
            System.out.println(employee.getName());
        }

        System.out.println(
                "\n===== EXPERIENCE MORE THAN 2 YEARS ====="
        );

        for (Employee employee : projectTeam) {

            if (employee.getExperience() > 2) {
                System.out.println(employee);
            }
        }
    }
}


