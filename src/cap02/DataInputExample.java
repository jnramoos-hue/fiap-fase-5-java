package cap02;

import java.util.Scanner;

public class DataInputExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product name: ");
        String ProductName = sc.nextLine();

        System.out.println("Enter the product price: ");
        String ProductPrice = sc.nextLine();

        System.out.println("Enter the product quantity: ");
        String ProductQuantity = sc.nextLine();

        System.out.println("Product: " + ProductName + " Price: " + ProductPrice + " Quantity: " + ProductQuantity);

        sc.close();

    }
}
