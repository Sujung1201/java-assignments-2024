import java.util.Scanner;

public class Exercise_7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() - 1);
        int length = input.length();

        System.out.println("First: " + firstChar);
        System.out.println("Last: " + lastChar);
        System.out.println("Count: " + length);

        scanner.close();
    }
}
