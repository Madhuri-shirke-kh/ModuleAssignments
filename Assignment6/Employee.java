import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
   
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0;

   
    private int employeeID;
    private String name;
    private double salary;

   
    static {
        totalEmployees = 0;
        totalSalaryExpense = 0;
    }

   
    public Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;

        totalEmployees++; 
        totalSalaryExpense += salary; 
    }

    
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    
    public static void applyRaise(double percentage, ArrayList<Employee> employees) {
        for (Employee emp : employees) {
            double raiseAmount = emp.salary * (percentage / 100);
            emp.updateSalary(emp.salary + raiseAmount); 
        }
    }

    
    public void updateSalary(double newSalary) {
       
        totalSalaryExpense = totalSalaryExpense - this.salary + newSalary;
        this.salary = newSalary;
    }

    
    public int getEmployeeID() {
        return employeeID;
    }

    
    public String getName() {
        return name;
    }

    
    public double getSalary() {
        return salary;
    }

    
    
    public String toString() {
        return "Employee [ID=" + employeeID + ", Name=" + name + ", Salary=" + salary + "]";
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();

        
        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add new employee");
            System.out.println("2. Display total number of employees");
            System.out.println("3. Apply raise to all employees");
            System.out.println("4. Display total salary expense");
            System.out.println("5. Update individual employee salary");
            System.out.println("6. Display all employees");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    Employee employee = new Employee(id, name, salary);
                    employeeList.add(employee);
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    System.out.println("Total number of employees: " + Employee.getTotalEmployees());
                    break;

                case 3:
                    System.out.print("Enter raise percentage: ");
                    double percentage = scanner.nextDouble();
                    Employee.applyRaise(percentage, employeeList);
                    System.out.println("Raise applied to all employees.");
                    break;

                case 4:
                    System.out.println("Total salary expense: $" + Employee.calculateTotalSalaryExpense());
                    break;

                case 5: 
                    System.out.print("Enter employee ID to update salary: ");
                    int updateID = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    boolean found = false;
                    for (Employee emp : employeeList) {
                        if (emp.getEmployeeID() == updateID) {
                            emp.updateSalary(newSalary);
                            System.out.println("Salary updated successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee with ID " + updateID + " not found.");
                    }
                    break;

                case 6: 
                    System.out.println("Employee List:");
                    for (Employee emp : employeeList) {
                        System.out.println(emp);
                    }
                    break;

                case 7: 
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}