import java.util.Scanner;

public class SymmetricMatrix
 {

    // Method to check if a matrix is symmetric
    public static boolean isSymmetric(int[][] matrix, int rows, int cols) {
        // A symmetric matrix must be square
        if (rows != cols) {
            return false;
        }

        // Compare elements with their transpose counterparts
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input matrix size
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            // Validate dimensions
            if (rows <= 0 || cols <= 0) {
                System.out.println("Matrix dimensions must be positive integers.");
                return;
            }

            int[][] matrix = new int[rows][cols];

            // Input matrix elements
            System.out.println("Enter matrix elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Check and display result
            if (isSymmetric(matrix, rows, cols)) {
                System.out.println("The matrix is symmetric.");
            } else {
                System.out.println("The matrix is NOT symmetric.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
