import java.util.Scanner;

public class Exercise_10_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter message: ");
        String s = input.nextLine();
        System.out.print("Enter code: ");
        int code = input.nextInt();

        System.out.print("Encoded message: ");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.print(' ');
            } else {
                char changeCh = (char)('a' + (s.charAt(i) - 'a' + code) % 26);
                System.out.print(changeCh);
            }
        }
    }
}
