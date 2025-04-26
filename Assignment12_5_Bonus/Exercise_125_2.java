import java.util.Scanner;
import java.util.Random;

public class Exercise_125_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Size: ");
        int size = scanner.nextInt();

        int[] vectorA = new int[size];
        int[] vectorB = new int[size];
        int[] vectorC = new int[size];

        for (int i = 0; i < size; i++) {
            vectorA[i] = random.nextInt(10);
            vectorB[i] = random.nextInt(10);
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        System.out.print("Vector a: ");
        printArray(vectorA);
        System.out.println("+");
        System.out.print("Vector b: ");
        printArray(vectorB);
        System.out.println("=");
        System.out.print("Vector c: ");
        printArray(vectorC);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
