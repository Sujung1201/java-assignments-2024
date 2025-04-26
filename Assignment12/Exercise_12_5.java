import java.util.Scanner;

public class Exercise_12_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];

        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double mean = mean(numbers);
        double deviation = deviation(numbers, mean);

        System.out.printf("\nMean: %.1f", mean);
        System.out.printf("\nDeviation: " + deviation);
    }

    public static double mean(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static double deviation(double[] numbers, double mean) {
        double sum = 0;
        for (double number : numbers) {
            sum += Math.pow(number - mean, 2);
        }
        return Math.sqrt(sum / (numbers.length - 1));
    }
}
