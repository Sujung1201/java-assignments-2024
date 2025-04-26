import java.util.Scanner;
public class Exercise_4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Weight: ");
        double weight = input.nextDouble();
        System.out.print("Enter Height: ");
        double height = input.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        System.out.println("BMI: " + bmi);
    }
}
