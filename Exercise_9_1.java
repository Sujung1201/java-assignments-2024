import java.util.Scanner;

public class Exercise_9_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int count = s.length();

        System.out.print("Reverse: ");
        for (int i = count-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
