import java.util.Scanner;

public class Exercise_5_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        double result = Math.pow(b, 2) - (4 * a * c);
        double S1 = (-b + Math.sqrt(result)) / (2 * a);
        double S2 = (-b - Math.sqrt(result)) / (2 * a);

        if (result > 0) {
            System.out.println("Two real solutions: " + S1 + " and " + S2);
        } else if (result == 0) {
            System.out.println("One real solutions: " + S1);
        } else {
            System.out.println("No real solutions");
        }
    }
}
