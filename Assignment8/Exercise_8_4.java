import java.util.Scanner;

public class Exercise_8_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, sum = 0, count = 0;

        System.out.print("Enter an integer (0 to quit): ");
        while (true) {
            int number = input.nextInt();
            if (number == 0) break;
            else if (number > 0) positiveCount++;
            else negativeCount++;
            sum += number;
            count++;
        }

        double ave = count > 0 ? (double) sum / count : 0;
        System.out.println("Positive Count: " + positiveCount);
        System.out.println("Negative Count: " + negativeCount);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.1f\n", ave);
    }
}
