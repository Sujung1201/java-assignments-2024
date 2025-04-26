import java.util.Scanner;
import java.util.Random;

public class Exercise_125_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Size: ");
        int size = scanner.nextInt();

        int[] vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = random.nextInt(10);
        }

        System.out.print("Random Vector: [");
        for (int i = 0; i < size; i++) {
            System.out.print(vector[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
