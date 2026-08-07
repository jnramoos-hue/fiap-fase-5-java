package cap03;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nMultiplication table of " + i + ":");

            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
        }
    }
}