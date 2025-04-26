import java.util.Scanner;

public class Exercise_10_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter max: ");
        int max = input.nextInt();
        System.out.println();

        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                double c = Math.sqrt(i * i + j * j);
                if (c <= max && c == (int)c) {
                    System.out.printf("(%d, %d, %d)\n", i, j, (int)c);
                }
            }
        }
    }
}
