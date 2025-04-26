import java.util.Scanner;

public class Exercise_6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x- and y-coordinates of point: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        double distance = Math.sqrt(x * x + y * y);

        if (distance <= radius) {
            System.out.println("Point (" + x + ", " + y + ") is inside the circle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is outside the circle");
        }
    }
}
