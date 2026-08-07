package cap03;

import java.util.Scanner;

public class CoffeeOrderingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to Java Coffee!");
        System.out.println("Choose your coffee size: (S) Samll, (M) Medim, (L) Large: ");
        String size = input.nextLine().toUpperCase();

        System.out.println("Choose your coffee type: (E) Espresso, (C) Cappuccino, (L) Latte: ");
        String coffeeType = input.nextLine().toUpperCase();

        double price = 0;

        switch (size) {
            case "S":
                price += 2.50;
                break;
            case "M":
                price += 3.00;
                break;
            case "L":
                price += 3.50;
                break;
            default:
                System.out.println("Invalid size option!");
                return;
        }

        switch (coffeeType){
            case "E":
                price += 1.50;
                System.out.println("Espresso coffee selected.");
                break;
            case  "C":
                price += 2.00;
                System.out.println("Cappuccino coffee selected.");
                break;
            case "L":
                price += 2.50;
                System.out.println("Latte coffee selected.");
                break;
            default:
            System.out.println("Invalid coffee type!");
            return;
        }

        System.out.println("Your order has been confirmed!");
        System.out.println("Total amount to pay: € " + price);
    }
}
