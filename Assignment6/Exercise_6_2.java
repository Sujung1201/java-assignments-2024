import java.util.Random;

public class Exercise_6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        int sum = die1 + die2;
        System.out.println("First die: " + die1);
        System.out.println("Second die: " + die2);
        System.out.println("Sum: " + sum);
    }
}