import java.util.Scanner;

public class IntegratedChallenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's first grade: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the student's second grade: ");
        int num2 = sc.nextInt();

        float media = (num1 + num2) / 2;

        System.out.println("The student's average is: " + media);

        if (media >= 5) {
            System.out.println("Student Approved! ");
        }
        else {
            System.out.println("Student Not Approved! ");
        }


    }
}
