import java.util.Scanner;
import java.util.Random;

public class Exercise_13_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What size? ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        System.out.println("\nRandom Matrix:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
