
import java.util.Scanner;

public class Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary number: ");
        long binary = sc.nextLong();

        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            long digit = binary % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            binary /= 10;
        }

        System.out.println("Decimal = " + decimal);
    }
}