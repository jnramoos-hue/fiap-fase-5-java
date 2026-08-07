package cap03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to calculator!");
        System.out.println("Please choose an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = input.nextInt();

        System.out.println("Enter two numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = number1 + number2;
                System.out.println("Addition result:" + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Subtraction result:" + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Multiplication result:" + result);
                break;
            case 4:
                if (number2 != 0){
                    result = number1 / number2;
                    System.out.println("Division result:" + result);
                } else {
                    System.out.println("Division by zero is not allowed!");
                }
                break;
            default:
                System.out.println("Invalid operation2!");
        }
    }
}