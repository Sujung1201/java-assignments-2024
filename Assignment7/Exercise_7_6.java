import java.util.Scanner;

public class Exercise_7_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter circle1's center x- and y-coordinates: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter circle1's radius: ");
        double r1 = scanner.nextDouble();

        System.out.print("Enter circle2's center x- and y-coordinates: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.print("Enter circle2's radius: ");
        double r2 = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distance <= Math.abs(r1 - r2)) {
            System.out.println("circle2 is inside circle1");
        } else if (distance <= r1 + r2) {
            System.out.println("circle2 overlaps circle1");
        } else {
            System.out.println("circle2 is outside circle1");
        }

        scanner.close();
    }
}
