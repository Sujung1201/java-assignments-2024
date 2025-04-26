import java.util.Random;
import java.util.Scanner;

public class Exercise_6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your hand (0 = Rock, 1 = Paper, 2 = Scissors): ");
        int player = scanner.nextInt();
        int computer = random.nextInt(3);

        System.out.println("Computer played " + (computer == 0 ? "Rock" : computer == 1 ? "Paper" : "Scissors"));

        if (player == computer) {
            System.out.println("It's a tie!");
        } else if ((player == 0 && computer == 2) ||
                (player == 1 && computer == 0) ||
                (player == 2 && computer == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
