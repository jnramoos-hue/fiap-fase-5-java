package cap03;

import java.util.Scanner;

public class SelectionStatementWithLogicalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean sunny, weekend;

        // Receive information from the user about the conditions
        System.out.print("Is it sunny? (true for yes / false for no): ");
        sunny = scanner.nextBoolean();

        System.out.print("Is it the weekend? (true for yes / false for no): ");
        weekend = scanner.nextBoolean();

        // Check the conditions to decide the destination
        if (sunny && weekend) {
            System.out.println("Let's go to the beach and enjoy the sunshine!");
        }

        scanner.close();
    }
}