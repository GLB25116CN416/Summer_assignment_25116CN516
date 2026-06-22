import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        if (n == 1)
            System.out.println(a);
        else if (n == 2)
            System.out.println(b);
        else {
            int c = 0;

            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println("Nth Fibonacci Term = " + c);
        }
    }
}
