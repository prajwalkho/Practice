package Task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Prajwal", "IT", 255000));
        employees.add(new Employee(102, "Rahul", "HR", 158000));
        employees.add(new Employee(103, "Sneha", "Finance", 25000));
        employees.add(new Employee(104, "Amit", "IT", 125000));
        employees.add(new Employee(105, "Priya", "Marketing", 62000));
        employees.add(new Employee(106, "Kiran", "Sales", 135000));
        employees.add(new Employee(107, "Neha", "IT", 48000));
        employees.add(new Employee(108, "Rohan", "Finance", 72000));
        employees.add(new Employee(109, "Anjali", "HR", 31000));
        employees.add(new Employee(110, "Vikas", "Sales", 27000));
        employees.add(new Employee(111, "Pooja", "IT", 158000));
        employees.add(new Employee(112, "Akash", "Marketing", 42000));
        employees.add(new Employee(113, "Megha", "Finance", 68000));
        employees.add(new Employee(114, "Suresh", "HR", 129000));
        employees.add(new Employee(115, "Kavya", "IT", 75000));
        employees.add(new Employee(116, "Arjun", "Sales", 139000));
        employees.add(new Employee(117, "Divya", "Finance", 52000));
        employees.add(new Employee(118, "Manoj", "Marketing", 33000));
        employees.add(new Employee(119, "Riya", "IT", 61000));
        employees.add(new Employee(120, "Nikhil", "HR", 26000));
        employees.add(new Employee(121, "Swati", "Finance", 80000));
        employees.add(new Employee(122, "Vivek", "Sales", 44000));
        employees.add(new Employee(123, "Aishwarya", "IT", 57000));
        employees.add(new Employee(124, "Ramesh", "Marketing", 130000));
        employees.add(new Employee(125, "Shreya", "Finance", 69000));
        int choice;
        
        do {
            System.out.println();
            System.out.println("========== Employee Management System ==========");
            System.out.println("1. Display all employees");
            System.out.println("2. Search employee");
            System.out.println("3. Remove employees with salary below 30000");
            System.out.println("4. Traverse using Iterator");
            System.out.println("5. Traverse forward using ListIterator");
            System.out.println("6. Traverse backward using ListIterator");
            System.out.println("7. Update employee");
            System.out.println("8. Add employee");
            System.out.println("9. Remove employee");
            System.out.println("10. Display employee with highest salary");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        System.out.println("\n----- All Employees -----");
                        for (Employee emp : employees) {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (Employee emp : employees) {
                        if (emp.getId() == searchId) {
                            System.out.println("Employee found:");
                            System.out.println(emp);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    Iterator<Employee> iterator = employees.iterator();
                    int removedCount = 0;
                    while (iterator.hasNext()) {
                        Employee emp = iterator.next();
                        if (emp.getSalary() < 30000) {
                            iterator.remove();
                            removedCount++;
                        }
                    }
                    System.out.println( removedCount + " employee(s) removed.");
                    break;

                case 4:
                    System.out.println("\n----- Traversing using Iterator -----");
                    Iterator<Employee> itr = employees.iterator();
                    while (itr.hasNext()) {
                        Employee emp = itr.next();
                        System.out.println(emp);
                    }
                    break;

                case 5:
                    System.out.println( "\n----- Forward Traversal using ListIterator -----" );
                    ListIterator<Employee> forwardIterator = employees.listIterator();
                    while (forwardIterator.hasNext()) {
                        Employee emp = forwardIterator.next();
                        System.out.println(emp);
                    }
                    break;

                case 6:
                    System.out.println( "\n----- Backward Traversal using ListIterator -----" );
                    ListIterator<Employee> backwardIterator = employees.listIterator(employees.size());
                    while (backwardIterator.hasPrevious()) {
                        Employee emp = backwardIterator.previous();
                        System.out.println(emp);
                    }
                    break;

                case 7:
                    System.out.print("Enter employee ID to update: ");
                    int updateId = sc.nextInt();
                    boolean updateFound = false;
                    ListIterator<Employee> updateIterator = employees.listIterator();

                    while (updateIterator.hasNext()) {
                        Employee oldEmployee = updateIterator.next();
                        if (oldEmployee.getId() == updateId) {
                            sc.nextLine();

                            System.out.print("Enter new name: ");
                            String newName = sc.nextLine();

                            System.out.print("Enter new department: ");
                            String newDepartment = sc.nextLine();

                            System.out.print("Enter new salary: ");
                            double newSalary = sc.nextDouble();

                            Employee updatedEmployee =new Employee( updateId,newName,newDepartment, newSalary);
                            updateIterator.set(updatedEmployee);
                            updateFound = true;
                            System.out.println("Employee updated successfully.");
                            break;
                        }
                    }
                    if (!updateFound) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 8:
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter employee name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();

                    Employee newEmployee =new Employee(id, name, department, salary);
                    employees.add(newEmployee);
                    System.out.println("Employee added successfully.");
                    break;
                    
                case 9:
                    System.out.print("Enter employee ID to remove: ");
                    int removeId = sc.nextInt();
                    boolean removeFound = false;                    
                    ListIterator<Employee> removeIterator = employees.listIterator();
                    
                    while (removeIterator.hasNext()) {
                        Employee emp = removeIterator.next();
                        if (emp.getId() == removeId) {                            
                            removeIterator.remove();
                            removeFound = true;
                            System.out.println("Employee removed successfully.");
                            break;
                        }
                    }
                    if (!removeFound) {
                        System.out.println("Employee not found.");
                    }
                    break;
               
                case 10:
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        Employee highestSalaryEmployee =employees.get(0);
                        for (Employee emp : employees) {
                            if (emp.getSalary()> highestSalaryEmployee.getSalary()) {
                                highestSalaryEmployee = emp;
                            }
                        }
                        System.out.println("\n----- Employee with Highest Salary -----" );
                        System.out.println(highestSalaryEmployee);
                    }
                    break;   
                    
                case 11:
                    System.out.println( "Thank you! Exiting Employee Management System...");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please enter 1 to 11.");
            }
        } while (choice != 11);
        sc.close();
    }
}