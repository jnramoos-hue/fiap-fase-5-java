import java.util.Scanner;

public class CafeJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Java Coffee!");

        double totalAmount = 0;
        int coffeeQuantity = 0;
        boolean contenueOrdering = true;

        while (contenueOrdering) {
            System.out.println("Choose your coffe size: (S) Small, (M) Medium, (L) Large");
            String coffeeSize = sc.nextLine().toUpperCase();

            if (coffeeSize.equals("F")){
                contenueOrdering = false;
            } else{
                System.out.println("Choose your coffee type: (E) Espresso, (C) Capuccino, (L) Latte");
                String coffeeType = sc.nextLine().toUpperCase();

                double price = 0;

                switch (coffeeSize) {
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
                            System.out.println("Invalid coffee size!");
                            continue;
                }

                switch (coffeeType) {
                    case "E":
                        price += 1.50;
                        System.out.println("Espresso coffee selected.");
                        break;
                    case "C":
                        price += 2.00;
                        System.out.println("Espresso coffee selected.");
                        break;
                    case "L":
                        price += 2.50;
                        System.out.println("Espresso coffee selected.");
                        break;
                    default:
                        System.out.println("Invalid coffee type!");
                        continue;
                }

                totalAmount += price;
                coffeeQuantity++;

                System.out.println("Coffee added to the order!");
            }

        }

        System.out.println("Your order has been completed. Total amount to pay: € " + totalAmount + ".");
        System.out.println("Number of coffees ordered: " + coffeeQuantity);

        sc.close();
    }
}
