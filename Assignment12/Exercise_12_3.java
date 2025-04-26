import java.util.Scanner;

public class Exercise_12_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int[] distinct = new int[n];
        int count = 0;

        System.out.print("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            if (!isIn(numbers[i], distinct)) {
                distinct[count++] = numbers[i];
            }
        }

        System.out.print("\nDistinct numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinct[i] + " ");
        }
    }

    public static boolean isIn(int number, int[] array) {
        for (int value : array) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }
}
