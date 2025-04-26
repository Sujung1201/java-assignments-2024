public class Exercise_8_1 {
    public static void main(String[] args) {
        System.out.println("pounds\tkilograms");
        for (int pounds = 1; pounds <= 100; pounds++) {
            double kilograms = pounds * 0.4536;
            System.out.printf("%d\t%.3f%n", pounds, kilograms);
        }
    }
}
