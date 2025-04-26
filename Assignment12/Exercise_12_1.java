import java.util.Scanner;

public class Exercise_12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[101];
        int number;

        System.out.print("Enter integers between 0 and 100 (or -1 to quit): ");

        while ((number = scanner.nextInt()) != -1) {
            if (number >= 0 && number <= 100) {
                counts[number]++;
            }
        }

        System.out.println("\nCounts:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println(counts[i] + "\t" + i + "s");            }
        }
    }
}
