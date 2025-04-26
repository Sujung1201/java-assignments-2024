import java.util.Scanner;

public class Exercise_9_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting integer: ");
        int start = input.nextInt();
        System.out.print("Enter ending integer: ");
        int end = input.nextInt();
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }
}
