import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
        int n = sc.nextInt();
        int arr[] = new int[n];

        int even = 0, odd = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Count = " + even);
        System.out.println("Odd Count = " + odd);
    }
}
