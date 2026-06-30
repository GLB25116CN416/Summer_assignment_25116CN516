import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. What is the capital of India?",
            "2. Which language is used for Android development?",
            "3. Who is known as the Father of Java?"
        };

        String[][] options = {
            {"A. Mumbai", "B. Delhi", "C. New Delhi", "D. Kolkata"},
            {"A. Python", "B. Java", "C. C++", "D. HTML"},
            {"A. James Gosling", "B. Dennis Ritchie", "C. Bjarne Stroustrup", "D. Guido van Rossum"}
        };

        char[] answers = {'C', 'B', 'A'};
        int score = 0;

        System.out.println("===== QUIZ APPLICATION =====");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct Answer!");
                score++;
            } else {
                System.out.println("Wrong Answer!");
                System.out.println("Correct Answer: " + answers[i]);
            }
        }

        System.out.println("\n===== QUIZ COMPLETED =====");
        System.out.println("Your Score: " + score + " out of " + questions.length);

        if (score == questions.length) {
            System.out.println("Excellent!");
        } else if (score >= 2) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}