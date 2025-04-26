import java.util.Scanner;
import java.util.Random;

public class Exercise_135_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = scanner.nextInt();

        int[][] original = createRandomMatrix(size);

        System.out.println("\nOriginal Image:");
        printMatrix(original);

        int[][] padded = samePadMatrix(original);

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

    public static int[][] samePadMatrix(int[][] original) {
        int size = original.length;
        int[][] padded = new int[size + 2][size + 2];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                padded[i + 1][j + 1] = original[i][j];
            }
        }

        for (int i = 0; i < padded.length; i++) {
            padded[i][0] = padded[i][1];
            padded[i][padded.length - 1] = padded[i][padded.length - 2];
        }
        for (int j = 0; j < padded[0].length; j++) {
            padded[0][j] = padded[1][j];
            padded[padded.length - 1][j] = padded[padded.length - 2][j];
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
