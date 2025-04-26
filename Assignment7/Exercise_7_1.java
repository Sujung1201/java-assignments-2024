import java.util.Random;

public class Exercise_7_1 {
    public static void main(String[] args) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        Random random = new Random();
        int randomMonth = random.nextInt(12);
        System.out.println(months[randomMonth]);
    }
}
