import java.util.Scanner;

public class Exercise_7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double RADIUS = 6371.01; // 지구의 반지름 (km)

        System.out.print("Enter a phi1 and lambda1: ");
        double phi1 = Math.toRadians(scanner.nextDouble());
        double lambda1 = Math.toRadians(scanner.nextDouble());

        System.out.print("Enter a phi2 and lambda2: ");
        double phi2 = Math.toRadians(scanner.nextDouble());
        double lambda2 = Math.toRadians(scanner.nextDouble());

        double distance = RADIUS * Math.acos(Math.sin(phi1) * Math.sin(phi2) +
                Math.cos(phi1) * Math.cos(phi2) * Math.cos(lambda1 - lambda2));

        System.out.println("Distance is: " + distance);

        scanner.close();
    }
}
