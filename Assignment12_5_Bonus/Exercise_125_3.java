import java.util.Scanner;
import java.util.Random;

public class Exercise_125_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Initial Size: ");
        int initialSize = scanner.nextInt();
        System.out.print("Enter New Size: ");
        int newSize = scanner.nextInt();

        int[] oldArray = new int[initialSize];
        for (int i = 0; i < initialSize; i++) {
            oldArray[i] = random.nextInt(10);
        }

        System.out.print("\nOld Array: ");
        printArray(oldArray);

        int[] newArray = resize(oldArray, newSize);

        System.out.print("New Array: ");
        printArray(newArray);
    }

    public static int[] resize(int[] oldArray, int newSize) {
        int[] newArray = new int[newSize];
        for (int i = 0; i < Math.min(oldArray.length, newArray.length); i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
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
