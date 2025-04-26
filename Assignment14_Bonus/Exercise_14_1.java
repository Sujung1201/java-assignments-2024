import java.util.Scanner;

public class Exercise_14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int gcd = findGCD(m, n);
        System.out.println("GCD is: " + gcd);
    }

    public static int findGCD(int m, int n) {
        if (n == 0) {
            return m;
        }
        return findGCD(n, m % n);
    }
}
