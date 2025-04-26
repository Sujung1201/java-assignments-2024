import java.util.Scanner;

public class Exercise_14_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int sum = addDigits(number);
        System.out.println("addDigits(" + number + ") = " + sum);
    }

    public static int addDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) + addDigits(number / 10);
    }
}
