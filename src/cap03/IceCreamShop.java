package cap03;

import java.util.Scanner;

public class IceCreamShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int iceCreamQuantity = 0;
        double totalAmount = 0;
        double iceCreamPrice = 0;
        boolean finishOrder = false;

        System.out.println("Welcome to the Ice Cream Shop!");

        while (!finishOrder) {
            System.out.println("\nIce Cream Options:");
            System.out.println("1. One-scoop ice cream cone - R$6.00");
            System.out.println("2. Two-scoop ice cream cone - R$9.00");
            System.out.println("3. Two-scoop filled waffle cone - R$12.00");
            System.out.print(
                    "Choose an ice cream option or enter 0 to finish the order: "
            );

            int option = scanner.nextInt();

            switch (option) {
                case 0:
                    finishOrder = true;
                    break;
                case 1:
                    iceCreamPrice = 6.00;
                    break;
                case 2:
                    iceCreamPrice = 9.00;
                    break;
                case 3:
                    iceCreamPrice = 12.00;
                    break;
                default:
                    System.out.println("Invalid option. Choose a valid number.");
                    break;
            }

            if (option >= 1 && option <= 3) {
                System.out.print("How many units of this ice cream would you like? ");
                int quantity = scanner.nextInt();

                iceCreamQuantity += quantity;
                totalAmount += iceCreamPrice * quantity;

                for (int i = 0; i < quantity; i++) {
                    System.out.print("Would you like a topping? 1 - Yes, 2 - No: ");
                    int toppingChoice = scanner.nextInt();

                    if (toppingChoice == 1) {
                        System.out.println("Topping Options:");
                        System.out.println("1. Chocolate - R$2.00");
                        System.out.println("2. Strawberry - R$2.00");
                        System.out.println("3. Hazelnut - R$3.00");
                        System.out.print("Choose a topping option: ");

                        int toppingOption = scanner.nextInt();

                        switch (toppingOption) {
                            case 1:
