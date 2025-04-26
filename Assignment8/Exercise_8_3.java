import java.util.Scanner;

public class Exercise_8_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting temperature: ");
        int start = input.nextInt();
        System.out.print("Enter ending temperature: ");
        int end = input.nextInt();

        System.out.println("Fahrenheit\tCelsius");

        for (int f = start; f <= end; f++) {
            double celsius = (f - 32) * 5.0 / 9.0;
            System.out.printf("%d\t%.1f\n", f, celsius);
        }
    }
}
