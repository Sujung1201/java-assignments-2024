import java.util.Scanner;
public class Exercise_3_2 {
    public static void main(String[] args) {
        System.out.print("Enter miles: ");
        Scanner input = new Scanner(System.in);
        double miles = input.nextDouble();

        double km = miles * 1.609;

        System.out.println(miles + " miles is " + km + " km");
    }
}
