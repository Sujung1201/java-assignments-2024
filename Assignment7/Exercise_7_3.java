import java.util.Scanner;

public class Exercise_7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String input = scanner.nextLine();
        char letter = input.charAt(0);

        if (!Character.isLetter(letter)) {
            System.out.println(letter + " is not a letter");
        } else {
            letter = Character.toLowerCase(letter);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        }

        scanner.close();
    }
}
