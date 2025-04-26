import java.util.Scanner;
public class Exercise_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter pounds: ");
        double pounds = input.nextDouble();

        double kg = pounds * 0.4536;

        System.out.println(pounds + " lb is " + kg + " kg");
    }
}
