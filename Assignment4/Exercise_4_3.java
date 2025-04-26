import java.util.Scanner;
public class Exercise_4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        double t = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
        double d = Math.sqrt(t);
        System.out.println("Enter x1: " + d);
    }
}
