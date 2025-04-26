import java.util.Scanner;

public class Exercise_10_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < (height - i) * 3; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.printf("%3d", j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.printf("%3d", j);
            }

            System.out.println();
        }
    }
}