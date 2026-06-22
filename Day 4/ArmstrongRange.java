import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start: ");
        int start = sc.nextInt();

        System.out.println("Enter end: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == num)
                System.out.println(num + " ");
        }
    }
}