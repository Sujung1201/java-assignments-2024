public class Exercise_9_5 {
    public static void main(String[] args) {
        double x = 0;
        System.out.println("Iterations\tApproximations");

        for (int i = 1; i <= 1000000; i++) {
            x += Math.pow(-1, i + 1) / (double)(2 * i - 1);
            double pi = 4 * x;

            if (i % 100000 == 0) {
                System.out.println(i + "\t\t" + pi);
            }
        }
    }
}