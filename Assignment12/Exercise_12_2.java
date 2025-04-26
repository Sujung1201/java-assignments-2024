import java.util.Scanner;

public class Exercise_12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[26];
        char letter;

        System.out.print("Enter lowercase letters (or ! to quit): ");

        while ((letter = scanner.next().charAt(0)) != '!') {
            if (letter >= 'a' && letter <= 'z') {
                counts[letter - 'a']++;
            }
        }

        System.out.println("\nCounts:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((char) ('a' + i) + "\t" + counts[i]);
            }
        }
    }
}
