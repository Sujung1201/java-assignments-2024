import java.util.Scanner;
import java.util.Random;

public class Exercise_125_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Size: ");
        int size = scanner.nextInt();
        System.out.print("Enter Index: ");
        int index = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.print("\nArray: ");
        printArray(array);

        int[] updatedArray = removeAt(array, index);

        System.out.print("Updated Array: ");
        printArray(updatedArray);
    }

    public static int[] removeAt(int[] array, int index) {
        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
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
