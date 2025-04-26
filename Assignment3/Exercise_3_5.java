import java.util.Scanner;
public class Exercise_3_5 {
    public static void main(String[] args) {
        System.out.print("Enter Subtotal: ");
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();

        System.out.print("Enter Tip Rate: ");
        double tip_rate = input.nextDouble();

        double tip = (subtotal/100) * tip_rate;

        System.out.println("Tip: $" + tip);
        System.out.println("Total: $ " + (subtotal + tip));

    }
}