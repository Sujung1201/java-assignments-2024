import java.util.Scanner;

public class Exercise_12_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nMinimum: " + minimum(numbers));
    }

    public static int minimum(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
