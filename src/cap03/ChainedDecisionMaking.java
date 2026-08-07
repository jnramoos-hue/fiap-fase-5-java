package cap03;

import java.util.Scanner;

public class ChainedDecisionMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double purchaseAmount;
        int frequency;

        System.out.println("Enter the total amount of your purchases at the store this year:");
        purchaseAmount = sc.nextDouble();
        System.out.println("How many times did you make a purchase at the store this year?");
        frequency = sc.nextInt();

        if (purchaseAmount >= 2000.0 && frequency >= 10) {
            System.out.println("Congratulations! You are in the VIP category and received a discount voucher.");
        } else if (purchaseAmount >= 1000.0) {
            System.out.println("You are in the Gold category and received extra points in the loyalty program.");
        } else if (purchaseAmount >= 500.0 || frequency >= 5) {
            System.out.println("You are in the Silver category and received a special gift.");
        } else {
            System.out.println("You are in the Bronze category and did not receive a reward.");
        }
    }
}