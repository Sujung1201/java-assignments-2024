import java.util.Scanner;
public class Exercise_4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Present Value: ");
        double pv = input.nextDouble();
        System.out.print("Enter Annual Interest Rate: ");
        double r = input.nextDouble() / 100 / 12;
        System.out.print("Enter Number of Years: ");
        double n = input.nextDouble();

        double fv = pv * Math.pow(1+r, 12*n);
        System.out.println("Future Value: $" + fv);
    }
}
