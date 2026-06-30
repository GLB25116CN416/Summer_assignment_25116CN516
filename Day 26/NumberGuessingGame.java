import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        char playAgain;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("I have a number between 1 and 100... Can you guess it?");

        do {
            int numberToGuess = rand.nextInt(100) + 1; // Random number between 1–100
            int attempts = 0;
            int maxAttempts = 7;
            boolean isCorrect = false;

            System.out.println("\nYou have " + maxAttempts + " attempts to guess the number!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess;

                // Input validation
                try {
                    guess = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("❌ Invalid input! Please enter an integer.");
                    sc.next(); // Clear invalid input
                    continue;
                }

                if (guess < 1 || guess > 100) {
                    System.out.println("⚠ Please enter a number between 1 and 100.");
                    continue;
                }

                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("✅ Correct! You guessed it in " + attempts + " attempts!");
                    totalScore += (maxAttempts - attempts + 1) * 10; // Score formula
                    isCorrect = true;
                    break;
                } else if (guess > numberToGuess) {
                    System.out.println("📉 Too high! Try again.");
                } else {
                    System.out.println("📈 Too low! Try again.");
                }
            }

            if (!isCorrect) {
                System.out.println("❌ Out of attempts! The correct number was: " + numberToGuess);
            }

            System.out.print("\nDo you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("\n🎉 Game Over! Your Total Score: " + totalScore);
        System.out.println("Thanks for playing!");
        sc.close();
    }
}

