import java.util.Scanner;

public class Exercise_10_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter s2: ");
        String s2 = input.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Strings different lengths.");
        } else {
            System.out.print("Result: ");
            for (int i = 0; i < s1.length(); i++) {
                System.out.print(s1.charAt(i) == s2.charAt(i) ? "_" : "*");
            }
        }
    }
}
