import java.util.Scanner;

public class Exercise_8_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String result = "";
        while (true) {
            System.out.print("Enter a string (q to quit): ");
            String s = input.nextLine();
            if (s.equals("q")) break;
            else result += s;
        }

        System.out.println("\nResult: " + result);
    }
}
