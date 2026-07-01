import java.util.Scanner;

class TicketBooking {
    int totalSeats = 50;
    int bookedSeats = 0;

    // Book Ticket
    void bookTicket(int seats) {
        if (seats <= (totalSeats - bookedSeats)) {
            bookedSeats += seats;
            System.out.println(seats + " Ticket(s) Booked Successfully!");
        } else {
            System.out.println("Sorry! Not enough seats available.");
        }
    }

    // Cancel Ticket
    void cancelTicket(int seats) {
        if (seats <= bookedSeats) {
            bookedSeats -= seats;
            System.out.println(seats + " Ticket(s) Cancelled Successfully!");
        } else {
            System.out.println("Invalid number of tickets to cancel.");
        }
    }

    // Display Status
    void displayStatus() {
        System.out.println("\n----- Ticket Details -----");
        System.out.println("Total Seats     : " + totalSeats);
        System.out.println("Booked Seats    : " + bookedSeats);
        System.out.println("Available Seats : " + (totalSeats - bookedSeats));
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketBooking ticket = new TicketBooking();

        int choice;

        do {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Seat Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of tickets to book: ");
                    int book = sc.nextInt();
                    ticket.bookTicket(book);
                    break;

                case 2:
                    System.out.print("Enter number of tickets to cancel: ");
                    int cancel = sc.nextInt();
                    ticket.cancelTicket(cancel);
                    break;

                case 3:
                    ticket.displayStatus();
                    break;

                case 4:
                    System.out.println("Thank you for using the Ticket Booking System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}