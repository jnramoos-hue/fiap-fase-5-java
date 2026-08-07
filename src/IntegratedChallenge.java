import java.util.Scanner;

public class IntegratedChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();

        int soma = number1 + number2;
        int subtract = number1 - number2;
        int divisor = number1 / number2;
        int multiplier = number1 * number2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Divisor: " + divisor);
        System.out.println("Multiplier: " + multiplier);
    }

}
