import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;
}

public class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    students[count] = new Student();

                    System.out.print("Enter Roll Number: ");
                    students[count].rollNo = sc.nextInt();

                    sc.nextLine(); // Clear buffer

                    System.out.print("Enter Name: ");
                    students[count].name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    students[count].marks = sc.nextDouble();

                    count++;
                    System.out.println("Student record added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("\nStudent Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("----------------------------");
                            System.out.println("Roll No : " + students[i].rollNo);
                            System.out.println("Name    : " + students[i].name);
                            System.out.println("Marks   : " + students[i].marks);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int roll = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].rollNo == roll) {
                            System.out.println("\nStudent Found:");
                            System.out.println("Roll No : " + students[i].rollNo);
                            System.out.println("Name    : " + students[i].name);
                            System.out.println("Marks   : " + students[i].marks);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
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