import java.util.Scanner;

public class Exercise_115_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = input.nextDouble();
        System.out.print("Enter Mean: ");
        double mu = input.nextDouble();
        System.out.print("Enter Variance: ");
        double sigma2 = input.nextDouble();

        System.out.println("\nProbability: " + normal(x, mu, sigma2));
    }

    public static double normal(double x, double mu, double sigma2) {
        return (1 / Math.sqrt(2 * Math.PI * sigma2)) *
                Math.exp(-Math.pow(x - mu, 2) / (2 * sigma2));
    }
}
