import java.util.Scanner;
public class Exercise_4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Actual Temperature: ");
        double T_a = input.nextDouble();
        System.out.print("Enter Wind Speed: ");
        double v = input.nextDouble();

        double T_wc = 35.74 + 0.6215*T_a - 35.75*Math.pow(v, 0.16) + 0.4275*T_a*Math.pow(v, 0.16);
        System.out.println("Wind Chill: " + T_wc);
    }
}
