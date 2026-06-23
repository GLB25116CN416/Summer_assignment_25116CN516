import java.util.Scanner;

public class PalindromeFunction {
    static boolean isPalindrome(int n) {
        int original = n, reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPalindrome(n))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome Number");
    }
}