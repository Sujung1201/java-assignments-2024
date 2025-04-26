import java.util.Scanner;

public class Exercise_5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = input.nextInt();

        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }
    }
}
