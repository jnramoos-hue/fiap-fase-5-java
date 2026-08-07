import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(20) + 1; // Generates a random number betwenn 1 and 20

        System.out.println("Welcome to the guessing game!");
        System.out.println("Try to guess the number between 1 and 20.");

        int attempts = 0;
        boolean guessed = false;

        while (!guessed) {
            System.out.println("Enter your guess: ");
            int guess =  input.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! Your guessed the number in " + attempts + " attempts.");
                guessed = true;
            } else if (guess < secretNumber) {
                System.out.println("Try a higuer number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }
        input.close();
    }

}
