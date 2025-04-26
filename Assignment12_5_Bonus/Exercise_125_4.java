import java.util.Scanner;
import java.util.Random;

public class Exercise_125_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter First Size: ");
        int sizeA = scanner.nextInt();
        System.out.print("Enter Second Size: ");
        int sizeB = scanner.nextInt();

        int[] arrayA = new int[sizeA];
        int[] arrayB = new int[sizeB];

        for (int i = 0; i < sizeA; i++) {
            arrayA[i] = random.nextInt(10);
        }
        for (int i = 0; i < sizeB; i++) {
            arrayB[i] = random.nextInt(10);
        }

        System.out.print("\nArray a: ");
        printArray(arrayA);
        System.out.print("Array b: ");
        printArray(arrayB);

        int[] arrayC = concatenate(arrayA, arrayB);

        System.out.print("Array c: ");
        printArray(arrayC);
    }

    public static int[] concatenate(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
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
