import java.util.Scanner;
public class Exercise_3_4 {
    public static void main(String[] args) {
        System.out.print("Enter Exchange Rate: ");
        Scanner input = new Scanner(System.in);
        double exchange_rate = input.nextDouble();

        System.out.print("Enter Dollars: ");
        double dollars = input.nextDouble();

        double exchange_dollars = exchange_rate * dollars;

        System.out.println("$" + dollars + " nis ¥ " + exchange_dollars);
    }
}
