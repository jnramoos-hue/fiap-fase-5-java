package cap03;

public class CountdownWithForLoop {
    public static void main(String[] args) {
        System.out.println("Countdown:");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("End of the countdown!");
    }
}