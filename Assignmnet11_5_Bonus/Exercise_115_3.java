import java.util.Scanner;

public class Exercise_115_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = input.nextLine();
        System.out.print("Enter Number: ");
        int n = input.nextInt();

        System.out.println("\nResult: " + multiply(s, n));
    }

    public static String multiply(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(s);
        }
        return result.toString();
    }
}
