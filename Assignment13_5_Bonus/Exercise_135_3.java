import java.util.Scanner;
import java.util.Random;

public class Exercise_135_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = scanner.nextInt();
        System.out.print("Enter Padding: ");
        int padding = scanner.nextInt();

        int[][] original = createRandomMatrix(size);

        System.out.println("\nOriginal Image:");
        printMatrix(original);

        int[][] padded = arbitraryZeroPadMatrix(original, padding);

        System.out.println("\nPadded Image:");
        printMatrix(padded);
    }

    public static int[][] createRandomMatrix(int size) {
        Random random = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] arbitraryZeroPadMatrix(int[][] original, int padding) {
        int size = original.length;
        int newSize = size + 2 * padding;
        int[][] padded = new int[newSize][newSize];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                padded[i + padding][j + padding] = original[i][j];
            }
        }
        return padded;
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
