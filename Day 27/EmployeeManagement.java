import java.util.Scanner;

class Employee {
    int empId;
    String name;
    String department;
    double salary;
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    emp[count] = new Employee();

                    System.out.print("Enter Employee ID: ");
                    emp[count].empId = sc.nextInt();

                    sc.nextLine(); // Clear buffer

                    System.out.print("Enter Employee Name: ");
                    emp[count].name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    emp[count].department = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    emp[count].salary = sc.nextDouble();

                    count++;
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\nEmployee Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("----------------------------");
                            System.out.println("Employee ID : " + emp[i].empId);
                            System.out.println("Name        : " + emp[i].name);
                            System.out.println("Department  : " + emp[i].department);
                            System.out.println("Salary      : " + emp[i].salary);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int id = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (emp[i].empId == id) {
                            System.out.println("\nEmployee Found:");
                            System.out.println("Employee ID : " + emp[i].empId);
                            System.out.println("Name        : " + emp[i].name);
                            System.out.println("Department  : " + emp[i].department);
                            System.out.println("Salary      : " + emp[i].salary);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}