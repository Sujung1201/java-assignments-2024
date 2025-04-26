import java.util.Scanner;
import java.util.Random;

public class Exercise_9_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("How many random numbers? ");
        int numbers = input.nextInt();
        System.out.print("How many per line? ");
        int line = input.nextInt();
        System.out.println();

        for (int i = 1; i <= numbers; i++) {
                System.out.printf("%3d", random.nextInt(90) + 10);

                if (i % line == 0) {
                    System.out.println();
            }
        }
    }
}