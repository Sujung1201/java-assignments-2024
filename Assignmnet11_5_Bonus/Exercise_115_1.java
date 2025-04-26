import java.util.Scanner;

public class Exercise_115_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println("\nSum: " + gauss(n));
    }

    public static int gauss(int n) {
        return n * (n + 1) / 2;
    }
}