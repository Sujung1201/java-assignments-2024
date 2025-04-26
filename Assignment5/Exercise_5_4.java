import java.util.Scanner;

public class Exercise_5_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the dollars to yen exchange rate: ");
        double rate = input.nextDouble();

        System.out.print("Convert from dollars to yen (1) or from yen to dollars (2) : ");
        int option = input.nextInt();

        if (option == 1) {
            System.out.print("Enter dollar amount: ");
            double dollar = input.nextDouble();
            double yen = dollar * rate;
            System.out.println("$" + dollar + " is ¥" + yen);
        } else if (option == 2){
            System.out.print("Enter yen amount: ");
            double yen = input.nextDouble();
            double dollar = yen * (1/rate);
            System.out.println("¥" + yen + " is $" + dollar);
        } else {
            System.out.println("Invalid option");
        }
    }
}
