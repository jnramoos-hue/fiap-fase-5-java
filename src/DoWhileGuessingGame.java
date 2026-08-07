import java.util.Random;
import java.util.Scanner;

public class DoWhileGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");

        Random random = new Random();


        int secretNumber = random.nextInt(10) + 1;
        int attempts = 0;
        int guess;

        System.out.println("Try to guess the scret number between 1 and 10.");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == secretNumber){
                System.out.println(

                )
            }
        }
    }
}
