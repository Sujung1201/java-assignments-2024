import java.util.Scanner;

public class Exercise_14_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Reverse: ");
        printReverse(input, input.length() - 1);
        System.out.println();
    }

    public static void printReverse(String s, int last) {
        if (last < 0) {
            return;
        }
        System.out.print(s.charAt(last));
        printReverse(s, last - 1);
    }
}
