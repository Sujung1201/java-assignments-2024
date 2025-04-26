import java.util.Scanner;

public class Exercise_10_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter CD amount: ");
        double CD = input.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthInterestRate = annualInterestRate / 12 / 100;

        System.out.print("Enter maturity time (in months): ");
        int maturityTime = input.nextInt();

        System.out.println("\nMonths\tValue");
        double value = CD;
        for (int i = 1; i <= maturityTime; i++) {
            value += value * monthInterestRate;
            System.out.printf("%d\t\t%.2f\n", i, value);
        }
    }
}
