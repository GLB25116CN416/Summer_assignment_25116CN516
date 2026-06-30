import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;
    double hra, da, pf, netSalary;
}

public class SalaryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.empId = sc.nextInt();

        sc.nextLine(); // Clear buffer

        System.out.print("Enter Employee Name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        emp.basicSalary = sc.nextDouble();

        // Salary Calculations
        emp.hra = emp.basicSalary * 0.20; // 20% HRA
        emp.da = emp.basicSalary * 0.10;  // 10% DA
        emp.pf = emp.basicSalary * 0.05;  // 5% PF

        emp.netSalary = emp.basicSalary + emp.hra + emp.da - emp.pf;

        // Display Details
        System.out.println("\n===== Salary Details =====");
        System.out.println("Employee ID   : " + emp.empId);
        System.out.println("Employee Name : " + emp.name);
        System.out.println("Basic Salary  : " + emp.basicSalary);
        System.out.println("HRA (20%)     : " + emp.hra);
        System.out.println("DA (10%)      : " + emp.da);
        System.out.println("PF (5%)       : " + emp.pf);
        System.out.println("Net Salary    : " + emp.netSalary);

        sc.close();
    }
}