import java.util.Scanner;

public class Exercise_11_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        System.out.println();
        for (int i = 1; i <= number; i++) {
            System.out.printf("P(%d) = %d\n", i, pentagonal(i));
        }
    }

    public static int pentagonal(int n) {
        return n * (3 * n - 1) / 2;
    }
}
