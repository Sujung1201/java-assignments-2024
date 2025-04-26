public class Exercise_9_3 {
    public static void main(String[] args) {
        double sum1 = 0;
        for (int i = 1; i <= 100000; i++) {
            sum1 += (1.0 / i);
        }

        double sum2 = 0;
        for (int i = 100000; i >= 1; i--) {
            sum2 += (1.0 / i);
        }

        System.out.println("Left to Right: " + sum1);
        System.out.println("Right to Left: " + sum2);
    }
}
