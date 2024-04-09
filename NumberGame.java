import java.util.Scanner;
import java.util.Random;
public class number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5; // Limiting the number of attempts
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Game!");

        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("select a number between " + minRange + " and " + maxRange + ". Try to guess it!");

            int attempts = 0;
            boolean guessedCorrectly = false;
            while (!guessedCorrectly && attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    guessedCorrectly = true;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The number was: " + randomNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next();
            if (!playChoice.equalsIgnoreCase("yes")) {
                playAgain = false;
                System.out.println("Thank you for playing! Your total score is: " + score);
            }
        }
        scanner.close();
    }
}
