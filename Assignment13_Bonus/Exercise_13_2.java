import java.util.Scanner;
import java.util.Random;

public class Exercise_13_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What size? ");
        int size = scanner.nextInt();

        Random random = new Random();
        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix1[i][j] = random.nextInt(10);
                matrix2[i][j] = random.nextInt(10);
            }
        }

        int[][] result = addMatrix(matrix1, matrix2);

        System.out.println();
        printMatrix(matrix1);
        System.out.println("+");
        printMatrix(matrix2);
        System.out.println("=");
        printMatrix(result);
    }

    public static int[][] addMatrix(int[][] m1, int[][] m2) {
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%2d ", value);
            }
            System.out.println();
        }
    }
}
