package cap03;

import java.util.Scanner;

public class SelectionStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age;

        System.out.print("Enter your age: ");
        age = input.nextInt();

        if (age >= 18){
            System.out.println("Access granted! ");
        }

    }
}
