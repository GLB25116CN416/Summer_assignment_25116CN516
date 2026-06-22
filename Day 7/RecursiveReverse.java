import java.util.Scanner;

public class RecursiveReverse {

    static int reverse = 0;

    static void reverseNumber(int n) {
        if (n == 0)
            return;

        reverse = reverse * 10 + n % 10;
        reverseNumber(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        reverseNumber(n);

        System.out.println("Reversed Number = " + reverse);
    }
}