package cap03;

import java.util.Scanner;

public class ClassGradeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalStudents = 10;
        double sumOfGrades = 0;

        System.out.println("Enter the grades of the " + totalStudents + " students:");

        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Grade for student " + i + ": ");
            double grade = scanner.nextDouble();
            sumOfGrades += grade;
        }

        double classAverage = sumOfGrades / totalStudents;

        System.out.println("\nThe class grade average is: " + classAverage);

        scanner.close();
    }
}