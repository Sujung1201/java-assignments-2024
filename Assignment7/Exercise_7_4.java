import java.util.Random;

public class Exercise_7_4 {
    public static void main(String[] args) {
        Random random = new Random();

        int digits = random.nextInt(1000);

        char letter1 = (char) (random.nextInt(26) + 'A');
        char letter2 = (char) (random.nextInt(26) + 'A');
        char letter3 = (char) (random.nextInt(26) + 'A');

        System.out.printf("%03d %c%c%c\n", digits, letter1, letter2, letter3);
    }
}
