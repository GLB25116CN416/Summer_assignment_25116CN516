import java.util.Scanner;

public class DiagonalSum {

    // Method to calculate the sum of both diagonals
    public static int diagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Principal diagonal element: row == column
            sum += matrix[i][i];

            // Secondary diagonal element: row + column == n - 1
            if (i != n - 1 - i) { // Avoid double-counting the center in odd-sized matrices
                sum += matrix[i][n - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter size of square matrix (n): ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Matrix size must be positive.");
                return;
            }

            int[][] matrix = new int[n][n];
            System.out.println("Enter " + (n * n) + " elements:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            int result = diagonalSum(matrix);
            System.out.println("Sum of both diagonals: " + result);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
