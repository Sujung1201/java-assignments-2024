import java.util.Scanner;

public class Exercise_5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first nine digits of an ISBN: ");
        String ISBN = input.nextLine();

        int intNumber = Integer.parseInt(ISBN);

        int d9 = intNumber % 10;
        int d8 = (intNumber / 10) % 10;
        int d7 = (intNumber / 100) % 10;
        int d6 = (intNumber / 1000) % 10;
        int d5 = (intNumber / 10000) % 10;
        int d4 = (intNumber / 100000) % 10;
        int d3 = (intNumber / 1000000) % 10;
        int d2 = (intNumber / 10000000) % 10;
        int d1 = (intNumber / 100000000) % 10;

        int d10 = (d1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11;

        if (d10 == 10) {
            System.out.println("ISBN: " + ISBN + "x");
        } else {
            System.out.println("ISBN: " + ISBN + d10);
        }
    }
}
