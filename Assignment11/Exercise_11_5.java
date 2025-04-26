import java.util.Scanner;

public class Exercise_11_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = input.nextInt();

        System.out.println();
        System.out.println("s(" + i + ") = " + s(i));
    }

    public static double s(int i) {
        double sum = 0.0;
        for (int k = 1; k <= i; k++) {
            sum += (double) k / (k + 1);
        }
        return sum;
    }
}