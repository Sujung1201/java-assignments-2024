import java.util.Scanner;
public class Exercise_3_3 {
    public static void main(String[] args) {
        System.out.print("Enter a Fahrenheit temperature: ");
        Scanner input = new Scanner(System.in);
        double F = input.nextDouble();

        double C = (F - 32)  * (5.0 / 9.0);
        System.out.println(F + " F is " + C + " C");
    }
}
