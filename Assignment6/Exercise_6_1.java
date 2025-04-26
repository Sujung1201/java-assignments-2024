import java.util.Random;

public class Exercise_6_1 {
    public static void main(String[] args) {
        Random random = new Random();
        String result = random.nextBoolean() ? "Heads" : "Tails";
        System.out.println(result);
    }
}
