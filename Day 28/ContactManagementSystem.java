import java.util.Scanner;

class Contact {
    String name;
    String phone;
}

public class ContactManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Contact contacts[] = new Contact[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    contacts[count] = new Contact();

                    System.out.print("Enter Name: ");
                    contacts[count].name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    contacts[count].phone = sc.nextLine();

                    count++;
                    System.out.println("Contact Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (contacts[i].name.equalsIgnoreCase(search)) {
                            System.out.println("\nContact Found");
                            System.out.println("Name  : " + contacts[i].name);
                            System.out.println("Phone : " + contacts[i].phone);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact Not Found!");
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No Contacts Available.");
                    } else {
                        System.out.println("\n----- Contact List -----");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". Name : " + contacts[i].name);
                            System.out.println("   Phone: " + contacts[i].phone);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Contact Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
